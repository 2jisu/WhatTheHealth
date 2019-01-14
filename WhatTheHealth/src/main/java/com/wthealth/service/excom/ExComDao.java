package com.wthealth.service.excom;

import java.util.List;

import com.wthealth.common.Search;
import com.wthealth.domain.Post;

public interface ExComDao {

	public void addExCom(Post post) throws Exception;
	
	public Post getExCom(int postNo) throws Exception;

	public List<Post> listExCom(int postNo) throws Exception;

	public void updateExCom(Post post) throws Exception;

	public void deleteExCom(int postNo) throws Exception;

	public List<Post> listExComRecom(int postNo) throws Exception;

	// 게시판 Page 처리를 위한 전체Row(totalCount) return
	public int getTotalCount(Search search) throws Exception;
}
