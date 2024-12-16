package org.sid.controle.web;
import lombok.AllArgsConstructor;
import org.sid.controle.entities.computer;
import org.sid.controle.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ComputerGraphQLController {
    private ComputerService computerService;

    @QueryMapping
    public computer getComputerByProce(@Argument String proce) {
        return computerService.getComputerByProce(proce);
    }

    @MutationMapping
    public computer saveComputer(@Argument computer computer) {
        return computerService.saveComputer(computer);
    }
}
