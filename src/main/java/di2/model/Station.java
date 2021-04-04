package di2.model;

public class Station {
    //private double chanceOfDelay;
    private String name;
    private di2.model.Train train;

    public Station(){

    }

    public Station(String name){
        this.name = name;
        this.train = null;
        //this.delayTime = delayTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
