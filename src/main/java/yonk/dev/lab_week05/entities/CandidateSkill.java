package yonk.dev.lab_week05.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "candidate_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateSkill {
    @EmbeddedId
    private CandidateSkillKey id;

    @ManyToOne
    @MapsId("canId")
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @ManyToOne
    @MapsId("skillId")
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "skill_level")
    private int skillLevel;

    @Column(name = "more_infos")
    private String moreInfos;

}
