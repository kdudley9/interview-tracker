package com.kennethdudley.interviewtracker.repository;

import com.kennethdudley.interviewtracker.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
