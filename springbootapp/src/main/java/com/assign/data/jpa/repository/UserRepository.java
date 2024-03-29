package com.assign.data.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.assign.bean.jpa.User;
/**
 * This interface defined to create User Repository
 * @author admin
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    
    @Query("select u from User u where  u.username = ?1")
    User findUsername(String username);
}