package com.iuh.edu.vn.week4.models;

import com.iuh.edu.vn.week4.enums.SkillLevel;
import com.iuh.edu.vn.week4.ids.CandidateSkillID;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@IdClass(CandidateSkillID.class)
public class CandidateSkill {
    @Id
    @MapsId("can_id")
    @ManyToOne
    private Candidate candidate;
    @Id
    @MapsId("skill_id")
    @ManyToOne
    private Skill skill;
    @Column
    private SkillLevel skill_level;
    @Column(length = 1000)
    private String more_infos;
}
