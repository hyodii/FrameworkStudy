/*==========================================
	RecordImpl1.java
	- 클래스
	- Record 인터페이스를 구현하는 클래스
==========================================*/

package com.test.spr;

//                       ------------------ 이렇게 하는 순간 이 아이는 추상클래스!
public class RecordImpl1 implements Record
{
	// 주요 속성 구성
	private int kor, eng, mat;
	
	// 우클릭 → source →override
	@Override
	public void setKor(int kor)
	{
		this.kor = kor;
	}

	@Override
	public int getKor()
	{
		return kor;
	}

	@Override
	public void setEng(int eng)
	{
		this.eng = eng;
	}

	@Override
	public int getEng()
	{
		return eng;
	}

	@Override
	public void setMat(int mat)
	{
		this.mat = mat;
	}

	@Override
	public int getMat()
	{
		return mat;
	}

	@Override
	public int getTotal()
	{
		int result = 0;
		result = this.getKor() + this.getEng() + this.getMat();
		return result;
	}

	@Override
	public double getAvg()
	{
		double result = 0;
		result = this.getTotal() / 3.0;
		return result;
	}
	
}
