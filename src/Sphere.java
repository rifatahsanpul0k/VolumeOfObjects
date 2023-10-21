public class Sphere extends MyObject{
    public Sphere(double radius) {
        super(radius);
    }

    @Override
    double findVolume() {
        double v = (4/3)*Math.PI*Math.pow(super.radius(),3);
        return v;
    }
}
