class Calcultor{
    int add(int a, int b){ //Here "add" is the method name
        return a*b;
    }
    Double add(double a,double b){
        return a+b;
    }
}



public class OverloaderCode{
    public static void main(String[] args){
        Calcultor calc = new Calcultor();
        System.out.println(calc.add(2,2));
        System.out.println(calc.add(1.2,2.6));

    }
        }