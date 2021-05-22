package subwayLine.service;

import subwayLine.model.Station;
import subwayLine.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    @Autowired
    private StationRepository stationRepository;

    public List<Station> selectStations(String name) {
        return stationRepository.findByName(name);
    }

    public List<Station> selectStations() {
        return stationRepository.findAll();
    }

    public void updateStation(Station station) {
        stationRepository.update(station);
    }

    public void insertStation(Station station) {
        stationRepository.insert(station);
    }

}
