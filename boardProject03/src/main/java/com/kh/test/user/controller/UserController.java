package com.kh.test.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.test.user.model.service.UserService;
import com.kh.test.user.model.vo.User;

// 컨트롤러임을 명시
@Controller
public class UserController {
	
	// UserService를 가져오며 @Autowired를 이용해 service로 축약
	@Autowired
	private UserService service;
	
	// 이 생성자를 /selectUser로 임명한다
	@GetMapping("/selectUser")
	//Model객체로 model에 있는 데이터를 컨트롤러에 파라미터로 옮겨준다
	public String search(int inputUserNo, Model model) {
		
		// service.search(inputUserId)는 User의 값들을 List로 만들고 userList로 명명한 것이다
		List<User>userList = service.search(inputUserNo);
		
		// userList가 비어있지 않다면 
		if(!userList.isEmpty()) {
			// model에서 가져온 데이터인 "userList"의 userList를 
			model.addAttribute("userList", userList);
			
			//searchSuccess로 가져간다
			return "searchSuccess";
		} else {
			
			// userList가 비어있다면 model에서 가져온 데이터인 "userList"의 userList를 searchFail로 가져간다
			return "searchFail";
		}
	}


}
