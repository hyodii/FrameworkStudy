/*==============================================
	Main.java 
	- main() 메소드가 포함된 테스트 클래스
	
			(프록시 사용)
=============================================*/


package com.test.spr;

import java.lang.reflect.Proxy;

public class Main
{
	public static void main(String[] args)
	{
		// 주 업무 실행을 할 수 있는 객체 준비
		// 인터페이스 변수 = new 인터페이스 구현 클래스();
		// List list = new ArrayList();
		Calculator cal = new CalculatorImpl();
		
		
		// 주 업무 실행에 테스트( AOP 기법 적용 전 )
		/*
		int add = cal.add(10, 20);
		System.out.println(add);
		
		int sub = cal.sub(10, 20);
		System.out.println(sub);
		
		int multi = cal.multi(10, 20);
		System.out.println(multi);
		
		int div = cal.div(10, 20);
		System.out.println(div);
		*/
		
		/*
        ------------------------------- 그 객체 기반 클래스를 전달
        ----------------주업무 실행 객체 클래스
        -- 주업무 실행 객체 
        cal.getClass().getClassLoader()
		*/
		
		/*
		      ------------------------------- 그 객체가 상속받은 모든 정보(인터페이스들)
		      ----------------주업무 실행을 위한 설계도(객체 클래스)
		      -- 주업무 실행 객체 
		      cal.getClass().getInterfaces()
		*/
		
		// 주 업무 실행에 테스트( AOP 기법 적용 후(Spring AOP 아님!) )
		Calculator proxy = (Calculator)Proxy.newProxyInstance
							( cal.getClass().getClassLoader()	// 주업무 실행 클래스에 대한 정보 전달(제공)
							, cal.getClass().getInterfaces()	// 주 업무 실행 클래스의 인터페이스에 대한 정보 전달(제공)
							, new CalculatorProxy(cal)			// 보조 업무 실행 클래스에 대한 정보 전달(제공)
							);
		

		int add = proxy.add(10, 20);
		System.out.println(add);
		
		int sub = proxy.sub(10, 20);
		System.out.println(sub);
		
		int multi = proxy.multi(10, 20);
		System.out.println(multi);
		
		int div = proxy.div(10, 20);
		System.out.println(div);
		
		
		
	}
}
