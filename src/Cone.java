public class Cone extends Cylinder {
    public Cone(double radius, double h) {
        super(radius, h);
    }

    @Override
    public double findVolume() {
        // Calculate the volume of a cone: (1/3) * π * r^2 * h
        double v = (1.0 / 3.0) * Math.PI * Math.pow(super.radius(), 2) * getH();
        return v;
    }
}
