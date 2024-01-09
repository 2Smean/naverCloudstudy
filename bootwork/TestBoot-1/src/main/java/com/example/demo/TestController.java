package com.example.demo;

import java.util.List;
import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public List<TestDto> list()
	{
		List<TestDto> list = new Vector<>();
		
		TestDto dto1 = new TestDto("이승민" , "서울" , "010-2254-0682");
		list.add(dto1);
		
		TestDto dto2 = TestDto.builder()
				.name("이명자")
				.addr("부산")
				.hp("010-1234-1234")
				.build();
		list.add(dto2);
		return list;
	}

}
