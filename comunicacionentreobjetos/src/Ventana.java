public class Ventana implements MouseListener {
    private int id;

    public Ventana(int id) {
        this.id = id;
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
