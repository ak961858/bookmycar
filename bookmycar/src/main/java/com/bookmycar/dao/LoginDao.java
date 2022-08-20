package com.bookmycar.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmycar.entity.Login;

@Repository
public interface LoginDao extends JpaRepository<Login, Integer>{
	
	public Optional<Login> findByUserId(int id);
}
