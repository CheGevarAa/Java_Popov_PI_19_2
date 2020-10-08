public abstract class Car {
    private  String model;
    private String color;
    private String type_of_box;
    private int maxspd;
    private int currspd;
    private int price;
    private boolean is_working;


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Car(String model, String color, String type_of_box, int maxspd, int currspd, int price, boolean is_working){
        this.model=model;
        this.color=color;
        this.type_of_box=type_of_box;
        this.maxspd=maxspd;
        this.currspd=currspd;
        this.price=price;
        this.is_working=is_working;

    }

    public void boolean start(){
        setIs_working(true);
    }

    public void boolean stop(){
        setIs_working(false);
    }

    public void setCurrspd(int currspd) {
        this.currspd = currspd;
    }

    public int accelerate(int currspd, int args){
        setCurrspd(currspd+args);
        return currspd;
    }

    public void setIs_working(boolean is_working) {
        this.is_working = is_working;
    }
}
