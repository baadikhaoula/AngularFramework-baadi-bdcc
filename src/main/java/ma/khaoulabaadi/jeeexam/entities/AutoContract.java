package ma.khaoulabaadi.jeeexam.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("AUTO")
@Data @NoArgsConstructor @AllArgsConstructor
public class AutoContract extends InsuranceContract {
    private String immatriculation;
    private String brand;
    private String model;
}