package com.cpst.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.cpst.demo.Member;
import com.cpst.demo.DTO.*;


@Repository
public class MemberDAO implements Member{
	
	MemberDTO member;
	HashMap<String,MemberDTO> memberList = new HashMap<String, MemberDTO>();
	
	
	public HashMap<String,MemberDTO> getMembers() {
		member = new MemberDTO("박보검", "bbg", "bbg123");
		memberList.put(member.getId(),member);
		
		member = new MemberDTO("여진구","yjg","yjg123");
		memberList.put(member.getId(),member);
		
		member = new MemberDTO("주지훈","jjh","jjh123");
		memberList.put(member.getId(),member);

		return memberList;
	}
	
	
	public MemberDTO loginCheck(HashMap<String, String> loginMember){
		
		String loginId = loginMember.get("loginId");
		String loginPwd = loginMember.get("loginPwd");
		System.out.println(loginId+", "+loginPwd);
		
		HashMap<String, MemberDTO> memberList = getMembers();
		boolean IsCorrectId =  memberList.containsKey(loginId);
		
		if(IsCorrectId) {//loginID가 있다면
			System.out.println("isId");
			MemberDTO checkMember= memberList.get(loginId); //그 아이디의 멤버를 가져오고
			
			
			String memberPwd = checkMember.getPwd(); //그 맴버의 패스워드를 저장하고
			
			boolean IsCorrectPwd = memberPwd.equals(loginPwd) ; //그 패스워드가 loginmember의 password랑 같은지 확인
			
			if(IsCorrectPwd) {
				System.out.println("isPwd");
				return checkMember;
			}
		}
		else System.out.println("no");
		return null;
	}
	
	public void test() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		            String url = "jdbc:oracle:thin:@192.168.1.152:1521:xe";
		            String id = "minji";
		            String pwd = "minji123";
		           
		            try {
						Class.forName(driver);
						Connection con = DriverManager.getConnection(url, id, pwd);
						System.out.println(con);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            

	}
}
