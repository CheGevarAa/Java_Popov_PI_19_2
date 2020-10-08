public class Main {
    public static void main(String[] args){
        Lada a = new Lada("dd0", "red", "mechannic", 80, 40, 10000, 25,
                false);
        Garage g = new Garage();
        g.addcar(a);
        a.setIs_working(Car.start());
        a.setIs_working(Car.stop());
        g.show_garage();
    }

}
