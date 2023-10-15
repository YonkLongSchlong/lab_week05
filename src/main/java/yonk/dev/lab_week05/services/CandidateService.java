package yonk.dev.lab_week05.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import yonk.dev.lab_week05.entities.Candidate;
import yonk.dev.lab_week05.repositories.CandidateRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public List<Candidate> getAllCandidate() {
        return candidateRepository.findAll();
    }

    public Page<Candidate> getAllCandidateWithPaging(int pageNo, int pageSize, String sortBy, String sortDirection) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo,pageSize,sort);
        return candidateRepository.findAll(pageable);
    }

    public Optional<Candidate> getCandidateById(long id) {
        return candidateRepository.findById(id);
    }

    public void addCandidate(Candidate candidate) {
        candidateRepository.save(candidate);
    }

    public Optional<Candidate> updateCandidate(long id, Candidate candidate){
        Optional<Candidate> candidateUpdate = candidateRepository.findById(id);
        if(candidateUpdate.isPresent()){
            candidateUpdate = Optional.ofNullable(candidate);
           candidateRepository.save(candidateUpdate.get());
           return candidateUpdate;
        }
        return Optional.empty();
    }
}
