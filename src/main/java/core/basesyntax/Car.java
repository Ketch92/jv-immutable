package core.basesyntax;

import java.util.List;

/**
 * Make this class immutable. See requirements in the README file
 */
public class Car {
    private int year;
    private String color;
    private List<Wheel> wheels;
    private Engine engine;

    public Car(int year, String color, List<Wheel> wheels, Engine engine) {
        this.year = year;
        this.color = color;
        this.wheels = wheels;
        this.engine = engine;
    }

    public Car changeEngine(Engine engine) {
        return null;
    }

    public Car changeColor(String newColor) {
        return null;
    }

    public Car addWheel(Wheel newWheel) {
        return null;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public Engine getEngine() {
        return engine;
    }
}
