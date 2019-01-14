package com.wthealth.service.exinfo;

import java.util.List;
import java.util.Map;

import com.wthealth.common.Search;
import com.wthealth.domain.Post;

public interface ExInfoService {

	//운동정보게시물 등록
	public int addExInfo(Post post) throws Exception;
	
	//게시물 등록
	public void addPost(Post post) throws Exception;
	
	public Post getExInfo(String postNo) throws Exception;
	
	//운동정보게시물 업데이트
	public void updateExInfo(Post post) throws Exception;
	
	//게시물 업데이트
	public void updatePost(Post post) throws Exception;
	
	public Map<String, Object> listExInfo(Search search) throws Exception;
	
	//확인해야함 
	public List<Post> listExInfo(String Weather) throws Exception;
}
