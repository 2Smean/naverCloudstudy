package bit701.day0925;

import java.util.Scanner;

import db.DbConnect;

public class Ex2_MysqlSawonInsert {
	DbConnect db=new DbConnect();
	
	public void sawonInsert() {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름");
		String name=sc.nextLine();
		System.out.println("1-100 사이 점수");
		int score=Integer.parseInt(sc.nextLine());
		System.out.println("성별");
		String gender=sc.nextLine();
		System.out.println("부서");
		String buseo=sc.nextLine();
		
		String sql="";
		System.out.println(sql);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2_MysqlSawonInsert ex=new Ex2_MysqlSawonInsert();
		ex.sawonInsert();

	}

}
