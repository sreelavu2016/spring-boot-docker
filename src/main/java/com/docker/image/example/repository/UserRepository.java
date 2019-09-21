package com.docker.image.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.image.example.model.Users;
/*
 * Authour M1046601
 */
public interface UserRepository extends JpaRepository <Users, Integer> {
}
