package com.cpst.demo.DAO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

import com.cpst.demo.DTO.MemberDTO;

@Repository
public class MemberDAO {
	
	
	HashMap<String,MemberDTO> memberList = new HashMap<String, MemberDTO>();
	
	public MemberDAO() {
		setMembers();
	}
	
	public HashMap<String,MemberDTO> getMembers() {
		
		return memberList;
	}
	
	public void setMembers() {
		MemberDTO member;
		member = new MemberDTO("박보검", "bbg", "bbg123");
		memberList.put(member.getId(),member);
		
		member = new MemberDTO("여진구","yjg","yjg123");
		memberList.put(member.getId(),member);
		
		member = new MemberDTO("주지훈","jjh","jjh123");
		memberList.put(member.getId(),member);
	}
	
	public MemberDTO memberCheck(HashMap<String, String> loginParam) {
		MemberDTO memberDTO = null;
		
		String loginId = loginParam.get("loginId");
		String loginPwd = loginParam.get("loginPwd");
		
		if(memberList.containsKey(loginId)) {
			if(memberList.get(loginId).getPwd().equals(loginPwd))
				memberDTO = memberList.get(loginId);
		}

		return memberDTO;
	}
	
	
}
