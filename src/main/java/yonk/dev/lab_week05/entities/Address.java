package yonk.dev.lab_week05.entities;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;

@Entity
@Table(name="address")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private long id;
    @Column(name = "country")
    private CountryCode country;
    @Column(name = "zipcode")
    private String zipCode;
    @Column(name = "number")
    private String number;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;

    @OneToOne(mappedBy = "address")
    private Company company;

    @OneToOne(mappedBy = "address")
    private Candidate candidate;

    @Override
    public String toString() {
        return number + ", " + street + ", " + city + ", " + zipCode + ", " + country;

    }
}