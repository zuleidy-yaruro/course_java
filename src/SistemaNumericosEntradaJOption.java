import javax.swing.*;

public class SistemaNumericosEntradaJOption {

    public static void main(String[] args) {

        int numeroDecimal = 0;
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        // manejo del error en casa de que el usuario no ingrese un número sino un string
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimall = " + numeroDecimal);

        // convertir de decimal a Binario
        String textoBinario = "número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        //convertir de decimal a octal
        String textoOctal = "\nnúmero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        // convertir de decimal a hexadecimal
        String textoHexa = "\nnúmero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = textoBinario + textoOctal + textoHexa;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
