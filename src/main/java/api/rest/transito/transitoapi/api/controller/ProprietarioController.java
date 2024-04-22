package api.rest.transito.transitoapi.api.controller;

import api.rest.transito.transitoapi.domain.model.Proprietario;
import api.rest.transito.transitoapi.domain.repository.ProprietarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
public class ProprietarioController {

    private ProprietarioRepository proprietarioRepository;

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
        return proprietarioRepository.findByNome("Jose da silva");
    }
}
