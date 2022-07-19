package jeh.drakador.inventorymanager.mapper;

import jeh.drakador.inventorymanager.model.bo.ComputerBo;
import jeh.drakador.inventorymanager.model.dto.ComputerDto;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper implements DtoBoMapper<ComputerDto, ComputerBo> {
    @Override
    public ComputerDto toDto(ComputerBo localBo) {
        return ComputerDto.builder()
                .model(localBo.getModel())
                .dateMoved(localBo.getDateMoved())
                .location(localBo.getLocation())
                .manufacturer(localBo.getManufacturer())
                .serialNumber(localBo.getSerialNumber())
                .deleted((localBo.isDeleted()))
                .build();
    }

    @Override
    public ComputerBo toBo(ComputerDto localDto) {
        return ComputerBo.builder()
                .model(localDto.getModel())
                .dateMoved(localDto.getDateMoved())
                .location(localDto.getLocation())
                .serialNumber(localDto.getSerialNumber())
                .manufacturer(localDto.getManufacturer())
                .deleted(localDto.isDeleted())
                .build();
    }

    @Override
    public ComputerBo updateBo(ComputerDto localDto, ComputerBo localBo) {
        return ComputerBo.builder()
                .id(localBo.getId())
                .model(localDto.getModel())
                .dateMoved(localDto.getDateMoved())
                .location(localDto.getLocation())
                .serialNumber(localDto.getSerialNumber())
                .manufacturer(localDto.getManufacturer())
                .deleted(localDto.isDeleted())
                .build();
    }
}
