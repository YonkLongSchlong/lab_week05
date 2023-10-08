package yonk.dev.lab_week05.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "job")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long id;
    @Column(name = "job_name")
    private String name;
    @Column(name = "job_desc")
    private String jobDesc;

    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

}
