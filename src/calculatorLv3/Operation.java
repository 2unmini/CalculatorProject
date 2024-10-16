package calculatorLv3;

public class Operation <T extends Number> {

    public double add(T x,T y){
        return x.doubleValue()+y.doubleValue();
    }
    public double subtract(T x,T y){
        return x.doubleValue()-y.doubleValue();
    }
    public double multiply(T x, T y){
        return x.doubleValue()*y.doubleValue();
    }
    public double divide(T x, T y){
        return x.doubleValue()/y.doubleValue();}

}
