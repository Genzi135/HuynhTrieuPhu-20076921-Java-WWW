package com.iuh.edu.vn.week4.services;

import com.iuh.edu.vn.week4.models.Candidate;
import com.iuh.edu.vn.week4.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CandidateService {
    @Autowired
    CandidateRepository candidateRepository;

    public Page<Candidate> showCandidate(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        return candidateRepository.findAll(pageable);
    }

    public Candidate findByEmail(String e) {
        return candidateRepository.findByEmail(e);
    }

    public List<Candidate> findAll() {
        return candidateRepository.findAll();
    }

    public Page<Candidate> findPagintated(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Candidate> list;
        List<Candidate> candidates = candidateRepository.findAll();
        if (candidates.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, candidates.size());
            list = candidates.subList(startItem, toIndex);
        }

        Page<Candidate> candidatePage = new PageImpl<>(list, PageRequest.of(currentPage, pageSize), candidates.size());

        return candidatePage;
    }
}
