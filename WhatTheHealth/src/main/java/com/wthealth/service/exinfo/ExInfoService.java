package com.wthealth.service.exinfo;

import java.util.List;
import java.util.Map;

import com.wthealth.common.Search;
import com.wthealth.domain.Post;

public interface ExInfoService {

	//������Խù� ���
	public int addExInfo(Post post) throws Exception;
	
	//�Խù� ���
	public void addPost(Post post) throws Exception;
	
	public Post getExInfo(String postNo) throws Exception;
	
	//������Խù� ������Ʈ
	public void updateExInfo(Post post) throws Exception;
	
	//�Խù� ������Ʈ
	public void updatePost(Post post) throws Exception;
	
	public Map<String, Object> listExInfo(Search search) throws Exception;
	
	//Ȯ���ؾ��� 
	public List<Post> listExInfo(String Weather) throws Exception;
}
