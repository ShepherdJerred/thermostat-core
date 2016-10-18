package com.shepherdjerred.thermostat.core;

import com.pi4j.wiringpi.Gpio;

public class GpioWrapper {

    private static GpioWrapper gpioWrapper;

    static {
        Gpio.wiringPiSetup();
    }

    public static GpioWrapper getGpioWrapper() {
        return gpioWrapper;
    }

}
