package spring8;

import java.util.Properties;

//서버에 접속->ip주소,접속시간 제한->Properties
public class BookClient {
   
	private Properties prop;//다양한 자바의 객체자료형에 맞게 설정?

	public void setProp(Properties prop) {
		this.prop = prop;
		System.out.println("setProp()호출됨!=>"+prop);
	}
	
	public String toString() {
		return "BookClient의 객체생성시 [prop="+prop+"]";
	}
}
