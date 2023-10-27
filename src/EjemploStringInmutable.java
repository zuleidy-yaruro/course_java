public class EjemploStringInmutable {

    public static void main(String[] args) {

        // los String son inmutables

        String curso = "Programación Java ";
        String profesor = "Andrea Rodriguez ";

        String resultado = curso.concat(profesor);

        System.out.println("Curso = " + curso);
        System.out.println("resultado = " + resultado);

        // retorna la concatenación
        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("curso transform = " + resultado2);

        // hay que asignar a otra variable para poder cambiar el valor
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);
    }
}
