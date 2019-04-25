package com.spring.anno5;

import org.springframework.stereotype.Component;

/*
 * 빈즈에 관련된 클래스가 30개->어느 특정 패키지에 
 * 스프링 컨테이너가 어느 특정 패키지를 지정->자동적으로 그 패키지에
 *                         들어가 있는 모든 클래스를 자동적으로 빈즈객체로 
 *                         등록을 시켜주는 역할을 하는 어노테이션
 *                          ->@Component
 * <bean id="camera" class="com.spring.anno5.Camera" />
 */

@Component
public class Camera {}
