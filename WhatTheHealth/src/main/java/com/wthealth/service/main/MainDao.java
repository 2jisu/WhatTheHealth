package com.wthealth.service.main;

import java.util.Map;

import com.wthealth.common.Search;

public interface MainDao {

	public Map<String, Object> listSearchMain(Search search) throws Exception;
}
