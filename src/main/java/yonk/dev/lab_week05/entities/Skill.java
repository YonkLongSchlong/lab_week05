package yonk.dev.lab_week05.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;
    @Column(name = "skill_name")
    private String skillName;
    @Column(name = "skill_type", columnDefinition = "tinyint")
    private int skillType;
    @Column(name = "skill_desc")
    private String skillDesc;

}
