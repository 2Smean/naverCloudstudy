package bit701.day0830;

import java.util.Scanner;

public class Exex00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//풀이 
		if(n>10000) {
			System.out.println("10000원 ="+ n/10000);
			n = n%10000;
		}

		if(n>1000) {
			System.out.println("1000원 ="+ n/1000);
			n = n%1000;
		
		}
			if(n>100) {
				System.out.println("100원 ="+ n/100);
				n = n%100;
			}	

				if(n>10) {
					System.out.println("10원 ="+ n/10);
					n = n%10;
				}
					if(n==1) {
						System.out.println("1원 ="+ n/1);
						n = n%1;
					}	
		

	}

}
