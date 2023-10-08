package yonk.dev.lab_week05.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "job_skill")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSkill {

    @EmbeddedId
    private JobSkillKey id;

    @ManyToOne
    @MapsId("jobId")
    @JoinColumn(name = "job_id")
    private Job job;

    @ManyToOne
    @MapsId("skillId")
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "skill_level")
    private String skillLevel;

    @Column(name = "more_infos")
    private String moreInfos;

}
