package spring8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring2.MessageBeanDI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.xml파일이 여러개 존재->배열로 관리->파일명부여=->resource 자동 인식
	    String [] configLocation=new String[] {"applicationContext.xml"};
		
		//2.xml파일을 읽어들임 =>메모리 관리까지 처리해주는 객체가 필요
	    AbstractApplicationContext context=
	    		  new ClassPathXmlApplicationContext(configLocation);
	    //3.JVM이 종료될때 context객체도 같이 종료(메모리 해제)
	    context.registerShutdownHook();
	    
	    BookClient book=context.getBean("bookClient",BookClient.class);
		System.out.println("book=>"+book);
		
		//5.JVM이 종료
		context.close();//JVM이 종료시 컨테이너에 존재하는 모든 빈(객체)도 종료(메모리 해제)
	}
}





