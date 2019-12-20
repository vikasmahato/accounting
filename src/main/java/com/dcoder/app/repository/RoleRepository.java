package com.dcoder.app.repository;


import com.dcoder.app.model.Role;
import com.dcoder.app.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
    Boolean existsByName(RoleName roleName);
}