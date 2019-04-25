package anno1;

import org.springframework.beans.factory.annotation.Required;//@Required와 연관

public class Camera {
       
	private int number;//카메라수

	@Required  //필수로 호출해야 되는것을 알려주는 역할->에러유발
	public void setNumber(int number) {
		this.number = number;
		System.out.println("setNumber()호출됨!");
	}
	
	@Override  //메서드명 위에 기술(메서드가 오버라이딩이 제대로 됐는지체크)
	public String toString() {
		// TODO Auto-generated method stub
		return "Camera[number="+number+"]";
	}
}
