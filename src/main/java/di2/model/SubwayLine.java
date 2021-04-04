package di2.model;

import java.util.LinkedList;
import java.util.List;

public class SubwayLine {
    private String name;

    private LinkedList<Station> stations;
    private List<Integer> distance;

    private List<TrainOnLine> trains;

    public SubwayLine(){

    }

    public SubwayLine(String name, LinkedList<Station> stations, List<Integer> distance){
        this.name = name;
        this.stations = stations;
        this.distance = distance;
        this.trains = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Station> getStations() {
        return stations;
    }

    public void setStations(LinkedList<Station> stations) {
        this.stations = stations;
    }

    public List<Integer> getDistance() {
        return distance;
    }

    public void setDistance(List<Integer> distance) {
        this.distance = distance;
    }

    public List<TrainOnLine> getTrains() {
        return trains;
    }

    public void setTrains(List<TrainOnLine> trains) {
        this.trains = trains;
    }
}
