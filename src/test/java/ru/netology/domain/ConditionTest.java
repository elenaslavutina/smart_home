package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {
    @Test
    public void shouldCreate() {
        Condition conditioner = new Condition();
        String expectedName = "Condey";
        assertNull(conditioner.getName());
        conditioner.setName(expectedName);
        assertEquals(expectedName,conditioner.getName());
        System.out.println(conditioner.getName());

    }
    @Test
    public void shouldInit() {
        Condition conditioner = new Condition();
        assertNull(conditioner.getName());
        assertEquals(0, conditioner.getMaxTemperature());
        assertEquals(0, conditioner.getMinTemperature());
        assertEquals(0, conditioner.getCurrentTemperature());
        assertFalse(conditioner.isOn());
            }


    @Test
    public void shouldNotChangeFieldValueMax() {
        Condition conditioner = new Condition();
        conditioner.setCurrentTemperature(100);
        assertEquals(0, conditioner.getCurrentTemperature());

    }
    @Test
    public void shouldNotChangeFieldValueMin() {
        Condition conditioner = new Condition();
        conditioner.setCurrentTemperature(-100);
        assertEquals(0, conditioner.getCurrentTemperature());

    }
    @Test
    public void shouldIncreaseTemperature() {
        Condition conditioner = new Condition();
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(34);
        int max = conditioner.getMaxTemperature();
        int current = conditioner.getCurrentTemperature();
        System.out.println("максимум = " + max + ";  текущая = " + current);
        conditioner.increaseCurrentTemperature();
        current = conditioner.getCurrentTemperature();
        System.out.println("текущая изменена = "  + current);
        assertEquals(35, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldNotIncreaseTemperature() {
        Condition conditioner = new Condition();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(35);
        int max = conditioner.getMaxTemperature();
        int current = conditioner.getCurrentTemperature();
        System.out.println("максимум = " + max + ";  текущая = " + current);
        conditioner.increaseCurrentTemperature();
        current = conditioner.getCurrentTemperature();
        System.out.println("текущая не изменена = "  + current);
        assertEquals(35, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldDecreaseTemperature() {
        Condition conditioner = new Condition();
        conditioner.setMinTemperature(5);
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(10);
        int min = conditioner.getMinTemperature();
        int current = conditioner.getCurrentTemperature();
        System.out.println("минимум = " + min + ";  текущая = " + current);
        conditioner.decreaseCurrentTemperature();
        current = conditioner.getCurrentTemperature();
        System.out.println("текущая изменена = "  + current);
        assertEquals(9, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldNotDecreaseTemperature() {
        Condition conditioner = new Condition();
        conditioner.setMinTemperature(5);
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(5);
        int min = conditioner.getMinTemperature();
        int current = conditioner.getCurrentTemperature();
        System.out.println("минимум = " + min + ";  текущая = " + current);
        conditioner.decreaseCurrentTemperature();
        current = conditioner.getCurrentTemperature();
        System.out.println("текущая неизменена = "  + current);
        assertEquals(5, conditioner.getCurrentTemperature());
    }
}