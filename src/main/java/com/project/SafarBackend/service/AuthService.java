package com.project.SafarBackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.SafarBackend.model.Client;
import com.project.SafarBackend.model.User;


@Service
public class AuthService {

	@Autowired
	private UserService userService;

	@Autowired
	private ClientService clientService;

	public ResponseEntity<String> check(String token, String role) {
		User user = userService.getUser(token);
		if (user == null) {
			Client client = clientService.getClient(token);
			if (client == null) {
				return ResponseEntity.ok().body("{\"role\":\"none\"}");
			}
			return ResponseEntity.ok().body("{\"role\":" + "\"" + role + "\"" + "}");
		}
		return ResponseEntity.ok().body("{\"role\":" + "\"" + role + "\"" + "}");

	}

}
