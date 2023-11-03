public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 7 ? "Sí es verdadero" : "Es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        estado = promedio >= 5.49 ? "Aprobado": "Rechazado";
        System.out.println("promedio = " + promedio);
    }
}
