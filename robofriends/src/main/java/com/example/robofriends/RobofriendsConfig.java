package com.example.robofriends;

import java.util.List;

import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RobofriendsConfig {
	@Bean
	CommandLineRunner commandLineRunner(RobofriendRepository repository) {
		return args -> {
					Robofriend abilio  = new Robofriend(
							"Abilio Lopes",
							"aby",
							"abilio.lopes@gmail.com"
					);
					
					Robofriend elineth = new Robofriend(
							"Elineth Nzinga",
							"elly",
							"jacira@lly.net"
					);
					
					Robofriend oliveira = new Robofriend(
							"Oliveira Lopes",
							"olive",
							"oliveira@lopes.tv"
					);
					
					Robofriend ceuma = new Robofriend(
							"Ceuma Pascoal",
							"celmiie",
							"celmiie_pamela.ca"
					);
					
					Robofriend carlos = new Robofriend(
							"Carlos Simao",
							"CarLos",
							"simao@carlos.org"
					);
					
					Robofriend gillin = new Robofriend(
							"Gillin Ferreira",
							"gillas",
							"gilla@ferr.pt"
					);
					
					Robofriend ary = new Robofriend(
							"Aristoteles",
							"arisky",
							"ariskayl@teles.com"
					);
					
					Robofriend jor = new Robofriend(
							"Jorge Pola",
							"jojo",
							"jojo@pola.net"
					);
					
					Robofriend kur = new Robofriend(
							"Kurtis Weissnat",
							"Telly",
							"Telly.Hoeger@billy.biz"
					);

					Robofriend cle = new Robofriend(
							"Clementina DuBuque",
							"Moriah.Stanton",
							"ey.Padberg@karina.biz"
					);
					
					repository.saveAll(
							List.of(abilio, 
									elineth, 
									oliveira, 
									ceuma, 
									carlos, 
									gillin, 
									ary, 
									jor, 
									kur, 
									cle)
					);
		};
		
	}

}


