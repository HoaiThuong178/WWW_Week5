package vn.edu.iuh.fit.entities;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Job {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Company company;
    private String decription;
    private String name;
    @OneToMany(mappedBy = "job")
    private List<JobSkill> jobSkills;
}
