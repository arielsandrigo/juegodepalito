package palitos;

import javax.swing.JOptionPane;

public class UltimoPalitoPierde {

    private Jugador j1, j2;
    private PilaDePalitos p;

    public UltimoPalitoPierde(int i) {
        JOptionPane.showMessageDialog(null, "Hay " + i + " palitos apilados."
                + "\nCada uno de los 2 jugadores sacará 1, 2 o 3 palitos por turno."
                + "\nEl jugador que saca el último palito pierde."
                + "\nSuerte!");
        p = new PilaDePalitos(i);
        j1 = new Jugador(1);
        j2 = new Jugador(2);
    }

    public void ejecutar() {
        while (p.getCantidad() > 1) {
            j1.jugar(p);
            if (p.getCantidad() == 1) {
                j1.cantarVictoria();
            } else if (p.getCantidad() == 0) {
                j2.cantarVictoria();
            } else {
                j2.jugar(p);
                if (p.getCantidad() == 1) {
                    j2.cantarVictoria();
                } else if (p.getCantidad() == 0) {
                    j1.cantarVictoria();
                }
            }
        }

    }
}
