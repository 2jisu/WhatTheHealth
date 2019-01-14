package com.wthealth.service.point;

import java.util.List;

import com.wthealth.common.Search;
import com.wthealth.domain.Point;
import com.wthealth.domain.User;


public interface PointDao {
	
		// INSERT
		public void addPoint(Point point) throws Exception ;
		
		// SELECT ONE
		public Point getPoint(int pointNo) throws Exception ;

		// SELECT LIST
		public List<Point> listPoint(Search search, String senderId) throws Exception ;

		// UPDATE
		public void updatePoint(Point point) throws Exception ;
		
		// �Խ��� Page ó���� ���� ��üRow(totalCount)  return
		public int getTotalCount(String senderId) throws Exception ;
		
}
