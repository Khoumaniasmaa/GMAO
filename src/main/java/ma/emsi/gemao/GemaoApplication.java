package ma.emsi.gemao;

import ma.emsi.gemao.entities.Intervention;
import ma.emsi.gemao.repositories.InterventionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GemaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GemaoApplication.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(InterventionRepository interventionRepository){
        return args -> {interventionRepository.save(
                new Intervention(null, "vidange", new Date(), "cc", "cc", new Date(), "en cours","desc"
                        ,"kiko","ss","dd"));;
            interventionRepository.save(
                    new Intervention(null, "Lavage", new Date(), "ff", "cc", new Date(), "en cours","desc","zen"
                    ,"hh","hh"));
            interventionRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }
}
