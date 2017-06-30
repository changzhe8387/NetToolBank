package com.nettoolbank.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import com.nettoolbank.config.AppConfig;
import com.nettoolbank.entity.UserEntity;

@Dao(config = AppConfig.class)
public interface UserDao {

	//
	@Select
	UserEntity selectByUsernamePassword(String userName,String password);

}
