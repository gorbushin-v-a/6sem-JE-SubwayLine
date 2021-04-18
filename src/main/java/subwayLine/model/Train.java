package di2.model;

public class Train {

    private String uName;
    private int stopTime;
    private int intervalTime;

    public Train(){
    }

    public Train(String factoryName, String number, int stopTime, int intervalTime){
        this.uName = String.format("%s_%s", factoryName, number);
        this.stopTime = stopTime;
        this.intervalTime = intervalTime;
    }
}
