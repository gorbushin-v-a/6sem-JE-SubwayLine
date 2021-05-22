import subwayLine.component.DumbComponent;
import subwayLine.config.ApplicationConfig;
import subwayLine.config.HiberConfig;
import subwayLine.model.Station;
import subwayLine.repository.StationRepository;
import subwayLine.repository.SubwayLineRepository;
import subwayLine.service.DumbService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import subwayLine.service.DaySimulationService;
import subwayLine.service.StationService;

import java.util.List;

@Configuration
@ComponentScan(
        basePackageClasses = {DumbService.class,
                ApplicationConfig.class,
                DumbComponent.class,
                SubwayLineRepository.class,
                HiberConfig.class, StationService.class, StationRepository.class})
public class SubwayApplication {

    public static void main(String[] args) {
        /** ApplicationContext context = new AnnotationConfigApplicationContext(SubwayApplication.class);
        DaySimulationService daySimulationService = context.getBean(DaySimulationService.class);
        daySimulationService.printHello("user!");
        SubwayLineRepository subwayLineRepository = context.getBean(SubwayLineRepository.class);
        daySimulationService.run(subwayLineRepository); **/

        ApplicationContext context = new AnnotationConfigApplicationContext(SubwayApplication.class);
        StationService stationService = context.getBean(StationService.class);
        stationService.insertStation(new Station("Apple"));
        List<Station> stations = stationService.selectStations();
        stations.forEach(System.out::println);
    }
}
