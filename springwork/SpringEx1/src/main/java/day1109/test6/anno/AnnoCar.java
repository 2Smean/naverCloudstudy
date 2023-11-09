package day1109.test6.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component //id:annoCar //id: ù���� �ҹ��� annoCar
@Component("mycar") //id�� "mycar"�� �ȴ� (������� ������ class name �� �ȴ� 
public class AnnoCar {
	
	//@Autowired //�ڵ� ���� - ���� �߻� : ��Ī ������ Ŭ������ 2���̹Ƿ� ������ �߻�  //�ñ��Ѱ� Autowired �� �� Ŭ���� ���ο�?
	//AnnoTire annoTire;
	
	//�������̽��� ������ Ŭ������ ������ �� ��� ��Ȯ�ϰ� Ŭ���������� �����ϸ� �ȴ�
	//�����ϱ� ������ �˾Ƽ� �ڵ� ���Եȴ� (�����ؾ���, �� �ϳ�)
	@Autowired
	//AnnoKoreaTire annoTire;
	//AnnoKoreaTire annoTire;
	
	//@Resource �� �������̽��� ������ Ŭ������ �������� ��� �� ��� �����ش�(������ ��������
	//@Resource(name = "annoCanadaTire")
	@Resource(name="annoKoreaTire")
	AnnoTire annoTire;
	
	public void myCarInfo()
	{
		System.out.println("�� ���� Ÿ�̾�� "+ annoTire.getTireName()+"�Դϴ�");
	}
}
