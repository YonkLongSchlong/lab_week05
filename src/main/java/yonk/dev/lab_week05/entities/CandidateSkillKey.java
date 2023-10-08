package yonk.dev.lab_week05.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateSkillKey implements Serializable {
    @Column(name = "can_id")
    private long canId;

    @Column(name = "skill_id")
    private long skillId;

}
