package com.cpst.demo.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpst.demo.DAO.MemberDAO;
import com.cpst.demo.DAO.MemberOrc;
import com.cpst.demo.DTO.MemberDTO;

@RestController
public class LoginController {
	
	
	
	@Autowired
	MemberDAO memberDAO;
	
	@Autowired
	MemberOrc memberOrc;
	
	@RequestMapping(path="/loginCheck")
	public String getLogin(@RequestBody HashMap<String, String> loginMember){
		
		MemberDTO loginMemberDTO = memberDAO.loginCheck(loginMember);
		
		MemberDTO loginMemberOrc = memberOrc.loginCheck(loginMember);
		
		
		String memberName = loginMemberDTO.getName();//DAO에 있는거 비교
		String memberNameWithOrc = loginMemberOrc.getName();
		
		
		if(!memberName.equals(""))
			return memberName;
		
		else
			return memberNameWithOrc;
		//없으면 orc를 돌릴까?
		
	}
}
