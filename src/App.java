import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scr = new Scanner(System.in);

        System.out.println("Escaneio o codigo de barras:");

        String codigoDeBarras = scr.nextLine();
        System.out.println(codigoDeBarras);

    }
}
