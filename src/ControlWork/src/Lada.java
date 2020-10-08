public class Lada extends Car {
    private  String model;
    private String color;
    private String type_of_box;
    private int maxspd;
    private int currspd;
    private int price;
    private boolean is_working;
    private int timelife;

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getMaxspd() {
        return maxspd;
    }

    public int getCurrspd() {
        return currspd;
    }

    public int getPrice() {
        return price;
    }

    public String getType_of_box() {
        return type_of_box;
    }

    public int getTimelife() {
        return timelife;
    }


    public Lada(String model, String color, String type_of_box, int maxspd, int currspd, int price, int timelife,
                boolean is_working){
        super(model, color, type_of_box, maxspd, currspd, price, is_working);
        this.timelife=timelife;
    }

    public int decrease_timelife(){
        if (is_working){
            timelife-=1;
        }
        return timelife;
    }

    public void is_broken(int timelife){
        if (timelife==0) {
        setIs_working(false);
    }
    }

}
