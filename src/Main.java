public class Main {
    public static void main(String[] args) {
        MyObject object1 = new MyObject(3.9);
        Sphere sphere = new Sphere(object1.radius());
        System.out.println("Volume of Sphere: "+sphere.findVolume());
        Cylinder cylinder = new Cylinder(20,10);
        System.out.println("Volume of Cylinder: "+cylinder.findVolume());
        Cone cone = new Cone(10,11);
        System.out.println("Volume of Cone: "+cone.findVolume());
    }
}