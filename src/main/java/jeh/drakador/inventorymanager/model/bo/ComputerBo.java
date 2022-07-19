package jeh.drakador.inventorymanager.model.bo;

import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="computers")
@Data
@Where(clause="is_owned=1")
public class ComputerBo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Serial Number of the computer */
    @Column(name="serial_number", nullable = false)
    private String serialNumber;

    /** Manufacturer of the computer */
    @Column(name="manufacturer")
    private String manufacturer;

    /** Model Name/Number of the Computer */
    @Column(name="model")
    private String model;

    /** Current location that the computer resides */
    @Column(name="location")
    private String location;

    /** Date that the computer was moved/placed in current location */
    @Column(name="date_moved")
    private Date dateMoved;

    /** Deleted flag or whether the system is still owned by the program user or not. */
    @Column(name="is_owned")
    private boolean deleted;

}
