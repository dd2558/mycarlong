package com.mycarlong.mycarlongback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycarlong.mycarlongback.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);
}
