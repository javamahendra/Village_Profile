package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.UserLikes;

public interface UserLikesRepository extends JpaRepository<UserLikes, Long> {

}
