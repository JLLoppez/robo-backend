package com.example.robofriends;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RobofriendRepository extends JpaRepository<Robofriend, Long> {

    public void saveAll(Robofriend abilio, Robofriend elineth, Robofriend oliveira, Robofriend ceuma, Robofriend carlos, Robofriend gillin, Robofriend ary, Robofriend jor, Robofriend kur, Robofriend cle);

}
