package edu.kh.project.board.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.board.model.dto.Comment;

@Repository
public class CommentDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	
	/** 댓글 목록 조회
	 * @param boardNo
	 * @return
	 */
	public List<Comment> select(int boardNo) {
		
		return sqlSession.selectList("boardMapper.selectCommentList", boardNo);
	}


	/** 댓글 삽입
	 * @param comment
	 * @return result
	 */
	public int insert(Comment comment) {
		
		return sqlSession.insert("commentMapper.insert", comment);
	}


	/** 댓글 삭제
	 * @param commentNo
	 * @return
	 */
	public int delete(int commentNo) {
		
		return sqlSession.delete("commentMapper.delete", commentNo);
	}


	public int update(Comment comment) {
		
		return 0;
	}

	


	
	
}
