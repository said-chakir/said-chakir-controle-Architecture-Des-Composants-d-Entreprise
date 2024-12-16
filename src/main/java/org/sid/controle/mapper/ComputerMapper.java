package org.sid.controle.mapper;


 import org.modelmapper.ModelMapper;
 import org.sid.controle.dto.ComputerDTO;
 import org.sid.controle.entities.computer;
 import org.springframework.stereotype.Component;

@Component

public class ComputerMapper {
    private final ModelMapper mapper = new ModelMapper();
    public computer fromcomputer(ComputerDTO computerDTO){
        return mapper.map(computerDTO, computer.class);
    }
    public ComputerDTO fromcomp(ComputerDTO computer){
        return mapper.map(computer, ComputerDTO.class);
    }
}
