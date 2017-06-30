package com.nettoolbank.service;

import org.seasar.doma.jdbc.tx.TransactionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.nettoolbank.batch.Scheduling;
import com.nettoolbank.config.AppConfig;
import com.nettoolbank.dao.UserDao;
import com.nettoolbank.dao.UserDaoImpl;
import com.nettoolbank.entity.UserEntity;

@Service
public class LoginService {
	private TransactionManager tm = AppConfig.singleton().getTransactionManager();

	private final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);

	private Scheduling schedulingTest = new Scheduling();
	//
	public UserDao userDao = new UserDaoImpl();

	public boolean userLoginCheck(UserEntity userEntity) {
		UserEntity resultuser = tm.required(() -> {
			return userDao.selectByUsernamePassword(userEntity.getUserName(),userEntity.getPassword());
		});
		if(resultuser != null){
			schedulingTest.scheduling();
			LOGGER.info("ユーザがログイン成功");
			return true;
		}else{
			LOGGER.info("ユーザがログイン失敗");
			return false;
		}
	}
}
