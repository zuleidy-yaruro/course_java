import javax.swing.*;
import java.util.Scanner;

public class SistemaNumericosEntradaScanner {

    public static void main(String[] args) {

        int numeroDecimal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        String numeroStr = scanner.nextLine();

        // manejo del error en casa de que el usuario no ingrese un número sino un string
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException ex) {
            System.out.println("error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimall = " + numeroDecimal);

        // convertir de decimal a Binario
        String textoBinario = "número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        int numeroBinario = 0b111110100;
        //System.out.println("numeroBinario = " + numeroBinario);

        //convertir de decimal a octal
        String textoOctal = "\nnúmero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        int numeroOctal = 0764;
        //System.out.println("numeroOctal = " + numeroOctal);

        // convertir de decimal a hexadecimal
        String textoHexa = "\nnúmero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        int numeroHex = 0x1f4;
        //System.out.println("numeroHex = " + numeroHex);

        String mensaje = textoBinario + textoOctal + textoHexa;

        System.out.println(mensaje);

    }
}
