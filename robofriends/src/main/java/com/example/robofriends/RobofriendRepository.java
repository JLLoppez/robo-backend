package com.example.robofriends;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RobofriendRepository 
    extends JpaRepository<Robofriend, Long> {
}
