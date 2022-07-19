package com.drakador.inventorymanager.model.dto;

import lombok.Builder;
import java.util.Date;

@Builder
public class ComputerDto {
    private Long id;
    private String serialNumber;
    private String manufacturer;
    private String model;
    private String location;
    private Date dateMoved;

    private boolean deleted = Boolean.FALSE;
}
