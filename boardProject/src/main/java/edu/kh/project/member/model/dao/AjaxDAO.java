package edu.kh.project.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // DB 연결 의미 + bean으로 등록
public class AjaxDAO {

	@Autowired // bean 중에서 타입이 같은 객체를 DI
	private SqlSessionTemplate sqlSession;

	// 닉네임이로 전화번호 조회
	public String selectMemberTel(String nickname) {
		
		return sqlSession.selectOne("ajaxMapper.selectMemberTel", nickname);
	}
	

}
