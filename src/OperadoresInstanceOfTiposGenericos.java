public class OperadoresInstanceOfTiposGenericos {

    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String";
        Integer num = 7;
        Boolean b1 = texto instanceof String;

        System.out.println("b1 = " + b1);

        b1 = texto instanceof String;
        System.out.println("b1 = " + b1);




    }
}
