package application;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;

public class MyTests {

    @Test
    public void radioTester() {
        Radio tester = new Radioimp(); // MyClass is tested

        // assert statements
        //Aquí se ejecutara nuestro test.
        tester.toggle();
        assertEquals(true, tester.getState(), "Se acaba de prender el radio. Debe estar encendido.");
        tester.changeStation(true);
        tester.changeStation(true);
        tester.saveStation(3);
        tester.changeFrequency();
        tester.changeStationButton(3);
        tester.getStation();
        assertEquals(true, tester.getFrequency(), "Debe estar en esta frecuencia FM.");
        assertEquals(0.3,88.3, tester.getStation(), "Debe estar en esta estacion que se guarda en el 3.");
        
    }
}