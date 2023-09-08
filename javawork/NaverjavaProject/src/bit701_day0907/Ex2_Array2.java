package bit701_day0907;

public class Ex2_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 선언 방법
		int [][]arr=new int[2][3];
		System.out.println("행 갯수:"+arr.length);
		System.out.println("0번의 열갯수:"+arr[0].length);
		System.out.println("1번의 여랫수:"+arr[1].length);

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf("[%d][%2d]=%d ",i,j,arr[i][j]);
			}
			System.out.println();
			arrayWrite(arr);

			//2번째 방법
			int [][]arr2= {
					{1,2},{3,4,5,},{10,20,30,40}
			}; // 0번행 열갯수  : 2 , 1번행 열갯수 :3 ...

			System.out.println("** 2번째 배열 출력 **");
			arrayWrite(arr2);
			
			//3번째 방법 
			int [][]arr3;
			arr3=new int[][] {{1,2},{1,2,3},{4,5,6,7}};
			System.out.println("** 3번째 배열 출력 **");
			arrayWrite(arr3);
			
		}
	}


	public static void arrayWrite(int [][]arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf("[%d][%2d]=%d ",i,j,arr[i][j]);
			}
			System.out.println();
		}


	}


}


