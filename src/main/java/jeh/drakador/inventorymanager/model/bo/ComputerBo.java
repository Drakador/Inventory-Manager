package jeh.drakador.inventorymanager.model.bo;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="computers")
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

    private boolean deleted = Boolean.FALSE;

    //TODO: the rest of the columns



}
