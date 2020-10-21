import java.util.ArrayList;
import java.util.Arrays;

public class ConvClass {
    private double currentValue;
    private char currentSign;
    private Character[] signs = {'K', 'C', 'F'};

    public ConvClass(double x){
        this.currentValue = x;
        this.currentSign = 'C';
    }
    public ConvClass(double x, char sign){
        if(Arrays.asList(signs).contains(sign)){
            this.currentSign = sign;
            this.currentValue = x;
        }else{
            throw new IllegalArgumentException();
        }
    }

    private double convert(double x, Conv converter){
        return converter.conv(x);
    }

    public void changeSign(Character sign){
        if(Arrays.asList(signs).contains(sign)){
            switch (currentSign){
                case 'C':
                    switch (sign){
                        case 'K':
                            currentValue = convert(this.currentValue, (x) -> x + 273.15 );
                            break;
                        case 'F':
                            currentValue = convert(this.currentValue, (x) -> x * 1.8 + 32 ) ;
                            break;
                    }
                    break;
                case 'K':
                    switch (sign){
                        case 'F':
                        case 'K':
                            break;
                        default:
                            currentValue = convert(this.currentValue, (x) -> x - 273.15);
                            break;

                    }
                    break;
                case 'F':
                    switch (sign){
                        case 'F':
                        case 'K':
                            break;
                        default:
                            currentValue = convert(this.currentValue, (x) -> (x-32)/1.8);
                            break;
                    }
                    break;
            }
            currentSign = sign;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public String getCurrentTemperature(){
        return String.format("%10.10f (%s)", currentValue, currentSign);
    }
}
