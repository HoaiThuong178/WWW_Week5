package vn.edu.iuh.fit.entities;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;
import vn.edu.iuh.fit.enums.SkillLevel;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CandidateSkill {
    private SkillLevel skillLevel;
    @Id
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Candidate candidate;
    @Id
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Skill skill;
    private String moreInfos;
}
