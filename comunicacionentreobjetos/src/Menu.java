import java.util.Scanner;

import Ejercicio1.Ventana_Listener;
import Ejercicio2.Ventana_Adapter;

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
                Ventana_Listener ventana1 = new Ventana_Listener(1);
                ventana1.setLocation(250, 100);
                ventana1.addMouseListener(ventana1);
                Ventana_Listener ventana2 = new Ventana_Listener(2);
                ventana2.setLocation(550, 100);
                ventana2.addMouseListener(ventana2);
                Ventana_Listener ventana3 = new Ventana_Listener(3);
                ventana3.setLocation(250, 400);
                ventana3.addMouseListener(ventana3);
                Ventana_Listener ventana4 = new Ventana_Listener(4);
                ventana4.setLocation(550, 400);
                ventana4.addMouseListener(ventana4);
                    break;
                case 2:
                Ventana_Adapter ventana5 = new Ventana_Adapter(1);
                ventana5.setLocation(250, 100);
                ventana5.addMouseAdapter(ventana5);
                Ventana_Adapter ventana6 = new Ventana_Adapter(2);
                ventana6.setLocation(550, 100);
                ventana6.addMouseAdapter(ventana6);
                Ventana_Adapter ventana7 = new Ventana_Adapter(3);
                ventana7.setLocation(250, 400);
                ventana7.addMouseAdapter(ventana7);
                Ventana_Adapter ventana8 = new Ventana_Adapter(4);
                ventana8.setLocation(550, 400);
                ventana8.addMouseAdapter(ventana8);
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
