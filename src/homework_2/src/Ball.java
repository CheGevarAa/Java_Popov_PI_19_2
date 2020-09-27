public class Ball extends SolidOfRevolution {

    private double vol;

    public Ball(double radius) {
        super(radius);

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

    @Override
    public double vol() {
        return 4 / 3 * getRadius() * Math.PI;
    }
}