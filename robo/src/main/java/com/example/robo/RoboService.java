/**
 * 
 */
package com.example.robo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 27672
 *
 */

@Service
public class RoboService {
	
	private final RoboRepository roboRepository;
	
	@Autowired
	public RoboService(RoboRepository roboRepository) {
		super();
		this.roboRepository = roboRepository;
	}
	
	public List<robos>getrobos(){
		return roboRepository.findAll();
		
	}

}
