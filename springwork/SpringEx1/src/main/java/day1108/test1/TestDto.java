package day1108.test1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


//import lombok 이 뜨면 lombok이 잘 설치 된것임 

//@Setter
//@Getter
//@ToString

//위의 3개의 어노테이션을 하나의 어노테이션으로 표현이 가능하다 
@Data

@NoArgsConstructor//디폴트 생성자
@AllArgsConstructor //모든 멤버를 파라미터로 받는 생성자 (전체파라미터 받는 생성자)
@RequiredArgsConstructor // 필요한 인자만 생성자로 주입(Injection) 규칙이 있다 -@NonNull 인자만 주입

public class TestDto {
	@NonNull
	private String name;
	private String addr;
	private int age;
}
