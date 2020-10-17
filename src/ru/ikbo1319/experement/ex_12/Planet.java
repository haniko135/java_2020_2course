package ru.ikbo1319.experement.ex_12;

public enum  Planet {

    Mercury (3.303e+23, 2.4397e6, "Mercury"),
    Venus   (4.869e+24, 6.0518e6, "Venus"),
    Earth   (5.976e+24, 6.37814e6, "Earth"),
    Mars    (6.421e+23, 3.3972e6, "Mars"),
    Jupiter (1.9e+27,   7.1492e7, "Jupiter"),
    Saturn  (5.688e+26, 6.0268e7, "Saturn"),
    Uranus  (8.686e+25, 2.5559e7, "Uranus"),
    Neptune (1.024e+26, 2.4746e7, "Neptune");

    private final double mass;
    private final double radius;
    private final String name;
    private final static double G = 6.67300E-11;

    Planet(double mass, double radius, String name){
        this.mass = mass;
        this.radius = radius;
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }
}
