import java.io.*;
import java.util.Random;

public class Sensor {
    private String name;
    private long created_at; //currentTimeMillis()
    private float value;

    public Sensor(String name){
        this.name = name;
        this.created_at = System.currentTimeMillis();
        this.value = this.createRandomValue(1, 100);
    }

    public String getName(){
        return this.name;
    }

    public float createRandomValue(float min, float max){
        Random rd = new Random();
        return rd.nextFloat() * (max - min) + min;
    }

    public String toString(){
        return  "Name of sensor is: " + this.name + "\n"
                + "Date time : " + this.created_at + "\n"
                + "Value : " + this.value + "\n" + "\n";
    }
}
