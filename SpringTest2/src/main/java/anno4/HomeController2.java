package anno4;

import javax.annotation.*;//@Resource와 연관이 있는 클래스를 불러온다.

public class HomeController2 {
     
	 private Camera camera; //new Camera()
	
	 @Resource(name="camera5")
	public void setCamera(Camera camera) {
		this.camera = camera;
		System.out.println("setCamera5이름을 가진 setCamera() 호출됨!");
	}
	 
	 @PostConstruct
	public void init() {
		System.out.println("빈즈객체 생성전에 초기화작업(init) 호출됨!");
	}
	
	 @PreDestroy
	public void close() {
		System.out.println("빈즈객체 생성후에 메모리해제(close())호출됨!");
	}
	 
}
