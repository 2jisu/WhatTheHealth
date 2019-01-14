package com.wthealth.service.excom;

import java.util.List;
import java.util.Map;

import com.wthealth.domain.Post;

public interface ExComService {
	
	public void addExCom(Post post) throws Exception;
	
	public Post getExCom(int postNo) throws Exception;

	public Map<String, Object> listExCom(int postNo) throws Exception;

	public void updateExCom(Post post) throws Exception;

	public void deleteExCom(int postNo) throws Exception;

	public Map<String, Object> listExComRecom(int postNo) throws Exception;
}
