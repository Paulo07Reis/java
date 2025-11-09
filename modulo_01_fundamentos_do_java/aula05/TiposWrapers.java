package modulo_01_fundamentos_do_java.aula05;

public class TiposWrapers {
    //Integer - Long - Double - Short - Byte - Bollean - Character

    public static void main(String[] args) {

        //Cast explícito
        double numeroDouble = 123.56;
        int numeroInt = (int) numeroDouble;
        System.out.println(numeroInt);

        //Cast implicito
        Double d = 100.56;
        Integer i = d.intValue();
        System.out.println(i);


        String value1 = "100.00";
        String value2 = "150.00";

        Double v1 = Double.valueOf(value1);
        Double v2 = Double.valueOf(value2);

        somar(v1, v2);
    }

    public static void somar(Double v1, Double v2){
        System.out.println(v1 + v2);
    }
}
