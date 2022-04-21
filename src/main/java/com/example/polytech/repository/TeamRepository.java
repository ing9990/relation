package com.example.polytech.repository;

import com.example.polytech.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author TaeWK
 */
public interface TeamRepository extends JpaRepository<Team,Long> {}
