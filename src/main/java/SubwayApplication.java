import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import subwayLine.component.DumbComponent;
import subwayLine.component.StationRowMapper;
import subwayLine.config.ApplicationConfig;
import subwayLine.config.JdbcConfig;
import subwayLine.repository.SubwayLineRepository;
import subwayLine.service.DumbService;
import subwayLine.service.JdbcService;

@Configuration
@ComponentScan(
        basePackageClasses = {DumbService.class,
                ApplicationConfig.class,
                DumbComponent.class,
                SubwayLineRepository.class,
                JdbcConfig.class, JdbcService.class, StationRowMapper.class})
public class SubwayApplication {

    public static void main(String[] args) {
        /** ApplicationContext context = new AnnotationConfigApplicationContext(SubwayApplication.class);
        DaySimulationService daySimulationService = context.getBean(DaySimulationService.class);
        daySimulationService.printHello("user!");
        SubwayLineRepository subwayLineRepository = context.getBean(SubwayLineRepository.class);
        daySimulationService.run(subwayLineRepository); **/

        ApplicationContext context = new AnnotationConfigApplicationContext(SubwayApplication.class);

        JdbcService testJdbc = context.getBean(JdbcService.class);
        testJdbc.testTemplate();
    }
}
