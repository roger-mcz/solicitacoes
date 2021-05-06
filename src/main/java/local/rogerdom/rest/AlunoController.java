package local.rogerdom.rest;

import local.rogerdom.domain.Aluno;
import local.rogerdom.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno save(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);

    }

}
