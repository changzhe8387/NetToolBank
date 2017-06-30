package com.nettoolbank.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

import lombok.Data;

@Data
@Entity
public class UserEntity {

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "EMAIL")
	private String userEmail;
}
