package com.project.login.repository;

import com.project.login.entity.TdRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TdRoleRepository extends JpaRepository<TdRole, Integer> {
}
