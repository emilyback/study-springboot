package com.cpst.demo.DAO;

import java.util.HashMap;

import com.cpst.demo.DTO.*;
public class MemberDAO {
	
	MemberDTO member;
	HashMap<String,MemberDTO> memberList;
	
	public MemberDAO(HashMap<String,MemberDTO> memberList) {
		memberList = getMembers();
	}
	
	public HashMap<String,MemberDTO> getMembers() {
		member = new MemberDTO("박보검", "bbg", "bbg123");
		memberList.put("0",member);
		
		member = new MemberDTO("여진구","yjg","yjg123");
		memberList.put("1",member);
		
		member = new MemberDTO("주지훈","jjh","jjh123");
		memberList.put("2",member);

		return memberList;
	}
	
}
