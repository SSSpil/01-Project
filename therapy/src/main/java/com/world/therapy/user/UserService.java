package com.world.therapy.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository 
public class UserService {
	@Autowired
	UserDAO userDAO;
	
	//����� ��� ��������
	public List<Map<String, Object>> getUserList() {
		List<Map<String, Object>> userList = new ArrayList<Map<String, Object>>();
		
		try {
			userList = userDAO.getUserList();
			} catch (Exception e) {
				e.printStackTrace();
				} 
		return userList; 
		}
	
	//����� �� ��
	public int getTestValue() throws Exception {
		return userDAO.getTestValue();
	} 
}
	

