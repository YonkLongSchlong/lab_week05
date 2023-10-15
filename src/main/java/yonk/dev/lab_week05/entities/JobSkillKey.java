package yonk.dev.lab_week05.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class JobSkillKey implements Serializable {

    @Column(name = "job_id")
    private long jobId;

    @Column(name = "skill_id")
    private long skillId;

}
