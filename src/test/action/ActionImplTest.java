package action;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActionImplTest {
    @Test
    public void TestminusDegree(){
        ActionImpl AI1 = new ActionImpl();
        Assert.assertEquals(-1, AI1.minusDegree(1, 2));
    }
}