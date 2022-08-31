package com.example.robofriends;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobofriendService {
	
	private final RobofriendRepository robofriendRepository;
	
	@Autowired
	public RobofriendService(RobofriendRepository robofriendRepository) {
		super();
		this.robofriendRepository = robofriendRepository;
	}
	
	public List<Robofriend>getRobofriend(){
		return robofriendRepository.findAll();
		
	}

}
