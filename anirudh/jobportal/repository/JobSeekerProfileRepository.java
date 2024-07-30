package com.anirudh.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anirudh.jobportal.entity.JobSeekerProfile;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Integer> {
}
