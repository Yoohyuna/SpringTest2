package com.spring.anno5;

import javax.annotation.*;//@Resource와 연관이 있는 클래스를 불러온다.
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("homeCvn")
public class HomeController2 {
	/*
	 * @Component("homeCvn")
          public class HomeController2
          
          스프링 컨테이너가 <bean id="homeCvn" class="com.spring.anno5.HomeController2" />
                                    로 등록
	 */
     
	@Inject
	 private Camera camera; //new Camera()
	
	@Autowired
	 private Camera2 camera2;
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "HomeController2[camera="+camera+",camera2="+camera2+"]";
	}
	 
}
