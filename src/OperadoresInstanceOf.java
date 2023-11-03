public class OperadoresInstanceOf {

    public static void main(String[] args) {

        String texto ="Creando un objeto de la clase String";
        Integer num= 7;
        
        boolean b1= texto instanceof Object;
        System.out.println("b1 = " + b1);
        
        b1 = texto instanceof String;
        System.out.println("b1 = " + b1);
    }
}
