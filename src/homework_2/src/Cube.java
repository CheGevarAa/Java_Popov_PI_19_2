public class Cube extends Square{
    private double vol;

    public Cube(double height){
        super(height);

        vol = vol();
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public double getVol() {
        return vol;
    }

    public double vol(){
        return Math.pow(getHeight(), 3);
    }

}