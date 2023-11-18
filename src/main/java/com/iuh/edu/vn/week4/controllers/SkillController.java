package com.iuh.edu.vn.week4.controllers;

import com.iuh.edu.vn.week4.models.Skill;
import com.iuh.edu.vn.week4.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/skill")
public class SkillController {
    @Autowired
    private SkillService skillServices;

    @GetMapping
    public String showSkillList(Model model) {

        model.addAttribute("skills", skillServices.findAll());
        return "skill/skills";
    }

    @GetMapping("/show-add-form")
    public ModelAndView showAddSkillForm() {
        ModelAndView modelAndView = new ModelAndView("skill/add");
        modelAndView.addObject("skill", new Skill());
        return modelAndView;
    }


    @PostMapping("/addSkill")
    public String addSkill(@ModelAttribute("skill") Skill skill) {
        skillServices.save(skill);
        return "redirect:/skills";
    }
}
