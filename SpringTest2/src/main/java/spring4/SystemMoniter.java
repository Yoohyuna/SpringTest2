package spring4;

//문자를 전송->기간을 정하기
public class SystemMoniter {

	private long periodTime;//기간
	//has a 관계
	private SmsSender sender;
	
	//생성자를 통해서 의존객체를 주입
	public SystemMoniter(long periodTime,SmsSender sender) {
		this.periodTime=periodTime;
		this.sender=sender;
		System.out.println("SystemMoniter() 생성자 호출됨!");
	}
	//----------------------------------------------------------------
	public String toString() {
		return "Systemmoniter[periodTime="+periodTime+",sender="+sender+"]";
	}
}



