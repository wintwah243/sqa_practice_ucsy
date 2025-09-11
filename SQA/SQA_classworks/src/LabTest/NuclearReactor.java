package LabTest;

public class NuclearReactor {
	private double coreTemperature;
    private double radiationLevel;
    private double pressure;
    
    private static final double MAX_TEMPERATURE = 1200.0;  // Safe limit
    private static final double MAX_RADIATION = 50.0;      // Safe limit in mSv (Millisievert)
    private static final double MAX_PRESSURE = 300.0;      // Safe limit in atmospheres
    
    public NuclearReactor() {
        this.coreTemperature = 900.0;  // Normal temperature
        this.radiationLevel = 20.0;    // Normal radiation level
        this.pressure = 200.0;         // Normal pressure
    }

    public void increaseTemperature(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Temperature increase cannot be negative");
        coreTemperature += amount;
        checkSafety();
    }

    public void increaseRadiation(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Radiation increase cannot be negative");
        radiationLevel += amount;
        checkSafety();
    }

    public void increasePressure(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Pressure increase cannot be negative");
        pressure += amount;
        checkSafety();
    }

    public boolean isSafe() {
        return coreTemperature <= MAX_TEMPERATURE &&
               radiationLevel <= MAX_RADIATION &&
               pressure <= MAX_PRESSURE;
    }

    private void checkSafety() {
        if (!isSafe()) {
            throw new IllegalStateException("Reactor safety compromised! Emergency shutdown required.");
        }
    }

    public String getStatus() {
        return String.format("Core Temperature: %.1f°C, Radiation Level: %.1f mSv, Pressure: %.1f atm",
                coreTemperature, radiationLevel, pressure);
    }
}


