public class Main {
    public static void main(String[] args){
        ConvClass converterClass = new ConvClass(2.5, 'C');
        System.out.println(converterClass.getCurrentTemperature());
        converterClass.changeSign('K');
        System.out.println(converterClass.getCurrentTemperature());
        converterClass.changeSign('C');
        System.out.println(converterClass.getCurrentTemperature());
        converterClass.changeSign('F');
        System.out.println(converterClass.getCurrentTemperature());

    }
}