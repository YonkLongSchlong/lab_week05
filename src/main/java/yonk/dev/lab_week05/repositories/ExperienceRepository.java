package yonk.dev.lab_week05.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yonk.dev.lab_week05.entities.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
