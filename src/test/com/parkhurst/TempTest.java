package test.com.parkhurst;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.parkhurst.Main;

import static org.junit.jupiter.api.Assertions.*;

public class TempTest {

    @BeforeAll
    public static void setUp(){
        System.out.println("Test Begins!\n");
    }
    @Test
    @DisplayName("Celsius to Fahrenheit")
    void cToFTest1() {
        float tempVal =Main.cToF(0);
        assertTrue(tempVal == 32);
    }

    @Test
    @DisplayName("Celsius to Fahrenheit2")
    void cToFTest2() {
        float tempVal =Main.cToF(100);
        assertTrue(tempVal == 212);
    }

    @Test
    @DisplayName("Celsius to Fahrenheit3")
    void cToFTest3() {
        float tempVal =Main.cToF(32);
        System.out.println("Expects 89.6 & got: "+ tempVal);
        assertTrue(tempVal == 89.6);
    }

    @Test
    @DisplayName("Fahrenheit to Celsius")
    void fToCTest() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Invalid Inputs")
    void badInpTest(){

    }
}