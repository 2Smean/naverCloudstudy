package day1109.test6.anno;

import org.springframework.stereotype.Component;

@Component  //xml에 자동으로 bean 등록 - id 가 클래스명이 아이디가 된다 ( 첫글자 소문자 : annoKoreaTire)
public class AnnoKoreaTire implements AnnoTire {

	@Override
	public String getTireName() {
		// TODO Auto-generated method stub
		return "어노테이션 한국타이어";
	}

}
