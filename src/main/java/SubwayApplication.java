import di2.component.DumbComponent;
import di2.config.ApplicationConfig;
import di2.repository.SubwayLineRepository;
import di2.service.DumbService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import di2.service.DaySimulationService;

@Configuration
@ComponentScan(
        basePackageClasses = {DumbService.class,
                ApplicationConfig.class,
                DumbComponent.class,
                SubwayLineRepository.class})
public class SubwayApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SubwayApplication.class);
        DaySimulationService daySimulationService = context.getBean(DaySimulationService.class);
        daySimulationService.printHello("user!");
        SubwayLineRepository subwayLineRepository = context.getBean(SubwayLineRepository.class);
        daySimulationService.run(subwayLineRepository);
    }
}
