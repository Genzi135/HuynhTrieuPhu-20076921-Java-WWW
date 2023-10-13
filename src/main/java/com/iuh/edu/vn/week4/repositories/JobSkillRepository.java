package com.iuh.edu.vn.week4.repositories;

import com.iuh.edu.vn.week4.ids.JobSkillID;
import com.iuh.edu.vn.week4.models.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillID> {
}