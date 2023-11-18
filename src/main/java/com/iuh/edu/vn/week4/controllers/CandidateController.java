package com.iuh.edu.vn.week4.controllers;

import com.iuh.edu.vn.week4.models.Address;
import com.iuh.edu.vn.week4.models.Candidate;
import com.iuh.edu.vn.week4.repositories.AddressRepository;
import com.iuh.edu.vn.week4.repositories.CandidateRepository;
import com.iuh.edu.vn.week4.repositories.CandidateSkillRepository;
import com.iuh.edu.vn.week4.services.CandidateService;
import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/candidate")
public class CandidateController {
    @Autowired
    private CandidateSkillRepository candidateSkillRepository;
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private CandidateService candidateServices;
    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/list")
    public String showCandidateList(Model model) {
        model.addAttribute("candidates", candidateRepository.findAll());
        return "Candidate/list_no_paging";
    }

    @GetMapping()
    public String showCandidateListPaging(Model model,
                                          @RequestParam("page") Optional<Integer> page,
                                          @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(10);
        Page<Candidate> candidatePage = candidateServices.showCandidate(currentPage, pageSize);

        model.addAttribute("candidatePage", candidatePage);

        int totalPages = candidatePage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "Candidate/list";
    }

    @GetMapping("/show-add-form")
    public ModelAndView add(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        Candidate candidate = new Candidate();
        candidate.setAddress(new Address());
        modelAndView.addObject("candidate", candidate);
        modelAndView.addObject("address", candidate.getAddress());
        modelAndView.addObject("countries", CountryCode.values());
        modelAndView.setViewName("Candidate/add");
        return modelAndView;
    }

    @PostMapping("/add")
    public String addCandidate(
            @ModelAttribute("candidate") Candidate candidate,
            @ModelAttribute("address") Address address,
            BindingResult result, Model model) {
        addressRepository.save(address);
        candidate.setAddress(address);
        candidateRepository.save(candidate);
        return "redirect:/candidate";
    }

    @GetMapping("/show-edit-form/{id}")
    public ModelAndView edit(@PathVariable("id") long id) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<Candidate> opt = candidateRepository.findById(id);
        if (opt.isPresent()) {
            Candidate candidate = opt.get();
            modelAndView.addObject("candidate", candidate);
            modelAndView.addObject("address", candidate.getAddress());
            modelAndView.addObject("countries", CountryCode.values());
            modelAndView.setViewName("Candidate/update");
        }
        return modelAndView;
    }

    @PostMapping("/update")
    public String update(
            @ModelAttribute("candidate") Candidate candidate,
            @ModelAttribute("address") Address address,
            BindingResult result, Model model) {
        addressRepository.save(address);
        candidateRepository.save(candidate);
        return "redirect:/candidate";
    }
}
