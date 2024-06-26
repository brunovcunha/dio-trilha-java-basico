package dio.aula_spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.aula_spring_data_jpa.model.User;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Integer>{
    
}
