package anno2;

import javax.inject.Inject; //@Inject을 사용하기위한 관련된 클래스 import

import org.springframework.beans.factory.annotation.Autowired;

//문자를 전송->기간을 정하기
public class SystemMoniter {

	private long periodTime;//기간
	//has a 관계
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime;
	}
	//멤버변수에 적용->Setter Method호출하지 않아도 된다.(코드작성 시간이 줄어듬(개발시간단축)
	//@Autowired(required=false)
	@Inject
	private SmsSender sender;
	
	/*  
	//@Autowired
	public void setSender(SmsSender sender) {
		this.sender = sender;
		System.out.println("@Autowired때문에 자동 setSender()호출됨!=>"+sender);
	} */
	
	public String toString() {
		return "Systemmoniter[periodTime="+periodTime+",sender="+sender+"]";
	}
}



