public class Cone extends SolidOfRevolution{

    private double vol;
    private double height;

    public Cone(double radius, double height){
        super(radius);
        this.height = height;
        vol = vol();

    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public double getVol() {
        return vol;
    }

    @Override
    public double vol() {
        return height*(Math.PI*getRadius()*getRadius() + Math.PI*getRadius()*Math.sqrt(getRadius()*getRadius() + height*height))*1/3;
    }}