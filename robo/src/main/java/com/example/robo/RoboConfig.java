/**
 * 
 */
package com.example.robo;



import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 27672
 *
 */

@Configuration
public class RoboConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(RoboRepository repository) {
		return args -> {
					robos abilio  = new robos(
							"Abilio Lopes",
							"aby",
							"abilio.lopes@gmail.com"
					);
					
					robos elineth = new robos(
							"Elineth Nzinga",
							"elly",
							"jacira@lly.net"
					);
					
					robos oliveira = new robos(
							"Oliveira Lopes",
							"olive",
							"oliveira@lopes.tv"
					);
					
					robos ceuma = new robos(
							"Ceuma Pascoal",
							"celmiie",
							"celmiie_pamela.ca"
					);
					
					robos carlos = new robos(
							"Carlos Simao",
							"CarLos",
							"simao@carlos.org"
					);
					
					robos gillin = new robos(
							"Gillin Ferreira",
							"gillas",
							"gilla@ferr.pt"
					);
					
					robos ary = new robos(
							"Aristoteles",
							"arisky",
							"ariskayl@teles.com"
					);
					
					robos jor = new robos(
							"Jorge Pola",
							"jojo",
							"jojo@pola.net"
					);
					
					robos kur = new robos(
							"Kurtis Weissnat",
							"Telly",
							"Telly.Hoeger@billy.biz"
					);

					robos cle = new robos(
							"Clementina DuBuque",
							"Moriah.Stanton",
							"ey.Padberg@karina.biz"
					);
					
					repository.saveAll(abilio, 
									elineth, 
									oliveira, 
									ceuma, 
									carlos, 
									gillin, 
									ary, 
									jor, 
									kur, 
									cle
					);
		};
		
	}

}
