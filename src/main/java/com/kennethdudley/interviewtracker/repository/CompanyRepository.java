package com.kennethdudley.interviewtracker.repository;

import com.kennethdudley.interviewtracker.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
