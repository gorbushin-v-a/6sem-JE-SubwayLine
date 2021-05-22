package subwayLine.repository;

import subwayLine.model.Station;
import subwayLine.model.SubwayLine;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SubwayLineRepositoryImpl implements SubwayLineRepository{
    private LinkedList<Station> stations = new LinkedList<Station>(Arrays.asList(
        new Station("Milk"),
        new Station("Apple"),
        new Station("Bred"),
        new Station("Cheese"),
        new Station("Orange"),
        new Station("Cherry"),
        new Station("Banana")
    ));
    private List<Integer> dist = Arrays.asList(3, 5, 8, 7, 4, 6);
    private SubwayLine data = new SubwayLine("SubwaySurfers", stations, dist);

    public SubwayLine findLine() {
        return data;
    }
}
