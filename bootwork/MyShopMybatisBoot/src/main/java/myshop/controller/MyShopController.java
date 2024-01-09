package myshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import myshop.data.MyShopDto;
import myshop.service.MyShopService;
import naver.storage.NcpObjectStorageService;

@Controller
@RequiredArgsConstructor
public class MyShopController {
	private final MyShopService shopService;
	//storage class 선언
	private final NcpObjectStorageService storageService;
	
	//버켓네임 지정
	private String bucketName = "bitcamp-lsm";
	//저장할 폴더네임 지정 
	private String folderName = "bootmyshop";
	
	@GetMapping("/")
	public String list(Model model)
	{
		//총갯수를 얻어온다 
		int totalCount = shopService.getTotalCount();
		//model 에 저장한다
		model.addAttribute("totalCount", totalCount);
		return "myshop/shoplist";
	}
	
	@GetMapping("/form")
	public String form()
	{
		return "myshop/shopform";
	}

	@PostMapping("/insert")
	public String insert(@ModelAttribute MyShopDto dto, @RequestParam ("upload") MultipartFile upload)
	{
		//네이버 스토리지에 업로드 후 저장된 파일명을 리턴받아서 dto 의 photo 에 저장
		String photo = storageService.uploadFile(bucketName, bucketName, upload);
		dto.setPhoto(photo);
		//db 에 insert
		shopService.insertShop(dto);
		
		return "redirect:./";
	}
}
