/**
 * Name: Noor Al Salihi
 * Course: CSD402 – Java Programming
 * Module: 6.2 Programming Assignment
 *
 * Description:
 * This program defines a Fan class with speed constants, fields, constructors,
 * getters/setters, and a toString() method. The test code creates two Fan
 * objects (default and custom) and demonstrates class functionality.
 */

public class FanTest {

    public static void main(String[] args) {
        // Fan created using the default constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1 (default constructor):");
        System.out.println(fan1);
        System.out.println();

        // Fan created using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "blue");
        System.out.println("Fan 2 (argument constructor):");
        System.out.println(fan2);
        System.out.println();

        // Demonstrate setters/getters on fan1
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8.5);
        fan1.setColor("black");

        System.out.println("Fan 1 after using setters:");
        System.out.println("Speed: " + fan1.getSpeed());
        System.out.println("On: " + fan1.isOn());
        System.out.println("Radius: " + fan1.getRadius());
        System.out.println("Color: " + fan1.getColor());
        System.out.println("toString(): " + fan1);
    }
}

/**
 * Class: Fan
 * Contains constants for speed, fields for fan state, constructors,
 * getters/setters, and a toString() method.
 */
class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6.0;
    private String color = "white";

    /**
     * No-argument constructor that sets fields to default values.
     */
    public Fan() {
        // defaults already set in field declarations
    }

    /**
     * Argument constructor that sets all fields.
     *
     * @param speed  the speed constant (STOPPED, SLOW, MEDIUM, FAST)
     * @param on     whether the fan is on or off
     * @param radius the radius of the fan
     * @param color  the color of the fan
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and setters for mutable fields

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a description of the fan's current state.
     *
     * @return formatted fan state string
     */
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON - speed: " + speedToText(speed) +
                    ", radius: " + radius +
                    ", color: " + color;
        } else {
            return "Fan is OFF - radius: " + radius +
                    ", color: " + color;
        }
    }

    // Helper method to convert speed constant to text
    private String speedToText(int speed) {
        switch (speed) {
            case STOPPED:
                return "STOPPED";
            case SLOW:
                return "SLOW";
            case MEDIUM:
                return "MEDIUM";
            case FAST:
                return "FAST";
            default:
                return "UNKNOWN";
        }
    }
}
