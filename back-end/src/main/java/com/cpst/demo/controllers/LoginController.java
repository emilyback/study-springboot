package com.cpst.demo.controllers;

import java.util.HashMap;
import java.util.Map;

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
	
	@RequestMapping(path="/LoginCheck")
	public Map<String, MemberDTO> loginResult(@RequestBody HashMap<String, String> loginParam) {
		memberDAO = new MemberDAO();
		Map<String, MemberDTO> result = new HashMap<String, MemberDTO>();
		
		MemberDTO memberDTO = memberDAO.memberCheck(loginParam);
		
		result.put("loginResult", memberDTO);
		
		
		return result;

	}
}
