/*==============================================
	CalculatorImpl_1.java
	- 클래스.
	- Calculator 인터페이스를 구현하는 클래스.
	- 주 업무만 적용된 클래스.
=============================================*/


package com.test.spr;

public class CalculatorImpl_1 implements Calculator_1
{

	@Override
	public int add(int x, int y)
	{
		int result = 0;
		
		// 주업무 실행 내용
		result = x + y;
		System.out.printf("%d + %d = %d\n", x, y,result);
		
		return result;
	}

	@Override
	public int sub(int x, int y)
	{
int result = 0;
		
		// 주업무 실행 내용
		result = x - y;
		System.out.printf("%d - %d = %d\n", x, y,result);
		
		return result;
	}

	@Override
	public int multi(int x, int y)
	{
int result = 0;
		
		// 주업무 실행 내용
		result = x * y;
		System.out.printf("%d * %d = %d\n", x, y,result);
		
		return result;
	}

	@Override
	public int div(int x, int y)
	{
int result = 0;
		
		// 주업무 실행 내용
		result = x / y;
		System.out.printf("%d / %d = %d\n", x, y,result);
		
		return result;
	}
	

}