package local.rogerdom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SolicitacoesApplication {

    @GetMapping("/hello")
    public String helloW(){
        return "Olá mundo";
    }

    public static void main(String[] args) {
        SpringApplication.run(SolicitacoesApplication.class, args);
    }
}
