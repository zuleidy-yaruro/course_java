public class EjemploStringValidar {

    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = "";
        }

        if (curso.length() > 0) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }


    }
}
