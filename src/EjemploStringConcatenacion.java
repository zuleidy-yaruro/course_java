public class EjemploStringConcatenacion {

    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrea Rodriguez";

        String detalle = curso + " con el instructor " + profesor + " ";
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        // concatena todas las variables por la precedencia de las expresiones
        System.out.println(detalle + numeroA + numeroB);

        // concatena sumando numeroA + numeroB
        System.out.println(detalle + (numeroA + numeroB));

        String detalle2 = curso.concat(" con " + detalle);
        System.out.println("detalle2 = " + detalle2);

    }
}
