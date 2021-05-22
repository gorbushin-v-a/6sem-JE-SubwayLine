package subwayLine.model;

public class TrainFactory {
    private String name;
    private int count;

    public TrainFactory() {
    }

    public TrainFactory(String name) {
        this.name = name;
        this.count = 0;
    }

    private Train createTrain(int stopTime, int intervalTime){
        String number = Integer.toString(this.count);
        this.count++;
        return new Train(this.name, number, stopTime, intervalTime);
    }

    private TrainOnLine runTrain(int stopTime, int intervalTime, Station station, Direction direction){
        Train train = this.createTrain(stopTime, intervalTime);
        return new TrainOnLine(train, station, direction);
    }
}
