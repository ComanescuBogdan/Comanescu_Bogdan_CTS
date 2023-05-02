package spital.decorator.main;

import spital.decorator.clase.DecoratorAbstract;
import spital.decorator.clase.FurnizareRezultat;
import spital.decorator.clase.RezultatOnline;
import spital.decorator.clase.RezultatPeHartie;

public class Main {
    public static void main(String[] args) {
        FurnizareRezultat rezultatpeHartie = new RezultatPeHartie();
        rezultatpeHartie.printareRezultat("Raceala");
        DecoratorAbstract decoratorAbstract = new RezultatOnline(rezultatpeHartie);
        decoratorAbstract.afisareOnline("Raceala");
        decoratorAbstract.printareRezultat("Gripa");
    }
}
