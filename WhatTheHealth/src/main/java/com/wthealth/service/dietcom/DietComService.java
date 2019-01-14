package com.wthealth.service.dietcom;

import java.util.List;
import java.util.Map;

import com.wthealth.domain.Post;

public interface DietComService {

	public void addDietCom(Post post) throws Exception;
	
	public Post getDietCom(int postNo) throws Exception;

	public Map<String, Object> listDietCom(int postNo) throws Exception;

	public void updateDietCom(Post post) throws Exception;

	public void deleteDietCom(int postNo) throws Exception;

	public Map<String, Object> listDietComRecom(int postNo) throws Exception;
}
