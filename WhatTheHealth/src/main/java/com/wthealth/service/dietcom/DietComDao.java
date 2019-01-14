package com.wthealth.service.dietcom;

import java.util.List;

import com.wthealth.common.Search;
import com.wthealth.domain.Post;

public interface DietComDao {

	public void addDietCom(Post post) throws Exception;
	
	public Post getDietCom(int postNo) throws Exception;
	
	public List<Post> listDietCom(int postNo) throws Exception;

	public void updateDietCom(Post post) throws Exception;

	public void deleteDietCom(int postNo) throws Exception;

	public List<Post> listDietComRecom(int postNo) throws Exception;

	// 게시판 Page 처리를 위한 전체Row(totalCount) return
	public int getTotalCount(Search search) throws Exception;
}
