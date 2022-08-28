/**
 * 
 */
package com.example.robo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 27672
 *
 */
@Repository
public interface RoboRepository
	extends JpaRepository<robos, Long> {

}
