package com.cpst.demo.DAO;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cpst.demo.Member;
import com.cpst.demo.DTO.MemberDTO;



@Repository
public class MemberOrc implements Member{

	
	SqlSession sqlSession = new SqlSession() {
		
		@Override
		public int update(String statement, Object parameter) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int update(String statement) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public <T> T selectOne(String statement, Object parameter) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> T selectOne(String statement) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey, RowBounds rowBounds) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <K, V> Map<K, V> selectMap(String statement, String mapKey) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <E> List<E> selectList(String statement, Object parameter) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <E> List<E> selectList(String statement) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> Cursor<T> selectCursor(String statement, Object parameter, RowBounds rowBounds) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> Cursor<T> selectCursor(String statement, Object parameter) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> Cursor<T> selectCursor(String statement) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void select(String statement, Object parameter, RowBounds rowBounds, ResultHandler handler) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void select(String statement, Object parameter, ResultHandler handler) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void select(String statement, ResultHandler handler) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void rollback(boolean force) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void rollback() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public int insert(String statement, Object parameter) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int insert(String statement) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public <T> T getMapper(Class<T> type) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Connection getConnection() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Configuration getConfiguration() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<BatchResult> flushStatements() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int delete(String statement, Object parameter) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int delete(String statement) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public void commit(boolean force) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void commit() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void close() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void clearCache() {
			// TODO Auto-generated method stub
			
		}
	}; 
	
	@Override
	public MemberDTO loginCheck(HashMap<String, String> loginMember) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("MemberMapper.checkName", loginMember);
	}
		
}



