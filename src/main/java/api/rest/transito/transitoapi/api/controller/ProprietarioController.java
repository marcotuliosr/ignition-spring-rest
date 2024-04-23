package api.rest.transito.transitoapi.api.controller;

import api.rest.transito.transitoapi.domain.model.Proprietario;
import api.rest.transito.transitoapi.domain.repository.ProprietarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/proprietarios")
public class ProprietarioController {

    private ProprietarioRepository proprietarioRepository;

    @GetMapping
    public List<Proprietario> listar() {
        return proprietarioRepository.findAll();
    }

    @GetMapping("/{proprietarioId}")
    public ResponseEntity<Proprietario> buscar(@PathVariable Long proprietarioId) {
        return proprietarioRepository.findById(proprietarioId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());


    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Proprietario adcionar(@RequestBody Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }
}
