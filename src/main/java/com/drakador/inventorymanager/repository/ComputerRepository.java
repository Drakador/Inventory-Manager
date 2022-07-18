package com.drakador.inventorymanager.repository;

import com.drakador.inventorymanager.model.dto.ComputerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<ComputerDto, Long> {
    ComputerDto getComputerById(Long id);
    List<ComputerDto> getComputersByManufacturer(String manufacturer);
    ComputerDto getComputerBySerialNumber(String serialNumber);
    List<ComputerDto> getComputersByLocation(String location);
    List<ComputerDto> getComputersByModel(String model);

}
