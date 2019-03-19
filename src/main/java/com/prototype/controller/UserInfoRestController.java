package com.prototype.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prototype.entity.Msuser;
import com.prototype.form.UserInfoForm;
import com.prototype.mapper.MsuserMapper;

@RestController
public class UserInfoRestController {
	@Autowired
	MsuserMapper userMapper;

	@RequestMapping("/user/allusers")
	public List<UserInfoForm> getAllUsers() {
		List<Msuser> userList =  userMapper.selectAll();
		List<UserInfoForm> rstUser = new ArrayList<>();
		UserInfoForm userForm;
		for (Msuser user : userList) {
			userForm = new UserInfoForm();
			userForm.setUserid(user.getUserid());
			userForm.setUsername(user.getUsername());
			userForm.setUserpswd(user.getUserpswd());
			userForm.setUserclass(user.getUserclass());

			rstUser.add(userForm);
		}

		return rstUser;
	}
}
