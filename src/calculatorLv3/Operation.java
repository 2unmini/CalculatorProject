package calculatorLv3;
/*
정수/정수를 하면 정수 ex) 4/3 =1이 나와 정수형 값을 넣으면 실수 값이 리턴 제네릭 이용
 */
public class Operation <T extends Number> {

    public double add(T x,T y){ // 더하기 메소드
        return x.doubleValue()+y.doubleValue();
    }
    public double subtract(T x,T y){ //빼기 메소드
        return x.doubleValue()-y.doubleValue();
    }
    public double multiply(T x, T y){ // 곱하기메소드
        return x.doubleValue()*y.doubleValue();
    }
    public double divide(T x, T y){// 나누기 메소드
        return x.doubleValue()/y.doubleValue();}

}
