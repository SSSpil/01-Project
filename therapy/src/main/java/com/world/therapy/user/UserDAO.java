package com.world.therapy.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAO {
	
	@Autowired
	private SqlSession SqlSession;
	//����� ���
	public List<Map<String, Object>> getUserList() throws Exception {
		return SqlSession.selectList("com.world.therapy.user.userList");
	}
	
	//����� �� ��
	public int getTestValue() throws Exception {
		return SqlSession.selectOne("com.world.therapy.user.userCount");
	}
}





