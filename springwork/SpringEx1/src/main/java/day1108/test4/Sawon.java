package day1108.test4;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor // 전부 생성자 몽땅 생성자 파라미터있는 생성자
@Getter
public class Sawon {
	private String name;
	private String city;
	private List<String> hobby;

}
