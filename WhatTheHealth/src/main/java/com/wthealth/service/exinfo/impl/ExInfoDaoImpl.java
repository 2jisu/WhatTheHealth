package com.wthealth.service.exinfo.impl;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.common.Search;
import com.wthealth.domain.Post;
import com.wthealth.service.exinfo.ExInfoDao;

@Repository("exInfoDaoImpl")
public class ExInfoDaoImpl implements ExInfoDao{

	//Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}
	
	//Constructor
	public ExInfoDaoImpl() {
		System.out.println(this.getClass());
	}
	//@Override
	public void addExInfo(Post post) throws Exception {
		sqlSession.insert("ExInfoMapper.addPost", post);
	//	int postNo = post.getPostNo();
	}

	@Override
	public Post getExInfo(int exInfoNo) throws Exception {
		return sqlSession.selectOne("ExInfoMapper.getExInfo", exInfoNo);
	}

	//@Override
	public void updateExInfo(Post post) throws Exception {
		sqlSession.update("ExInfoMapper.updateExinfo", post);
		sqlSession.update("ExInfoMapper.updatePost", post);
	}

	//@Override
	public Map<String, Object> listExInfo(Search search) throws Exception {
		return null;
	}

	//@Override
	public void deleteExInfo(int postNo) throws Exception {
		
	}

	//@Override
	public Map<String, Object> listExInfo(String Weather) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
