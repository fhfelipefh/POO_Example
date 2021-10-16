package com.company.felipe.test;

import com.company.felipe.model.Bottle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void shoudReturnCorrectCapacity(){
        Bottle bottle = new Bottle();
        bottle.setCapacityMax(500);
        bottle.setWeight(550);
        bottle.setThermal(false);
        assertEquals(500,bottle.getCapacityMax());
    }



}