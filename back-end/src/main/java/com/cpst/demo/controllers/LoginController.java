package com.cpst.demo.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpst.demo.DAO.MemberDAO;
import com.cpst.demo.DTO.MemberDTO;

@RestController
public class LoginController {
	
	@Autowired
	MemberDAO memberDAO;
	
	@RequestMapping(path="/loginCheck")
	public String getLogin(@RequestBody HashMap<String, String> loginMember){
		
		MemberDTO loginMemberDTO = memberDAO.loginCheck(loginMember);  
		
		String memberName = loginMemberDTO.getName();
		
		return memberName;
	}
}
