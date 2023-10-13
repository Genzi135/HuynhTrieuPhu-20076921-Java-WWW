package com.iuh.edu.vn.week4.ids;

import com.iuh.edu.vn.week4.models.Candidate;
import com.iuh.edu.vn.week4.models.Skill;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateSkillID implements Serializable {

    private Skill skill;


    private Candidate candidate;
}
