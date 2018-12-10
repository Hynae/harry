package com.wildcodeschool.harry.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.harry.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
