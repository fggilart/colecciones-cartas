package cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MezclaBaraja {

    private List<Baraja> lista;

    public MezclaBaraja() {
        lista = new ArrayList<>();
        mezcla();
    }

    private void mezcla() {
        for (Baraja.Palo palo : Baraja.Palo.values()) {
            for (Baraja.Cara cara : Baraja.Cara.values()) {
                lista.add(new Baraja(cara, palo));
            }
        }
        Collections.shuffle(lista);
    }

    public void imprimir() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%-22s%s", lista.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
        }
    }

}
