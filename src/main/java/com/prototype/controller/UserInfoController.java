package com.prototype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prototype.form.UserInfoForm;
import com.prototype.mapper.MsuserMapper;
import com.prototype.service.user.UserInfoService;

@Controller
public class UserInfoController {

	@Autowired
	MsuserMapper userMapper;

	@Autowired
	UserInfoService userService;

	@RequestMapping("/user")
	public String user(Model model) {
		model.addAttribute("userLst", userMapper.selectAll());
		return "userinfo";
	}

	@RequestMapping("/user/add")
	public String userAdd(Model model) {
		UserInfoForm userForm = new UserInfoForm();
		model.addAttribute("UserInfoForm", userForm);
		return "useradd";
	}

	@RequestMapping("/user/insert")
	public String insert(UserInfoForm userForm, BindingResult bindingResult, Model model) {
		userService.UserInsert(userForm);
		model.addAttribute("userLst", userMapper.selectAll());
		return "userinfo";
	}

}
