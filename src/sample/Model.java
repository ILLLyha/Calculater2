package sample;

public class Model {
    public double Calculate(double fiirstNumber, double secondNumber, String operator){

        switch (operator){
            case "+" : return fiirstNumber + secondNumber;
            case "-" : return fiirstNumber - secondNumber;
            case "*" : return fiirstNumber * secondNumber;
            case "/" : return fiirstNumber / secondNumber;
        }
        return Double.NaN;
    }
}
