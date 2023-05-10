package com.example.temperatureconvertor;

public class ConvertTemp {
    public ConvertTemp(){}

    public double celsiusToFahrenheit( double temp){
        return ((temp*9)/5)+32;
    }

    public double celsiusToKelvin( double temp){
        return temp+273.15;
    }

    public double kelvinToCelsius( double temp){
        return temp - 273.15;
    }
    public double kelvinToFehrenit( double temp){
        return (temp - 273.15) * 9/5 + 32;
    }

    public double fehrToCelsius( double temp){
        return (temp - 32) / 1.8;
    }
    public double fehrToKelvin( double temp){
        return (temp - 32) * 5 / 9 + 273.15;
    }
}
