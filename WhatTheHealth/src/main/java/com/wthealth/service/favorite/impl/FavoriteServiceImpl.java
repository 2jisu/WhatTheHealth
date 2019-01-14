package com.wthealth.service.favorite.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.domain.Interest;
import com.wthealth.domain.Like;
import com.wthealth.service.favorite.FavoriteDao;
import com.wthealth.service.favorite.FavoriteService;

@Service("favoriteServiceImpl")
public class FavoriteServiceImpl implements FavoriteService {
	
	@Autowired
	@Qualifier("favoriteDaoImpl")
	private FavoriteDao favoriteDao;
	public void setFavoriteDao(FavoriteDao favoriteDao) {
		this.favoriteDao = favoriteDao;
	}
	
	public FavoriteServiceImpl() {
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
