package jeh.drakador.inventorymanager.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ComputerDto {
    private String serialNumber;
    private String manufacturer;
    private String model;
    private String location;
    private Date dateMoved;

    private boolean deleted = Boolean.FALSE;
}
