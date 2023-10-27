public class EjemploStringMetodos {

    public static void main(String[] args) {


        String nombre = "Zuleidy";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Zuleidy\") = " + nombre.equals("Zuleidy"));
        System.out.println("nombre.equals(\"zuleidy\") = " + nombre.equals("zuleidy"));
        System.out.println("nombre.equalsIgnoreCase(\"zuleidy\") = " + nombre.equalsIgnoreCase("zuleidy"));
        // compare to es para comparar, si el resultado es cero es porque son iguales
        System.out.println("nombre.compareTo(\"Zuleidy\") = " + nombre.compareTo("Zuleidy"));
        // Retorna el carácter de la posición 1
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        // Retorna el carácter de la posición 5
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        // retorna el carácter de la última posición
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(1, 5) = " + nombre.substring(1, 5));
        System.out.println("nombre.substring(1, 5) = " + nombre.substring(1));

        String trabalenguas = "Trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\" ) = " + trabalenguas.replace("a", "."));

        // retorna la primera posición en la que se encuentre el carácter; si no encuentra devuelve -1
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        // retorna la última posición en la que se encuentre el carácter; si no encuentra devuelve -1
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('x'));
        // retorna true o false si el parámetro buscado está contenido en el String
        System.out.println("trabalenguas.contains(\"t\".toUpperCase()) = " + trabalenguas.contains("t".toUpperCase()));

        System.out.println("trabalenguas.startsWith(\"T\") = " + trabalenguas.startsWith("T"));
        System.out.println("trabalenguas.startsWith(\"T\") = " + trabalenguas.endsWith("s"));


    }
}
