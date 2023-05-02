package spital.facade.clase;

public class Facade {

    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        medic.adaugarePacient(new Pacient("Andrei",3));
        medic.adaugarePacient(new Pacient("Maria",5));
        medic.adaugarePacient(new Pacient("Nicolae",4));
        this.salon = new Salon();
        salon.adaugarePaturiLibere(23);
        salon.adaugarePaturiLibere(41);
    }

    public void interneazaPacient(String numePacient){
        if(medic.verificaTrimitere(medic.getPacient(numePacient))){
            if(salon.verificarePaturiLibere()){
                if(medic.getPacient(numePacient).getGravitate()>4){
                    salon.ocupaPat();
                    System.out.println("Pacientul " + numePacient + " a fost internat");
                }else{
                    System.out.println("Pacientul " + numePacient + " nu are stare grava");
                }
            }else{
                System.out.println("Nu avem paturi libere");
            }
        }else{
            System.out.println("Trebuie sa aveti trimitere");
        }
    }
}

