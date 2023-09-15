package bit701.day0914;

public class QQQ {

	public static void print2d(int m[][]) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j]+"\t"); //'t'로 해버리면 문자가 되어버려서 유니코드 값으로 계산이 된다 
			}
			System.out.println();
		}
		
	}
	
	public static int [][] makeArray() {//이차원 배열의 레퍼런스 리턴
		int[][] m = new int [3][];
		m[0] = new int [3];
		m[1] = new int [7];
		m[2] = new int [10];
		
		return m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[][];//2차원 정수 배열을 가리키는 레퍼런스 배열 n 선언 
		
		n=makeArray();
		
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				n[i][j] = i*j;
			}
		}
		print2d(n);
		
	}

}
