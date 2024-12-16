package org.sid.controle.service;

import lombok.AllArgsConstructor;
import org.sid.controle.entities.computer;
import org.sid.controle.repository.ComputerRepository;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class ComputerManager {

    private ComputerRepository computerRepository;

    public computer getComputerByProce(String proce) {
        return computerRepository.findByProce(proce);
    }

    public computer saveComputer(computer computer) {
        return computerRepository.save(computer);
    }
}
