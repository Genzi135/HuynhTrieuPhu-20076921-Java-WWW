package com.iuh.edu.vn.week4.models;

import com.iuh.edu.vn.week4.enums.SkillType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "skill")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;

    @Column(name = "skill_name", nullable = false, length = 150)
    private String name;

    @Column(name = "skill_type", nullable = false)
    private SkillType type;

    @Column(name = "skill_desc", nullable = false, length = 300)
    private String desc;

    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;
}
