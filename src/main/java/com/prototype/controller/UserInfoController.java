package com.prototype.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prototype.entity.Msuser;
import com.prototype.mapper.MsuserMapper;

@Controller
public class UserInfoController {
	@Autowired
	MsuserMapper userMapper;

	@RequestMapping("/user")
	public String user(Model model) {
		ArrayList<Msuser> userLst = new ArrayList<>();
		Msuser userInfo = userMapper.selectByPrimaryKey("a0001") ;
		userLst.add(userInfo);
		model.addAttribute("userLst", userLst);
		return "userinfo";
	}
}
