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
        assertEquals(expectedName, conditioner.getName());
    }

    @Test
    public void shouldNotChangeCurrentTemperatureUpperMax() {
        Condition conditioner = new Condition();
        conditioner.setCurrentTemperature(100);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotChangeCurrentTemperatureUnderMin() {
        Condition conditioner = new Condition();
        conditioner.setCurrentTemperature(-100);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldChangeCurrentTemperatureOnUpperBounder() {
        Condition conditioner = new Condition();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(35);
        int max = conditioner.getMaxTemperature();
        int current = conditioner.getCurrentTemperature();
        assertEquals(35, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldChangeCurrentTemperatureOnBottomBounder() {
        Condition conditioner = new Condition();
        conditioner.setMinTemperature(5);
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(5);
        int min = conditioner.getMinTemperature();
        int current = conditioner.getCurrentTemperature();
        assertEquals(5, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseTemperature() {
        Condition conditioner = new Condition();
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(34);
        int max = conditioner.getMaxTemperature();
        int current = conditioner.getCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        current = conditioner.getCurrentTemperature();
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
        conditioner.increaseCurrentTemperature();
        current = conditioner.getCurrentTemperature();
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
        conditioner.decreaseCurrentTemperature();
        current = conditioner.getCurrentTemperature();
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
        conditioner.decreaseCurrentTemperature();
        current = conditioner.getCurrentTemperature();
        assertEquals(5, conditioner.getCurrentTemperature());
    }
}