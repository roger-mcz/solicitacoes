package local.rogerdom;

import local.rogerdom.domain.Aluno;
import local.rogerdom.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SolicitacoesApplication {

    /*
    @Autowired
    AlunoRepository alunoRepository;

     gravando antes de usar o REST
    @Bean
    public CommandLineRunner run( ){
        return args -> {
            // atenção p/ data sendo definida la na classe!
            Aluno aluno = new Aluno(null, "Aluno 01", "Turma A", "aluno.01@gmail.com");
            alunoRepository.save(aluno);
        };
    }
*/
    public static void main(String[] args) {
        SpringApplication.run(SolicitacoesApplication.class, args);
    }
}
