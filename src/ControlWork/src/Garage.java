import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Garage {
    private int total_amount = 0;
    private HashMap<String, Integer> model_and_amount = new HashMap<>();

    public int getTotal_amount() {
        return total_amount;
    }

    public HashMap<String, Integer> getModel_and_amount() {
        return model_and_amount;
    }

    public void addcar(Car car){
        total_amount++;
        model_and_amount.compute(car.getClass().getName(), (k, v)->v==null?1:v+1);
    }

    public void show_garage(){
        for(Map.Entry<String, Integer> items:model_and_amount.entrySet()){
            System.out.println(items.getKey() + " " + items.getValue());
        }
    }

    public void sort_by_amount(){
        TreeMap<String, Integer> sort= new TreeMap<String, Integer>();
        sort.putAll(model_and_amount);
        for (Map.Entry<String, Integer> entry : sort.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void sort_by_price(){
        System.out.println("Не успел придумать");
    }
}
