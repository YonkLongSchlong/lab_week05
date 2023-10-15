package yonk.dev.lab_week05;

import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import yonk.dev.lab_week05.entities.Address;
import yonk.dev.lab_week05.entities.Candidate;
import yonk.dev.lab_week05.repositories.AddressRepository;
import yonk.dev.lab_week05.repositories.CandidateRepository;
import yonk.dev.lab_week05.services.CandidateService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

@SpringBootApplication
public class LabWeek05Application {

    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CandidateService candidateService;

//    @Bean
//    CommandLineRunner initData() {
//        return args -> {
//            Random rnd = new Random();
//            for(int i=0; i < 1000; i++){
//                Address address = new Address();
//               address = Address.builder()
//                       .country(CountryCode.VN)
//                       .number(rnd.nextInt(1,1000)+ "")
//                       .zipCode(rnd.nextInt(7000,8000) +"")
//                       .street("Quang Trung")
//                       .city("HCM").build();
//               addressRepository.save(address);
//
//                Candidate candidate = new Candidate();
//                candidate = Candidate.builder()
//                        .name("Name# " + i)
//                        .email("email_" +i+"@gmail.com")
//                        .phone(rnd.nextLong(1111111111L,9999999999L)+"")
//                        .address(address)
//                        .dob(LocalDate.of(1998, rnd.nextInt(1,13), rnd.nextInt(1,29)))
//                        .build();
//                candidateRepository.save(candidate);
//            }
//        };
//    }
    public static void main(String[] args) {
        SpringApplication.run(LabWeek05Application.class, args);
    }
}

