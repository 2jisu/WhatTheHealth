package com.wthealth.service.reply.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.common.Search;
import com.wthealth.domain.Reply;
import com.wthealth.service.reply.ReplyDao;

@Repository("replyDaoImpl")
public class ReplyDaoImpl implements ReplyDao {
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public ReplyDaoImpl() {
		System.out.println(this.getClass());
	}
	
	///Method
	@Override
	public void addReply(Reply reply) throws Exception {
		sqlSession.insert("ReplyMapper.addReply", reply);
	}

	@Override
	public void addReReply(Reply reply) throws Exception {
		sqlSession.insert("ReplyMapper.addReReply", reply);
	}

	@Override
	public Reply getReply(int replyNo) throws Exception {
		return sqlSession.selectOne("ReplyMapper.getReply", replyNo);
	}

	@Override
	public void deleteReply(int replyNo) throws Exception {
		sqlSession.update("ReplyMapper.deleteReply", replyNo);
	}

	/*@Override
	public void deleteReReply(int replyNo) throws Exception {
		// TODO Auto-generated method stub

	}*/

	@Override
	public int getTotalCount(Search search) throws Exception {
		return sqlSession.selectOne("ReplyMapper.getTotalCount", search);
	}

	@Override
	public List<Reply> listReply(Search search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("ReplyMapper.listReply", search);
	}

	@Override
	public int getTotalCountMyList(String writerId) throws Exception {
		return sqlSession.selectOne("ReplyMapper.getTotalCountMyList", writerId);
	}

	@Override
	public List<Reply> listMyReply(Search search, String writerId) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("search", search);
		map.put("writerId", writerId);
		return sqlSession.selectList("ReplyMapper.listMyReply", map);
	}
	
	

}
