package com.dcoder.accounting.repository;


import com.dcoder.accounting.model.Role;
import com.dcoder.accounting.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
    Boolean existsByName(RoleName roleName);
}