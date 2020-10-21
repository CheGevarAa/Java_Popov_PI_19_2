public class ListenedStringBuilder {

    private StrListner Listner;

    private  StringBuilder stringBuilder;

    public void setListner (StrListner Listner){
        this.Listner=Listner;
    }

    public ListenedStringBuilder(){
        stringBuilder = new StringBuilder();
    }

    private void checkStrListner(){
        if(Listner != null){
            Listner.Change(this);
        }
    }

    public ListenedStringBuilder append(Object obj){
        stringBuilder.append(obj);
        checkStrListner();
        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
