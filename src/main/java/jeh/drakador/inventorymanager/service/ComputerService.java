package jeh.drakador.inventorymanager.service;

import jeh.drakador.inventorymanager.repository.ComputerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ComputerService {

    private ComputerRepository computerRepository;

    public ComputerService(ComputerRepository computerRepository){
        super();
        this.computerRepository = computerRepository;
    }

}
