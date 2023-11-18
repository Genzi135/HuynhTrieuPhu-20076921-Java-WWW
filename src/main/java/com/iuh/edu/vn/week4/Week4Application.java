package com.iuh.edu.vn.week4;

import com.iuh.edu.vn.week4.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week4Application {


    CandidateRepository candidateRepository;
    CandidateSkillRepository candidateSkillRepository;
    CompanyRepository companyRepository;
    ExperienceRepository experienceRepository;
    JobRepository jobRepository;
    JobSkillRepository jobSkillRepository;
    SkillRepository skillRepository;
    AddressRepository addressRepository;

    public static void main(String[] args) {
        SpringApplication.run(Week4Application.class, args);

        for (int i = 0; i < 10; i++) {

        }
    }


}
