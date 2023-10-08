package vn.edu.iuh.fit.entities;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import vn.edu.iuh.fit.enums.SkillLevel;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class JobSkill {
    private SkillLevel skillLevel;
    @Id
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Job job;
    private String mareInfos;
    @Id
    @OneToMany
    @JoinColumn(referencedColumnName = "id")
    private Skill skill;

}
