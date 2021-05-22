package subwayLine.service;

import subwayLine.component.DaySimulationComponent;
import subwayLine.model.Station;
import subwayLine.model.SubwayLine;
import subwayLine.repository.SubwayLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaySimulationService {

    private DaySimulationComponent daySimulationComponent;

    public void printHello(String name) {
        System.out.println(daySimulationComponent.getCurrentDate());
        System.out.println("Hello, " + name);
    }

    public void run(SubwayLineRepository subwayLineRepository) {
        SubwayLine data = subwayLineRepository.findLine();
        int i = 1;
        for(Station p: data.getStations()) {
            System.out.printf("Stition %d: %s\n", i++, p.getName());
        }
        System.out.println("///////////////////////");
        i = 1;
        for(int p: data.getDistance()) {
            System.out.printf("Distance between stations %d and %d: %s km\n", i, ++i, p);
        }
    }

    @Autowired
    public void setDaySimulationComponent(DaySimulationComponent daySimulationComponent) {
        this.daySimulationComponent = daySimulationComponent;
    }
}
