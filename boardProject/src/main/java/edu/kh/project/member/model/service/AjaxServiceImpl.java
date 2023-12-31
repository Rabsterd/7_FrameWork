package edu.kh.project.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kh.project.member.model.dao.AjaxDAO;
import edu.kh.project.member.model.dto.Member;

@Service // 서비스임을 명시 + bean 등록
public class AjaxServiceImpl implements AjaxService{

	@Autowired
	private AjaxDAO dao;

	// 닉네임으로 전화번호 조회
	@Override
	public String selectMemberTel(String nickname) {
		
		return dao.selectMemberTel(nickname);
	}
	
	@Override
	public Member selectMember(String email) {
		
		return dao.selectMember(email);
	}
	
	public int checkEmail(String email) {
		
		return dao.checkEmail(email);
	}
	
	public int checkNickname(String nickname) {
		
		return dao.checkNickname(nickname);
	}
}
