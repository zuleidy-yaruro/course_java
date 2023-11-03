import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "Zuleidy";
        passwords[0] = "12345";

        usernames[0] = "Andres";
        passwords[0] = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String user = scanner.next();

        System.out.println("Ingrese el password: ");
        String password = scanner.next();

        boolean isLogged = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equalsIgnoreCase(user) && passwords[i].equals(password)) {
                isLogged = true;
            }
        }

        if (isLogged) {
            System.out.println("Usuario autenticado. Bienvenido ".concat(user));
        } else {
            System.out.println("El usuario o contraseña son incorrectos");
        }

    }
}
