package day1108.test4;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//생성자 주입을 안받을 것이라서 생성자가 없다
public class Student {
	private String name;
	private String blood;
	private int age;
}
