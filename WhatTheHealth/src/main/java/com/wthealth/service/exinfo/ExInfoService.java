package com.wthealth.service.exinfo;

import java.util.Map;

import com.wthealth.common.Search;
import com.wthealth.domain.Post;

public interface ExInfoService {

	public void addExInfo(Post post) throws Exception;
	
	public Post getExInfo(int exInfoNo) throws Exception;
	
	public void updateExinfo(Post post) throws Exception;
	
	public Map<String, Object> listExInfo(Search search) throws Exception;

	public void deleteExInfo(int postNo) throws Exception;
	
	//확인해야함 
	public Map<String, Object> listExInfo(String Weather) throws Exception;
}
