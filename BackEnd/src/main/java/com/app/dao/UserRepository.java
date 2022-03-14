package com.app.dao;

import com.app.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer > {
	@Query(value = "SELECT * from user where email =:email", nativeQuery =true)
	User findByEmail(@Param("email") String email);
}