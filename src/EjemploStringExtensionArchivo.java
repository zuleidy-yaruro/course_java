public class EjemploStringExtensionArchivo {

    public static void main(String[] args) {

        String extensionArchivo = "documento.word";
        System.out.println(extensionArchivo.substring(extensionArchivo.indexOf(".") + 1));
    }
}
