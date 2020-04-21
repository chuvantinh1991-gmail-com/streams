import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SensorTest {
    @Test
    void Truename() {
        Sensor sensor1 = new Sensor("abc");
        Assert.assertEquals("abc",sensor1.getName());
    }

    @Test
    void falseName() throws Exception{
        Sensor sensor1 = new Sensor("falsename");
        try {
            Assert.assertEquals("abc",sensor1.getName());
        }catch (Exception e){
            System.out.print(e);
        }
    }
}