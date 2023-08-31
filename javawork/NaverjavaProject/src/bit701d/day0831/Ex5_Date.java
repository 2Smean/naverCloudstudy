package bit701d.day0831;

import java.util.Calendar;
import java.util.Date;

public class Ex5_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바에서 시간이나 날짜 출력하는 방법 
		Date date=new Date();
		int year=date.getYear()+1900;
		int month=date.getMonth()+1;
		int day=date.getDate();
		
		int hh= date.getHours();
		int mm= date.getMinutes();
		int ss= date.getSeconds();
		
		// %2d : 두자리 수 남는자리가 있으면 공백으로 채움
		System.out.printf("현재 년도 : %d-%2d-%2d\n",year,month,day);
		// %02d : 두자리수 남는자리가 있으면 0으로 채움
		System.out.printf("현재 년도 : %d-%02d-%02d\n",year,month,day);
		System.out.printf("현재 시간 :%02d:%02d:%02d\n",hh,mm,ss);
		
		System.out.printf("Calendar 클래스를 이용해서 시간, 날짜 구하기");
//		Calendar cal=new Calendar(); 오류, 생성자가 public이 아니기때문에 생성 안됨 new로 만들수 없어서
		//생성자를 막아놓은 경우 임 protected 때문에 안되고 (public=모두 공개)이여야 함
		Calendar cal=Calendar.getInstance();
		year=cal.get(Calendar.YEAR);
		month=cal.get(Calendar.MONTH)+1;//0-11 의 값을 반환
		day=cal.get(Calendar.DATE);
			
			System.out.printf("현재 년도 : %d-%02d-%02d\n",year,month,day);
			
			//요일 구하기 
			int weekint=date.getDay();//0:일 , 1:월 ....6:토
			System.out.println("요일숫자:"+weekint);
			
			String week=weekint==0?"일":weekint==1?"월": weekint==2?"화": weekint==3?"수":
										weekint==4?"목": weekint==5?"금":"토";
			System.out.println("오늘은 "+week+"요일입니다");
				
	}

}

