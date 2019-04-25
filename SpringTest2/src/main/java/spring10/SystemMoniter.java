package spring10;

//byType,byName을 이용
public class SystemMoniter {
    //has a 관계  byType->PhoneCall과 같은 자료형의 객체를 찾아서 
	//                               멤버변수에 넣어주세요
	/* (1) byType
	private PhoneCall call;
	
	public void setCall(PhoneCall call) {
		this.call = call;
		System.out.println("setCall()호출(call)=>"+call);
	}
      */
	//(2)byName
     private PhoneCall phonecall;//멤버변수의 이름으로 찾기
	
	public void setPhonecall(PhoneCall phonecall) {
		this.phonecall = phonecall;
		System.out.println("setPhonecall()호출(phonecall)=>"+phonecall);
	}

	//----------------------------------------------------------------
	public String toString() {
		return "Systemmoniter[phonecall="+phonecall+"]";
	}
}



