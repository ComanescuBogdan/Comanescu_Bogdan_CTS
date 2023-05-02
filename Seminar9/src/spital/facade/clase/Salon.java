package spital.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> coduriPaturiLibere;

    public Salon() {
        coduriPaturiLibere = new ArrayList<>();
    }

    public boolean verificarePaturiLibere(){
        return !coduriPaturiLibere.isEmpty();
    }

    public void adaugarePaturiLibere(int codPat){
        coduriPaturiLibere.add(codPat);
    }

    public void ocupaPat(){
        coduriPaturiLibere.remove(0);
    }
}
