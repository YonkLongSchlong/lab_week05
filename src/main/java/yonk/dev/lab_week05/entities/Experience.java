package yonk.dev.lab_week05.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "experience")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private long id;
    @Column(name = "company")
    private String company;
    @Column(name = "work_desc")
    private String workDesc;
    @Column(name = "role")
    private String role;
    @Column(name = "from_date", columnDefinition = "date")
    private LocalDateTime fromDate;
    @Column(name = "to_date",  columnDefinition = "date")
    private LocalDateTime toDate;

    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

}
