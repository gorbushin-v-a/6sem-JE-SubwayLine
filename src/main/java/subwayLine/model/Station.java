package subwayLine.model;

import javax.persistence.*;

public class Station {

    private Integer id;

    //private double chanceOfDelay;

    private String name;

    //private subwayLine.model.Train train;

    public Station(){
    }

    public Station(String name){
        this.name = name;
        //this.train = null;
        //this.delayTime = delayTime;
    }

    public Station(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** public Train getTrain() {
        return train;
    } **/

    /** public void setTrain(Train train) {
        this.train = train;
    } **/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", name='" + name +
                "'}";
    }
}
