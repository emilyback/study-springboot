package com.cpst.demo;


import java.util.HashMap;

import com.cpst.demo.DTO.MemberDTO;


public interface Member {
	public MemberDTO loginCheck(HashMap<String, String> loginMember);
}
