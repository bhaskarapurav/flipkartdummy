package com.example.FlipkartDummy.repository;

import com.example.FlipkartDummy.model.SignUpRequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<SignUpRequestDTO,Long> {
  SignUpRequestDTO  findByEmail(String email);
}
