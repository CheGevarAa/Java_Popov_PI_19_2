public class TaskThreeBox extends Shape{

    private double vol;

    public TaskThreeBox(double vol){
        this.vol = vol;
    }

    @Override
    public double getVol() {
        return vol;
    }

    public boolean addShape(Shape shape){
        boolean success = false;
        if (vol - shape.getVol() >= 0){
            success = true;
            vol -= shape.getVol();
            System.out.println("addition successful");
        } else {
            System.out.println("not enough space!");
        }
        return success;
    }}