/*==============================================
	Main_1.java 
	- main() 메소드가 포함된 테스트 클래스
	
			(프록시 사용)
=============================================*/


package com.test.spr;

import java.lang.reflect.Proxy;

public class Main_1
{
	public static void main(String[] args)
	{
		Calculator_1 cal = new CalculatorImpl_1();
		
		Calculator_1 proxy = (Calculator_1) Proxy.newProxyInstance(cal.getClass().getClassLoader()
							,cal.getClass().getInterfaces()
							, new CalculatorProxy(cal));
		
		int add = proxy.add(50,30);
		System.out.println(add);
		
		int sub = proxy.sub(50, 30);
		System.out.println(sub);
		
		int multi = proxy.multi(50, 30);
		System.out.println(multi);
		
		int div =  proxy.div(50, 30);
		System.out.println(div);
		
	}
}
