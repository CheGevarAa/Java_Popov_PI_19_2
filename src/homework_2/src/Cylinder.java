public class Cylinder extends SolidOfRevolution{

    private double vol;
    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
        vol = vol();

    }

    @Override
    public double getVol() {
        return vol;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double vol() {
        return height*getRadius()*getRadius()*Math.PI;
    }
}