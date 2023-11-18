package com.iuh.edu.vn.week4.controllers;

import com.iuh.edu.vn.week4.models.Candidate;
import com.iuh.edu.vn.week4.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private CandidateService candidateServices;

    @GetMapping("/login")
    public String login() {
        return "Auth/login";
    }

    //i have one param is email
    @PostMapping("/login")
    public String login(String email, Model model) {
        Candidate candidate = candidateServices.findByEmail(email);
        if (candidate == null) {
            return "redirect:/Auth/login";
        } else {
            model.addAttribute("candidate", candidate);
            return "redirect:/candidate";

        }

    }
}
