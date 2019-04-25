package spring6;

import java.util.List;

//의존객체->List형의 객체를 어떻게 가져오는지?
public class PerformanceMoniter {

	private List<Double> number;//성능의 차이

	public void setNumber(List<Double> number) {
		this.number = number;
		System.out.println("setNumber() 호출=>"+number);
	}
	/*
	public String toString() {
		return "PerformanceMoniter[number="+number+"]";
	}
	*/
}





