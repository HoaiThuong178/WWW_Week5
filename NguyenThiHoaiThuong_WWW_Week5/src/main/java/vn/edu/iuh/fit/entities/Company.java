package vn.edu.iuh.fit.entities;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;

@NoArgsConstructor@AllArgsConstructor
@Getter
@Setter
@ToString
public class Company {
    @Id
    private Long id;
    private String name;
    private String about;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Address address;
    private String phone;
    private String webURL;
    private String email;
    @OneToMany(mappedBy = "company")
    private List<Job> jobs;


}
