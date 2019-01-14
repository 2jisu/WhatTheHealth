package com.wthealth.service.favorite;

import com.wthealth.domain.Interest;
import com.wthealth.domain.Like;

public interface FavoriteService {
	
	public void addLike(Like like) throws Exception;

	public void addInterest(Interest interest) throws Exception;

	public void deleteLike(int likeNo) throws Exception;

	public void deleteInterest(int interestNo) throws Exception;
	
}
