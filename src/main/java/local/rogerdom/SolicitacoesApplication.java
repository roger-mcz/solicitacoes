package local.rogerdom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SolicitacoesApplication {

    @Autowired
    @Qualifier("aplicationName")
    private String nomeAplicacao;

    @GetMapping("/hello")
    public String helloW(){
        return nomeAplicacao;
    }

    public static void main(String[] args) {
        SpringApplication.run(SolicitacoesApplication.class, args);
    }
}
