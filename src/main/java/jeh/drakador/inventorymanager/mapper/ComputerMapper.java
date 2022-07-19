package jeh.drakador.inventorymanager.mapper;

import jeh.drakador.inventorymanager.model.bo.ComputerBo;
import jeh.drakador.inventorymanager.model.dto.ComputerDto;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper implements DtoBoMapper<ComputerDto, ComputerBo> {
    @Override
    public ComputerDto toDto(ComputerBo localBo) {
        return ComputerDto.builder()
                .build();
    }

    @Override
    public ComputerBo toBo(ComputerDto localDto) {
        return null;
    }

    @Override
    public ComputerBo updateBo(ComputerDto localDto, ComputerBo localBo) {
        return null;
    }
}
