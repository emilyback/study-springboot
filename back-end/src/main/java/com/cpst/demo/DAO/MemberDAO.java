package com.cpst.demo.DAO;

import java.util.ArrayList;

import com.cpst.demo.DTO.*;
public class MemberDAO {
	
	MemberDTO member;
	ArrayList<MemberDTO> memberList;
	
	public MemberDAO(ArrayList<MemberDTO> memberList) {
		memberList = getMembers();
	}
	
	public ArrayList<MemberDTO> getMembers() {
		member = new MemberDTO("박보검", "bbg", "bbg123");
		memberList.add(member);
		
		member = new MemberDTO("여진구","yjg","yjg123");
		memberList.add(member);
		
		member = new MemberDTO("주지훈","jjh","jjh123");
		memberList.add(member);
				
		return memberList;
	}
}
