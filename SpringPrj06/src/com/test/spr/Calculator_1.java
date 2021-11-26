/*====================================
	Calculator_1.java
	- 인터페이스
===================================*/

package com.test.spr;


// ※ 스프링에서 AOP 기법을 적용하기 위해서는
//    대상 객체가 인터페이스를 구현하고 있어야 한다.
public interface Calculator_1
{
	public int add(int x, int y);
	public int sub(int x, int y);
	public int multi(int x, int y);
	public int div(int x, int y);
}