package jtp.project.first.appconfig;

import jtp.project.first.services.ProfileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    /*@Bean
    public DatabaseRepository mySQLRepository(){
        return new MySQLRepository();
    }*/

    @Bean
    public ProfileService authenticationService(){return new ProfileService();}
}
