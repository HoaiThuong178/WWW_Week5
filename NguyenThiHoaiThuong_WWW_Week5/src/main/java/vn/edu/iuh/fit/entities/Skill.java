package vn.edu.iuh.fit.entities;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;
import vn.edu.iuh.fit.enums.SkillType;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Skill {
    @Id
    private Long id;
    private SkillType type;
    private String skillName;
    private String skillDescription;
    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;
    @OneToOne(mappedBy = "skill")
    private CandidateSkill candidateSkill;
}
