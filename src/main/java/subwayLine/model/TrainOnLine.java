package subwayLine.model;

public class TrainOnLine {

    private Train train;
    private Station station;
    private Direction direction;

    public TrainOnLine(){

    }

    public TrainOnLine(Train train, Station station, Direction direction){
        this.train = train;
        this.direction = direction;
        this.station = station;
    }
}
