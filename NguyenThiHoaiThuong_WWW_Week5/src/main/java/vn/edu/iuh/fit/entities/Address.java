package vn.edu.iuh.fit.entities;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {
        @Id
        private Long id;
        private String street;
        private String city;
        private CountryCode country;
        private String number;
        private String zipcode;
        @OneToOne(mappedBy = "address")
        private Company company;
        @OneToOne(mappedBy = "address")
        private Candidate candidate;
}
