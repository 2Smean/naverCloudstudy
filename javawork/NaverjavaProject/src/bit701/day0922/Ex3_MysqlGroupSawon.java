package bit701.day0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex3_MysqlGroupSawon {
	static final String MYSQL_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String MYSQL_URL="jdbc:mysql://localhost:3306/bit701?serverTimezone=Asia/Seoul";

	Ex3_MysqlGroupSawon(){
		try {
			Class.forName(MYSQL_DRIVER);
			//System.out.println("Mysql 드라이버 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("Mysql 드라이버 실패:"+e.getMessage());
		}
	}

	public void sawonBunseok() throws SQLException
	{
		String sql="select buseo,count(*) count,max(score) maxscore,min(score),avg(score) avgscore "
				+ "from sawon group by buseo";

		Connection conn=null; // 연결 
		Statement stmt=null; //Statement : 성명 
		ResultSet rs=null; //ResultSet : 결과 값?

		try {
			conn=DriverManager.getConnection(MYSQL_URL, "root", "1234");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql); //sql문으로 ResultSet tyoe으로 가져온다 

			System.out.println("buseo\tcount\tmaxscore\tmin(score)\tavgscore");
			System.out.println("=".repeat(50));

			while(rs.next())
			{
				String bo=rs.getString("buseo");
				int cou=rs.getInt("count");
				int max=rs.getInt("maxscore");
				int min=rs.getInt("min(score)");
				double avgscore=rs.getDouble("avgscore");

				System.out.printf("%s\t%d\t%d\t%d\t%.4f\n" ,bo, cou, max, min, avgscore);
				//System.out.println(bo + "\t" + cou + "\t" + max + "\t" + min + "\t" + avgscore );
				//System.out.println("Mysql 연결 성공");
			}

		} catch (SQLException e) {
			System.out.println("Mysql 연결 실패:"+e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException|NullPointerException e) {
				// TODO Auto-generated catch block
			}
		}


	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Ex3_MysqlGroupSawon ex=new Ex3_MysqlGroupSawon();
		ex.sawonBunseok();
	}

}