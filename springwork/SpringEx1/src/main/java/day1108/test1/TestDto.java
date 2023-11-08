package day1108.test1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


//import lombok �� �߸� lombok�� �� ��ġ �Ȱ��� 

//@Setter
//@Getter
//@ToString

//���� 3���� ������̼��� �ϳ��� ������̼����� ǥ���� �����ϴ� 
@Data

@NoArgsConstructor//����Ʈ ������
@AllArgsConstructor //��� ����� �Ķ���ͷ� �޴� ������ (��ü�Ķ���� �޴� ������)
@RequiredArgsConstructor // �ʿ��� ���ڸ� �����ڷ� ����(Injection) ��Ģ�� �ִ� -@NonNull ���ڸ� ����

public class TestDto {
	@NonNull
	private String name;
	private String addr;
	private int age;
}
