package com.drakador.inventorymanager.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="computers")
public class computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="serial_number", nullable = false)
    private String serialNumber;

    //TODO: the rest of the columns



}
