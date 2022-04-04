package com.world.therapy.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "userList.do", method = RequestMethod.GET)
	public ModelAndView goTestPage(Model model, HttpServletRequest request, UserVO userVO) { 
		
		//����� ��� ��������
		List<Map<String, Object>> userList = new ArrayList<Map<String, Object>>();
		
		//����� �� ��
		int result = 0;
		
		try {
			userList = userService.getUserList();
			result = userService.getTestValue();
			} catch (Exception e) {
				e.printStackTrace();
				} 
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/user");
		mv.addObject("userList", userList);
		mv.addObject("userCount", result); 
		
		return mv; 
	} 
}


		
	

