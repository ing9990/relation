package com.example.polytech.repository;

import com.example.polytech.domain.Members;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author TaeWK
 */
public interface MembersRepository extends JpaRepository<Members,Long> {}
