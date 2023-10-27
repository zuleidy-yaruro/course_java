public class EjemploStringMetodosArreglos {

    public static void main(String[] args) {

        String trabalenguas = "Trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {

            System.out.println(arreglo[i]);
        }
    }
}
