package anno3;

import javax.annotation.Resource;//@Resource와 연관이 있는 클래스를 불러온다.

//같은 클래스 자료형이 여러개 있을때 어떻게 구분해서 각각의 객체를
//가져올 수 있는가? =>@Resource 어노테이션을 사용하면 된다.->멤버변수위에, 메서드위에

public class HomeController {
     
	 @Resource(name="camera2")
	 private Camera camera2; //<bean id="camera2" class="anno3.Camera"~/>
	 
	 private Camera camera3;
	 private Camera camera4;
	 /*
	  * 형식) @Resource(name="빈즈의 구분자id")->멤버변수에 적용->setXXX 메서드 생략가능
	  *                                                              ->자동으로 연결할 의존객체를 얻어올때 사용
	  * 
	  */
	 /*
	public void setCamera2(Camera camera2) {
		this.camera2 = camera2;
	} */
	 @Resource(name="camera3")
	public void setCamera3(Camera camera3) {
		this.camera3 = camera3;
		System.out.println("setCamera3() 호출됨!");
	}
	 
	 @Resource(name="camera4")
	public void setCamera4(Camera camera4) {
		this.camera4 = camera4;
		System.out.println("setCamera4() 호출됨!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "HomeController[camera2="+camera2+",camera3="+camera3
				   +",camera4="+camera4+"]";
	}
	
}
