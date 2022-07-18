package com.drakador.inventorymanager.mapper;

import com.drakador.inventorymanager.controller.DtoBoMapper;
import com.drakador.inventorymanager.model.bo.ComputerBo;
import com.drakador.inventorymanager.model.dto.ComputerDto;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper implements DtoBoMapper<ComputerDto, ComputerBo> {
    @Override
    public ComputerDto toDto(ComputerBo localBo) {
        return null;
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
