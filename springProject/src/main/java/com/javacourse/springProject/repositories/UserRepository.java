package com.javacourse.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.springProject.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {


}