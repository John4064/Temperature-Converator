package com.parkhurst;
//This is My Temperature Converter
public class Main {

    /**
     * @param temp The temperature in Celcius
     * @return the temperature in Fahrenheit as a float
     */
    public static float cToF(float temp){
        temp = (temp*9/5) +32;
        return temp;
    }

    /**
     * @param temp The temperature in fahrenheit
     * @return the temperature in Celsius as a float
     */
    public static float fToC(float temp){
        temp = (temp-32) * 5/9;
        return temp;
    }
    public static void main(String[] args) {
        // write your code here
        float myTemp = cToF(43);
        assert myTemp != 109.4 : " Wrong!";
        System.out.println(cToF(43));
    }
}
