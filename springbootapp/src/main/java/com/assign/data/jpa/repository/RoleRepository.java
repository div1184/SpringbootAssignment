package com.assign.data.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.assign.bean.jpa.Role;
import com.assign.bean.jpa.RoleName;

/**
 * This interface used to connects JPA repository
 * @author admin
 *
 */
@Repository
public interface RoleRepository extends  JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
    
    
}