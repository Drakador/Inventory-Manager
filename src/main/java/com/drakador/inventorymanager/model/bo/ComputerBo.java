package com.drakador.inventorymanager.model.bo;

import lombok.*;

import javax.persistence.*;

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

    @Column(name="serial_number", nullable = false)
    private String serialNumber;

    @Column(name="manufacturer")
    private String manufacturer;

    @Column(name="model")
    private String model;

    @Column(name="location")
    private String location;

    private boolean deleted = Boolean.FALSE;

    //TODO: the rest of the columns



}
