package com.prototype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prototype.entity.Msuser;
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
		return "usermain";
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
		return "usermain";
	}

	@RequestMapping("/user/del")
	public String userDel(Model model, @RequestParam("userid") String id) {
		Msuser userInfo = userMapper.selectByPrimaryKey(id);
		UserInfoForm userForm = new UserInfoForm();
		userForm.setUserid(userInfo.getUserid());
		userForm.setUsername(userInfo.getUsername());
		userForm.setUserpswd(userInfo.getUserpswd());
		userForm.setUserclass(userInfo.getUserclass());
		model.addAttribute("UserInfoForm", userForm);
		return "userdel";
	}

	@RequestMapping("/user/delete")
	public String delete(UserInfoForm userForm, BindingResult bindingResult, Model model) {
		userService.UserDelete(userForm);
		return "usermain";
	}

	@RequestMapping("/user/mod")
	public String userMod(Model model, @RequestParam("userid") String id) {
		Msuser userInfo = userMapper.selectByPrimaryKey(id);
		UserInfoForm userForm = new UserInfoForm();
		userForm.setUserid(userInfo.getUserid());
		userForm.setUsername(userInfo.getUsername());
		userForm.setUserpswd(userInfo.getUserpswd());
		userForm.setUserclass(userInfo.getUserclass());
		model.addAttribute("UserInfoForm", userForm);
		return "usermod";
	}

	@RequestMapping("/user/update")
	public String update(UserInfoForm userForm, BindingResult bindingResult, Model model) {
		userService.UserUpdate(userForm);
		return "usermain";
	}
}
