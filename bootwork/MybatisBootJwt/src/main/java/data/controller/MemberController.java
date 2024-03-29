package data.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import data.dto.MemberDto;
import data.service.MemberService;
import lombok.RequiredArgsConstructor;
import naver.storage.NcpObjectStorageService;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class MemberController {
	
	private final MemberService memberService;
	
	//스토리지 변수 
	private final NcpObjectStorageService storageService;
	
	//비밀번호 암호화를 위한 변수 선언 
	private final PasswordEncoder passwordEncoder;
	
	private String bucketName = "bitcamp-lsm";
	private String folderName = "reactboot";
	
	//업로드한 파일명을 저장할 변수
	private String uploadFilename;
	
	//페이징 처리할까봐 
	@GetMapping("/member/list")
	public Map<String, Object> list()
	{
		Map<String, Object> map = new HashMap<>();
		int totalCount = memberService.getTotalCount();
		List<MemberDto> mlist = memberService.getAllMembers();
		
		map.put("totalCount", totalCount);
		map.put("mlist", mlist);
		return map;
	}
	
	//가입시 사진 저장 미리보기 처럼 출력 
	@PostMapping("/member/upload")
	public String uploadFile(@RequestParam("upload") MultipartFile upload)
	{
		uploadFilename = storageService.uploadFile(bucketName, folderName, upload);
		return uploadFilename;
	}
	
	@PostMapping("/member/insert")
	public String insert (@RequestBody MemberDto dto)
	{
		//pass 는 암호화해서 db에 저장 
		String pass = dto.getPass();
		String pass1 = passwordEncoder.encode(pass);
		System.out.println("비번 암호화됨:"+pass1);
		
		// dto 의 pass 를 암호화된 pass 로 변경 
		dto.setPass(pass1);
		
		//업로드된 사진 
		dto.setPhoto(uploadFilename);
		
		memberService.insertMember(dto);
		uploadFilename = null;
		return "success";
	}
	
	//아이디가 db 에 존재하면 1, 존재하지 않을 경우 0이 반환이된다
	@GetMapping("/member/idcheck")
	public int idcheck (@RequestParam ("myid") String myid)
	{
		return memberService.getIdCheck(myid);
	}

	@DeleteMapping("/member/delete")
	public void delete(@RequestParam("num") int num)
	{
		// db 삭제전에 스토리지의 사진부터 먼저 삭제 
		String dbPhotoname = memberService.getMember(num).getPhoto();
		storageService.deleteFile(bucketName, folderName, dbPhotoname);
		
		// db 삭제 
		memberService.deleteMember(num);
	}
}
