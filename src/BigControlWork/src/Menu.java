import java.util.HashMap;

public class Menu {
    private HashMap<String, Integer> menulist;
    private HashMap<String, Integer> stoplist;

    public Menu(){
        this.menulist=menulist;
        this.stoplist=stoplist;

    }

    

    public void addmenu(Item item){
        HashMap<String, Integer> menu = new HashMap<String, Integer>();
        menu.put(item.getName(), item.getPrice());
    }

    public void check_menu(){
        System.out.printf("");
    }


}
