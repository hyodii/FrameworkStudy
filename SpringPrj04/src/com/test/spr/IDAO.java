/*====================
	IDAO.java
	- 인터페이스
======================*/


package com.test.spr;

import java.sql.SQLException;
import java.util.List;

public interface IDAO
{
	// 메소드 오버라이딩하려면 throws 예외도 미리 해놔야함!
	//     --------------- 오버라이딩할 때 범위가 크거나 같아야함.
	public List<MemberDTO> list()  throws ClassNotFoundException, SQLException;
	
}
