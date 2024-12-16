package org.sid.controle.service;

import org.sid.controle.entities.computer;

public interface ComputerService
{
    computer getComputerByProce(String proce);
    computer saveComputer(computer computer);
}
