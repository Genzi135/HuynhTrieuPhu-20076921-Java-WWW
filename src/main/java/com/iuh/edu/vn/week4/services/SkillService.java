package com.iuh.edu.vn.week4.services;

import com.iuh.edu.vn.week4.models.Skill;
import com.iuh.edu.vn.week4.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public List<Skill> findAll() {
        return skillRepository.findAll();
    }

    public Skill findById(Long id) {
        return skillRepository.findById(id).get();
    }

    public Skill save(Skill skill) {
        return skillRepository.save(skill);
    }

    public void deleteById(Long id) {
        skillRepository.deleteById(id);
    }

    public void delete(Skill skill) {
        skillRepository.delete(skill);
    }

    public void deleteAll() {
        skillRepository.deleteAll();
    }

    public long count() {
        return skillRepository.count();
    }

    public Skill update(Skill skill) {
        return skillRepository.save(skill);
    }
}
