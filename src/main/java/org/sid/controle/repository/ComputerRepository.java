package org.sid.controle.repository;

import org.sid.controle.entities.computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<computer, Long> {
    computer findByProce(String proce);

}