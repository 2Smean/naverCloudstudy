package bit701.day0914;

public class QQQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[][];//2차원 정수 배열을 가리키는 레퍼런스 배열 n 선언 
		n = new int [2][4];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				n[i][j] = i*j;
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
