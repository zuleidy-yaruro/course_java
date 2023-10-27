import java.util.Scanner;

public class EjemploStringTarea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre persona 1 :");
        String nombrePersona1 = scanner.nextLine();

        System.out.println("Ingrese nombre persona 2 :");
        String nombrePersona2 = scanner.nextLine();

        System.out.println("Ingrese nombre persona 3 :");
        String nombrePersona3 = scanner.nextLine();

        String inicialP1 = Character.toString(nombrePersona1.charAt(1)).toUpperCase();
        String inicialP2 = Character.toString(nombrePersona2.charAt(1)).toUpperCase();
        String inicialP3 = Character.toString(nombrePersona3.charAt(1)).toUpperCase();

        String resultadoP1 = inicialP1 + "." + nombrePersona1.substring(nombrePersona1.length() - 2);
        String resultadoP2 = inicialP2 + "." + nombrePersona2.substring(nombrePersona2.length() - 2);
        String resultadoP3 = inicialP3 + "." + nombrePersona3.substring(nombrePersona3.length() - 2);

        System.out.println(resultadoP1 + "_" + resultadoP2 + "_" + resultadoP3);
    }
}
