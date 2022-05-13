package Ejercicio2;


import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.event.MouseInputAdapter;

public class Ventana_Adapter extends MouseInputAdapter{
    private int id;
    private JFrame ventana;

    public Ventana_Adapter(int id){
        ventana = new JFrame(String.format("Ventana n. %d: ", id));
        ventana.setSize(300,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        this.id = id;
    }

    public void setLocation(int x, int y) {
        this.ventana.setLocation(x, y);
    }

    public int getId() {
        return id;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
       super.mousePressed(e);
        System.out.println(String.format("La ventana %d ha sido presionada en %dX y %dY", id, e.getX(),e.getY()));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        System.out.println(String.format("La ventana %d ha sido soltada en %dX y %dY", id, e.getX(),e.getY()));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       super.mouseEntered(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
       super.mouseExited(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       super.mouseDragged(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       super.mouseMoved(e);
    }

    public void addMouseAdapter(MouseInputAdapter m) {
        this.ventana.addMouseListener(m);
    }
}