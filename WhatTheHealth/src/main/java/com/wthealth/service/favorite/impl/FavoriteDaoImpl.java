package com.wthealth.service.favorite.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.domain.Interest;
import com.wthealth.domain.Like;
import com.wthealth.service.favorite.FavoriteDao;

@Repository("favoriteDaoImpl")
public class FavoriteDaoImpl implements FavoriteDao {
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public FavoriteDaoImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void addLike(Like like) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void addInterest(Interest interest) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLike(int likeNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInterest(int interestNo) throws Exception {
		// TODO Auto-generated method stub

	}

}
