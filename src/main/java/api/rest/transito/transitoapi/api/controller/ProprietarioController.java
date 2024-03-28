package api.rest.transito.transitoapi.api.controller;

import api.rest.transito.transitoapi.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
        var proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("Marco Túlio Da Silva Rocha");
        proprietario1.setEmail("marcotuliopessoal@gmail.com");
        proprietario1.setTelefone("(31) 99999-9999");

        var proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Maria Clara Da Silva Rocha");
        proprietario2.setEmail("mariaclarasilva@gmail.com");
        proprietario2.setTelefone("(31) 99999-88888");

        return Arrays.asList(proprietario1, proprietario2);
    }
}
