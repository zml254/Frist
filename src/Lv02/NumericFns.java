package Lv02;

public class NumericFns <T extends Number>{
    T num;
    NumericFns (T t){
        num = t;
    }
    boolean absEquals(NumericFns<?> t){
        if(Math.abs(num.doubleValue())==Math.abs(t.num.doubleValue())){
            return true;
        }
        return false;
    }
}
