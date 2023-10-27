public class ConversionTipos {

    public static void main(String[] args) {

        // Conversión de String a Primitivos

        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "True";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // conversión de primitivos a String

        int otroNumeroInt = 8;
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        System.out.println("otroNumeroStr -> tipo de dato = " + otroNumeroStr.getClass().getName());

        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        System.out.println("otroNumeroStr -> tipo de dato = " + otroNumeroStr.getClass().getName());

        double otroNumeroDouble = 1.2;
        String otroNumeroStri = Double.toString(otroNumeroDouble);
        System.out.println("otroNumeroStri = " + otroNumeroStri);
        System.out.println("otroNumeroStri -> tipo de dato = " + otroNumeroStr.getClass().getName());

        // conversión de primitivos a primitivos

        int i = 10000;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
    }
}
