package com.smarcosm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smarcosm.course.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
