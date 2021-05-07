package local.rogerdom.rest;

import local.rogerdom.domain.Aluno;
import local.rogerdom.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.criteria.CriteriaBuilder;

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

    @GetMapping("{id}")
    public Aluno findById( @PathVariable Integer id){
        return alunoRepository
                .findById(id)
                .orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id){
        alunoRepository
                .findById(id)
                .map( aluno -> {
                    alunoRepository.delete(aluno);
                    return Void.TYPE;
                })
                .orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateById(@PathVariable Integer id, @RequestBody Aluno alunoUpdate){
        alunoRepository
                .findById(id)
                .map( aluno -> {
                    alunoUpdate.setId(aluno.getId());
                    return alunoRepository.save(alunoUpdate);
                })
                .orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }



}
