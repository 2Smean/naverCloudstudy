//시험점수가 80점 이상이라면 합격 판별을 이하라면 불합격을 주시오
package bit701.day0911;

import java.util.Scanner;

public class QQq{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("시험점수를 입력하세요");
		int i=sc.nextInt();
		
		if(i%2==0) {
			System.out.println(i+"짝수입니다");
		}else
			System.out.println(i+"홀수입니다!");
		
		
	}
}