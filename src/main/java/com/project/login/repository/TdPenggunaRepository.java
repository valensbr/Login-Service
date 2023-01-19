package com.project.login.repository;

import com.project.login.entity.TdPengguna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TdPenggunaRepository extends JpaRepository<TdPengguna, UUID> {

}
