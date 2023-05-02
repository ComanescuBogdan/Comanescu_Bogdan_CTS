package spital.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    private List<Pacient> pacients;

    public Medic(){
        this.pacients = new ArrayList<>();
    }

    public void adaugarePacient(Pacient pacient){
        this.pacients.add(pacient);
    }

    public boolean verificaTrimitere(Pacient pacient){
        return this.pacients.contains(pacient);
    }

    public Pacient getPacient(String nume){
        for(Pacient pacient : pacients){
            if(pacient.getNume().equals(nume)){
                return pacient;
            }
        }
        return null;
    }
}
