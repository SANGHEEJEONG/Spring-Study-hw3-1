package com.example.springhw31.repository;

import com.example.springhw31.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    // 예외 처리 안 해도 된다해서 Optional 안 씀
    Optional<User> findByUsername(String username);
}
