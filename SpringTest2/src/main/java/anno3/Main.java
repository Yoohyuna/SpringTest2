package anno3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring2.MessageBeanDI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.xml파일이 여러개 존재->배열로 관리->파일명부여=->resource 자동 인식
	    String [] configLocation=new String[] {"app2.xml"};
		
		//2.xml파일을 읽어들임 =>메모리 관리까지 처리해주는 객체가 필요
	    AbstractApplicationContext context=
	    		  new ClassPathXmlApplicationContext(configLocation);
	    //3.JVM이 종료될때 context객체도 같이 종료(메모리 해제)
	    context.registerShutdownHook();
	    
		//4.factory에서 getBean("불러올 객체를 가져오는 id값을 지정")=>형변환
	    HomeController home=context.getBean("homeController",HomeController.class);
		System.out.println("home=>"+home);
		
		//5.JVM이 종료
		context.close();
	}
}





