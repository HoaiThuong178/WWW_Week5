package vn.edu.iuh.fit.entities;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Candidate {
    @Id
    private Long id;
    private LocalDate dob;
    private String email;
    private String fullName;
    private String phone;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Address address;
    @OneToMany(mappedBy = "candidate")
    private List<Experience> experiences;
    @OneToMany(mappedBy = "candidate")
    private List<CandidateSkill> candidateSkills;
}
