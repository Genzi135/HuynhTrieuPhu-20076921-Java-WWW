package com.iuh.edu.vn.week4.ids;

import com.iuh.edu.vn.week4.models.Job;
import com.iuh.edu.vn.week4.models.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobSkillID implements Serializable {
    private Job job;
    private Skill skill;
}
