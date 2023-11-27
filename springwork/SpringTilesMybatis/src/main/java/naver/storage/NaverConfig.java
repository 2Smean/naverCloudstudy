package naver.storage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Setter
@Getter
public class NaverConfig {
	
	@Value("https://kr.object.ncloudstorage.com")
	private String endPoint;
	
	@Value("kr-standard")
	private String regionName;
	
	@Value("GqY4EmFkMSt2svJI36kR") //�� db ������Ű 
	private String accessKey;
	
	@Value("9AAlnuxv695iX3x8eFyl76gMFvpL8z5rSUeetHny") //�� db ��ũ��Ű 
	private String secretKey;
	
		//@Value("8yt6c0uo9is9HLAN1BZH") //���� db
	//private String accessKey;
	
	//@Value("tmFGzatUiqw0C91hSR9Cx9jwPX5DWSzwLFRn3XC0") //���� db
	//private String secretKey;

}
