package com.prototype.service.user;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prototype.entity.Msuser;
import com.prototype.form.UserInfoForm;
import com.prototype.mapper.MsuserMapper;

@Service
public class UserInfoService {
	@Autowired
	private MsuserMapper userMapper;

	@Transactional
	public void UserInsert(UserInfoForm userForm) {
		Msuser insRec = new Msuser();
		insRec.setUserid(userForm.getUserid());
		insRec.setUsername(userForm.getUsername());
		insRec.setUserpswd(userForm.getUserpswd());
		insRec.setUserclass(userForm.getUserclass());
		insRec.setInsertdate(new Date());
		insRec.setInsertuserid("0000");
		insRec.setInsertusername("test");
		insRec.setRev(0);
		userMapper.insert(insRec);
	}

}
