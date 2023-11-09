package day1109.test6.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestMainAnooEx6 {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appcontext2.xml");
		
		//AnnoCar car1 = (AnnoCar)ctx.getBean("annoCar"); 
		AnnoCar car1 = (AnnoCar)ctx.getBean("mycar"); //Annocar ���� ���� @Component("mycar")�� �ٲ���� ������

		car1.myCarInfo();
	}

}
