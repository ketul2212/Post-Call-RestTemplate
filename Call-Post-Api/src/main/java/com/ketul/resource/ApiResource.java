package com.ketul.resource;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ApiResource {

	Logger log = LoggerFactory.getLogger(ApiResource.class);

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
	public ResponseEntity<String> getData(@RequestParam(name = "name") String name, @RequestParam(name = "email") String email) throws JsonProcessingException {
		log.info("name : {} -> email : {}", name, email);

		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("email", email);

		Map<String, Object> mapMain = new HashMap<String, Object>();
		mapMain.put("user", map);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		String s = new ObjectMapper().writeValueAsString(mapMain);

		HttpEntity<Object> request = new HttpEntity<Object>(s, headers);

		ResponseEntity<String> responseEntity = restTemplate.postForEntity(
					"http://localhost:8081/postRequest", request, String.class);
		System.out.println(responseEntity.getBody());
		log.info("Working Fine.");

		return responseEntity;
	}
}
