package com.iuh.edu.vn.week4.models;

import com.iuh.edu.vn.week4.enums.SkillLevel;
import com.iuh.edu.vn.week4.ids.JobSkillID;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@ToString
@IdClass(JobSkillID.class)
public class JobSkill {
    @Id
    @MapsId("job_id")
    @ManyToOne
    private Job job;

    @Id
    @MapsId("skill_id")
    @ManyToOne
    private Skill skill;

    @Column(length = 1000)
    private String more_infos;

    @Column
    private SkillLevel skill_level;

}
