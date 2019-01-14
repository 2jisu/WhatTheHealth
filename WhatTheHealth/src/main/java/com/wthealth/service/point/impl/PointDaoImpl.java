package com.wthealth.service.point.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.common.Search;
import com.wthealth.domain.Point;
import com.wthealth.service.point.PointDao;

@Repository("pointDaoImpl")
public class PointDaoImpl implements PointDao {
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public PointDaoImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public void addPoint(Point point) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert("PointMapper.addPoint", point);
	}
	
	@Override
	public Point getPoint(int pointNo) throws Exception {
		return sqlSession.selectOne("PointMapper.getPoint", pointNo);
	}

	@Override
	public List<Point> listPoint(Search search, String senderId) throws Exception {
		// TODO Auto-generated method stub
		Map<String , Object>  map = new HashMap<String, Object>();
		map.put("search", search);
		map.put("senderId", senderId);
		
		List<Point> list = sqlSession.selectList("PointMapper.listPoint", map);
		
		System.out.println("listPoint: "+list);
		
		return list;
	}

	@Override
	public void updatePoint(Point point) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("PointMapper.updatePoint", point);
	}

	@Override
	public int getTotalCount(String senderId) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("PointMapper.getTotalCount", senderId);
	}

}
