public class Item {
    private String name;
    private int price;
    private boolean isHere;

    public Item(){
        this.name=name;
        this.price=price;
        this.isHere=isHere;
    }

    public void additem(String b, int c){
        setName(b);
        setPrice(c);
        setIsHere(true);
    }

    public void removeitem(){
        setIsHere(false);
    }

    public boolean checkitem(){
        return isHere;
    }

    public int getPrice() {
        return price;
    }

    public boolean getIsHere() {
        return isHere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsHere(boolean isHere) {
        this.isHere = isHere;
    }
}
