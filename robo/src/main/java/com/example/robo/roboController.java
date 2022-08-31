/**
 * 
 */
package com.example.robo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 27672
 *
 */

@RestController
@CrossOrigin("https://robfriends.netlify.app")
public class roboController {
	
	private final RoboService roboService;
	
	@Autowired
	public roboController(RoboService roboService) {
		super();
		this.roboService = roboService;
	}


	@GetMapping
	public List<robos>getrobos(){
		return roboService.getrobos();
	}

}
