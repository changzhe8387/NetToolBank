package com.nettoolbank.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nettoolbank.entity.UserEntity;
import com.nettoolbank.service.LoginService;
import com.nettoolbank.webform.LoginForm;

@Controller
public class LoginController {
	private final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService = new LoginService();

	@RequestMapping("/")
	public String index(Model model,Locale locale){
		return "redirect:login";
	}


	  /*
	   * ログイン画面
	   */
	  @RequestMapping("/login")
	  public String login(Locale locale, ModelMap model, LoginForm loginForm) {
	    return "login";
	  }

	/**
	 * login 画面
	 * @param locale
	 * @param modelMap
	 * @param loginForm
	 * @return
	 */
	@RequestMapping(value = "/loginCheck" ,method = { RequestMethod.POST })
	public String userLogin(Locale locale,ModelMap modelMap,LoginForm loginForm){
		String result = "";
		LOGGER.info("ユーザログイン開始");
		UserEntity userEntity = new UserEntity();
		userEntity.setUserName(loginForm.getUserName());
		userEntity.setPassword(loginForm.getPassword());

		boolean loginResult = loginService.userLoginCheck(userEntity);
		if(loginResult == true){
			return "index";
		}else{
			return "error";
		}
	}
}
