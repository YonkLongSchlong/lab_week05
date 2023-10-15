package yonk.dev.lab_week05.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import yonk.dev.lab_week05.entities.Candidate;
import yonk.dev.lab_week05.repositories.CandidateRepository;
import yonk.dev.lab_week05.services.CandidateService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class CandidateController {
    @Autowired
    private CandidateService candidateService;
    @Autowired
    private CandidateRepository candidateRepository;

    @GetMapping("/list")
    public String showCandidateList(Model model){
        model.addAttribute("candidates", candidateService.getAllCandidate());
        return "candidates/candidates";
    }

    @GetMapping("/candidates")
    public String showCandidateListWithPaging(Model model, @RequestParam("page") Optional<Integer> page,
                                        @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int currentSize = page.orElse(10);
        Page<Candidate> candidatePage = candidateService.getAllCandidateWithPaging(currentPage-1, currentSize, "id", "asc");
        model.addAttribute("candidatePage", candidatePage);

        int totalPages = candidatePage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }

        return "candidates/candidate-paging";
    }
}
