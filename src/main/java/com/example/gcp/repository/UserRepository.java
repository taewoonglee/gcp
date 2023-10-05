package com.example.gcp.repository;

import com.example.gcp.domain.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<MyUser, Long> {

}
