public class DecimalToBinary {
    public static void main(String[] args) {
       /*  int decimal = 25;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);*/
        int decimal = 25;
        String binary="";
        while(decimal>0){
            int remainder=decimal%2;
            binary=remainder+binary;
            decimal=decimal/2;
        }
        System.out.println("Binary: " + binary);
    }
}