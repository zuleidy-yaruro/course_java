public class EjemploString {

    public static void main(String[] args) {

        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        // equals es utilizado para comparar valores en Strings
        // cuando trabajamos con objetos el == sirve para comparar referencias más no valores

        boolean esIgual = curso2.equals(curso);
        System.out.println("esIgual con 'equals' = " + esIgual);

        esIgual = curso2 == curso;
        System.out.println("esIgual con '==' = " + esIgual);
    }
}
