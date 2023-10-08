package yonk.dev.lab_week05.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yonk.dev.lab_week05.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
