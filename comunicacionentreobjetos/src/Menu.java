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
                Ventana ventana1 = new Ventana(1);
                ventana1.setLocation(250, 100);
                ventana1.addMouseListener(ventana1);
                Ventana ventana2 = new Ventana(2);
                ventana2.setLocation(250, 400);
                ventana2.addMouseListener(ventana2);
                Ventana ventana3 = new Ventana(3);
                ventana3.setLocation(550, 100);
                ventana3.addMouseListener(ventana3);
                Ventana ventana4 = new Ventana(4);
                ventana4.setLocation(550, 400);
                ventana4.addMouseListener(ventana4);
                    break;
                case 2:
                  //  MouseAdapter mouseAdapter = new MouseAdapter();
                 //   mouseAdapter.MouseAdapter();
                    break;
                case 3:
                    System.out.println("Gracias.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }

        } while (opcion != 3);
    }

    private void menu() {
        System.out.println("1. MouseListener");
        System.out.println("2. MouseAdapter");
        System.out.println("3. Salir");
    }
}
