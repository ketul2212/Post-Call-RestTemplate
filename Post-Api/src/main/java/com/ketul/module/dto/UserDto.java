package com.ketul.module.dto;

import com.ketul.module.User;

public class UserDto {

	private User user;

	public UserDto() {
		super();
	}

	public UserDto(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserDto [user=" + user + "]";
	}
}
