package com.ketul.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ketul.module.dto.UserDto;

@RestController
public class UserResource {

	@PostMapping("/postRequest")
	public UserDto users(@RequestBody UserDto userdto) {
		return userdto;
	}
}
