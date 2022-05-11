import java.util.Scanner;

public class Menu {
    private Scanner teclado = new Scanner(System.in);
    private int opcion;

    public void comunicacionEntreObjetos() {
        do {
            menu();
            System.out.println("Seleccione una opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                MouseListener mouseListener = new MouseListener();
                mouseListener.MouseListener();
                break;
                case 2:
                MouseAdapter mouseAdapter = new MouseAdapter();
                mouseAdapter.MouseAdapter();
                break;
                case 3:
                System.out.println("Gracias.");
                break;
                default:
                System.out.println("Opción incorrecta.");
                break;
            }

        } while (opcion !=3);
    }

    private void menu() {
        System.out.println("1. MouseListener");
        System.out.println("2. MouseAdapter");
        System.out.println("3. Salir");
    }
}
