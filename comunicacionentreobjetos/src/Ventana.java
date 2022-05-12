import javax.swing.JFrame;

public class Ventana extends JFrame implements MouseListener {
    private int id;
    
    JFrame ventana;


    public Ventana(int numero){
        ventana = new JFrame("Ventana n. : " + numero);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }

    public void setLocation(int x, int y) {
        super.setLocation(x, y);
    }

    public int getId() {
        return id;
    }

    @Override
    public void trazarPresionar() {
        System.out.println("La ventana " + id + " ha sido presionada.");
    }

    @Override
    public void trazarSoltar() {

        System.out.println("La ventana " + id + " ha sido soltada.");
    }

}
