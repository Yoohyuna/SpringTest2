package spring12;

import javax.inject.Inject; //@Inject을 사용하기위한 관련된 클래스 import

//문자를 전송->기간을 정하기
public class SystemMoniter {

	private long periodTime;//기간
	//has a 관계
	
	@Inject
	private SmsSender sender;
	
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime;
	}
	
	/*
	public void setSender(SmsSender sender) {
		this.sender = sender;
		System.out.println("setSender()호출됨!=>"+sender);
	}
	*/
	
	public String toString() {
		return "Systemmoniter[periodTime="+periodTime+",sender="+sender+"]";
	}
}



