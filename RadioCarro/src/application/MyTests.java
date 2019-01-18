package application;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyTests {

    @Test
    public void radioTester() {
        Radio tester = new Radioimp(); // MyClass is tested

        // assert statements
        tester.toggle();
        tester.toggle();
        assertEquals(true, tester.getState(), "Estado inicial es apagado");
        
    }
}