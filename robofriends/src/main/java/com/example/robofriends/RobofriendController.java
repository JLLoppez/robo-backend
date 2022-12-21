package com.example.robofriends;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
	@CrossOrigin("https://robfriends.netlify.app")
    @RequestMapping(path="https://robo-backend.azurewebsites.net")
	public class RobofriendController{
			private final RobofriendService robofriendService;
			
			@Autowired
			public RobofriendController(RobofriendService robofriendService) {
				super();
				this.robofriendService = robofriendService;
			}
			@GetMapping
			public List<Robofriend>getRobofriend(){
				return robofriendService.getRobofriend();
			}
		}
	


