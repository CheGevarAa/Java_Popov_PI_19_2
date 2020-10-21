class Listner implements StrListner {
    public void Change(ListenedStringBuilder stringBuilder){
        System.out.println("Change: " + stringBuilder.toString());
    }
}
