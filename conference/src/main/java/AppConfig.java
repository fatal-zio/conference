import org.fatalzio.repository.SpeakerRepository;
import org.fatalzio.repository.HibernateSpeakerRepositoryImpl;
import org.fatalzio.service.SpeakerService;
import org.fatalzio.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"org.fatalzio"})
public class AppConfig {
    /*@Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        //Constructor injection
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        //Alternately we could use Setter injection
        //service.setRepository(getSpeakerRepository());

        SpeakerServiceImpl service = new SpeakerServiceImpl();

        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }*/
}
