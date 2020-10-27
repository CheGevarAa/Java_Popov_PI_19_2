public class Order {
    private String status;
    private String content;
    private int totalPrice;


    public Order(){
        this.status=status;
        this.content=content;
        this.totalPrice=totalPrice;
    }

    public void change_status(String a){
        switch (a){
            case ("Is Cooking"):
                setStatus("Is Cooking");
                break;
            case ("Done"):
                setStatus("Done");
                break;
            case ("Canceled"):
                setStatus("Canceled");
                break;
            default:
                System.out.println("No such status");
        }
    }

    public Order make_order(Item item){
        Order order = new Order();
        if (item.checkitem()){
            setContent(item.getName());
            setTotalPrice(item.getPrice());
        }
        return order;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getContent() {
        return content;
    }
}
