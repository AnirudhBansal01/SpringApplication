package com.anirudh.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anirudh.jobportal.entity.RecruiterProfile;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile, Integer> {
}
