package yonk.dev.lab_week05.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSkill extends JpaRepository<JobSkill, Long> {
}
