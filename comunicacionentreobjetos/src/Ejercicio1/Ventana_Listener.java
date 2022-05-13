package Ejercicio1;

import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class Ventana_Listener implements MouseInputListener{
    private int id;
    private JFrame ventana;



    public Ventana_Listener(int id){
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(String.format("La ventana %d ha sido presionada en %dX y %dY", id, e.getX(),e.getY()));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(String.format("La ventana %d ha sido soltada en %dX y %dY", id, e.getX(),e.getY()));
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    public void addMouseListener(MouseInputListener m) {
        this.ventana.addMouseListener(m);
    }

}
