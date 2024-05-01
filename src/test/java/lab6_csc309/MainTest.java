package lab6_csc309;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest  {

    @Test
    void hypotenuse() {
        Assertions.assertEquals(
            Main.hypotenuse(10, 20), 
            22.360679774997898
        );
    }
}
