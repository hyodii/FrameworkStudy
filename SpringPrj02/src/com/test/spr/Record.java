/*=====================
	Record.java
	- 인터페이스
=====================*/

package com.test.spr;

public interface Record
{
	public void setKor(int kor);
	public int getKor();
	
	public void setEng(int Eng);
	public int getEng();
	
	public void setMat(int Mat);
	public int getMat();
	
	public int getTotal();
	
	public double getAvg();
}
