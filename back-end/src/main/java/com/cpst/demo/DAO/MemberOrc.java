package com.cpst.demo.DAO;

import java.util.HashMap;

import com.cpst.demo.Member;
import com.cpst.demo.DTO.MemberDTO;

public class MemberOrc extends MemberDAO implements Member{
	
	HashMap<String,MemberDTO> memberList = new HashMap<String, MemberDTO>();
	
	
	@Override
	public HashMap<String,MemberDTO> getMembers() {
		
		
		return memberList;
	}
}


