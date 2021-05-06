package local.rogerdom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhasConfigs {

    @Bean(name = "aplicationName")
    public String aplicationName(){
        return "\nSistema de Solicitações\n";
    }

}
