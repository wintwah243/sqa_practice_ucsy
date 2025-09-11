package LabTest;

import static org.junit.Assert.*;
import org.junit.Test;

public class NuclearReactorTest {

    @Test
    public void testInitialStatus() {
        NuclearReactor reactor = new NuclearReactor();
        assertTrue(reactor.isSafe());
        assertEquals("Core Temperature: 900.0°C, Radiation Level: 20.0 mSv, Pressure: 200.0 atm",
                     reactor.getStatus());
    }

    @Test
    public void testIncreaseTemperatureWithinLimit() {
        NuclearReactor reactor = new NuclearReactor();
        reactor.increaseTemperature(100.0); 
        assertTrue(reactor.isSafe());
    }

    @Test(expected = IllegalStateException.class)
    public void testIncreaseTemperatureBeyondLimit() {
        NuclearReactor reactor = new NuclearReactor();
        reactor.increaseTemperature(400.0); 
    }

    @Test
    public void testIncreaseRadiationWithinLimit() {
        NuclearReactor reactor = new NuclearReactor();
        reactor.increaseRadiation(20.0); 
        assertTrue(reactor.isSafe());
    }

    @Test(expected = IllegalStateException.class)
    public void testIncreaseRadiationBeyondLimit() {
        NuclearReactor reactor = new NuclearReactor();
        reactor.increaseRadiation(40.0); 
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeRadiationIncreaseThrowsException() {
        NuclearReactor reactor = new NuclearReactor();
        reactor.increaseRadiation(-10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativePressureIncreaseThrowsException() {
        NuclearReactor reactor = new NuclearReactor();
        reactor.increasePressure(-5.0);
    }

    @Test
    public void testIncreasePressureWithinLimit() {
        NuclearReactor reactor = new NuclearReactor();
        reactor.increasePressure(50.0); 
        assertTrue(reactor.isSafe());
    }

    @Test(expected = IllegalStateException.class)
    public void testIncreasePressureBeyondLimit() {
        NuclearReactor reactor = new NuclearReactor();
        reactor.increasePressure(120.0); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeTemperatureIncreaseThrowsException() {
        NuclearReactor reactor = new NuclearReactor();
        reactor.increaseTemperature(-50.0);
    }

    
}
