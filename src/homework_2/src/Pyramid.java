public class Pyramid extends Square{
    private double vol;
    private double side;

    public Pyramid(double height, double side){
        super(height);
        this.side = side;

        vol = vol();
    }

    @Override
    public double getVol() {
        return vol;
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    public double getSide() {
        return side;
    }

    @Override
    public double vol() {
        return 1/3*getHeight()*side*side;
    }
}