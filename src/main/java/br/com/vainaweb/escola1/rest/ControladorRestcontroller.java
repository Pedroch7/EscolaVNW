package br.com.vainaweb.escola1.rest;

import br.com.vainaweb.escola1.entity.Colaborador;
import br.com.vainaweb.escola1.rpo.Colaboradorrpo;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colaborador")

public class ControladorRestcontroller {

    private Colaboradorrpo colaboradorrpo;

    public ControladorRestcontroller(Colaboradorrpo colaboradorrpo) {
        this.colaboradorrpo = colaboradorrpo;
    }

    @GetMapping
    public List<Colaborador> listar () {
        return colaboradorrpo. findAll();

    }

    @GetMapping ("/{id}")
    public Colaborador buscar(@PathVariable Long id) {
        return colaboradorrpo.findById(id).orElse(null);

    }

    @PostMapping
    public ResponseEntity<Colaborador> adcionar(@Valid @RequestBody Colaborador colaborador){

        return new ResponseEntity<> ( colaboradorrpo.save(colaborador), HttpStatus.CREATED);

    }
    @DeleteMapping ("/{id}")
    public void deletar (@PathVariable Long id) {
         colaboradorrpo.deleteById(id);
    }
    @PutMapping ("/{id}")
    public Colaborador atualizar(@PathVariable Long id, @Valid @RequestBody Colaborador colaborador){

        colaborador.setId(id);
        return colaboradorrpo.save(colaborador);
    }
}
