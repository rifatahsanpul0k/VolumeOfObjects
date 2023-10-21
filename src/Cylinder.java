public class Cylinder extends MyObject {
    private double h;

    public Cylinder(double radius, double h) {
        super(radius);
        this.h = h;
    }
    double getH(){
        return h;
    }
@Override
    public double findVolume() {
        // Calculate the volume of a cylinder: π * r^2 * h
        return Math.PI * Math.pow(super.radius(), 2) * h;
    }
}
