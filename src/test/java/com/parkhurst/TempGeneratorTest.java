package com.parkhurst;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.parkhurst.temperatureconverator.TempGenerator;

import static org.junit.jupiter.api.Assertions.*;

public class TempGeneratorTest {

    @BeforeAll
    public static void setUp(){
        System.out.println("Test Begins!\n");
    }
    @Test
    @DisplayName("Celsius to Fahrenheit1")
    void cToFTest1() {
        float tempVal = TempGenerator.cToF(0);
        assertTrue(tempVal == 32, () -> "Expects 32 & got: "+ tempVal);
    }

    @Test
    @DisplayName("Celsius to Fahrenheit2")
    void cToFTest2() {
        float tempVal = TempGenerator.cToF(100);
        assertTrue(tempVal == 212,() -> "Expects 212 & got: "+ tempVal);
    }

    @Test
    @DisplayName("Celsius to Fahrenheit3")
    void cToFTest3() {
        float tempVal =Math.round(TempGenerator.cToF(-6));
        assertTrue(tempVal == 21, () -> "Expects 21 & got: "+ tempVal);
    }

    @Test
    @DisplayName("Fahrenheit to Celsius1")
    void fToCTest1() {
        float tempVal = Math.round(TempGenerator.fToC(-6));
        assertTrue(-21==tempVal, () -> "Expects -21 & got: "+ tempVal);
    }

    @Test
    @DisplayName("Fahrenheit to Celsius2")
    void fToCTest2() {
        float tempVal = Math.round(TempGenerator.fToC(212));
        assertTrue(tempVal==100, () -> "Expects 100 & got: "+ tempVal);
    }

    @Test
    @DisplayName("Fahrenheit to Celsius3")
    void fToCTest3() {
        float tempVal = Math.round(TempGenerator.fToC((float) 53.56));
        assertTrue(tempVal==12, () -> "Expects 12 & got: "+ tempVal);
    }

}








