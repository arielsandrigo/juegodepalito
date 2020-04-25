package palitos;

import javax.swing.JOptionPane;

public class Jugador {

    private String nombre;

    public Jugador(int i) {
        do {
            nombre = JOptionPane.showInputDialog("Jugador Nro. " + i
                    + ", cómo te llamas?");
        } while (nombre.equals(""));
    }

    public void jugar(PilaDePalitos p) {
        String nStr;
        int n, q;
        q = p.getCantidad();
        do {
            nStr = JOptionPane.showInputDialog(nombre + ", quedan " + q
                    + " palitos. Cuántos retiras (1 a " + (q > 3 ? 3 : q) + ")?");
            n = Integer.parseInt(nStr);
        } while (n < 1 || n > 3 || n > q);
        p.setCantidad(q - n);
    }

    public void cantarVictoria() {
        JOptionPane.showMessageDialog(null, nombre + " es el vencedor!");
    }
}
