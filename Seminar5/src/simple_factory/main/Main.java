package simple_factory.main;

import simple_factory.PersonalSpital;
import simple_factory.SimpleFactory;
import simple_factory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory  = new SimpleFactory();
        PersonalSpital personalSpital1 = simpleFactory.createPersonal(TipPersonal.Medic,"Andrei");
        PersonalSpital personalSpital2 = simpleFactory.createPersonal(TipPersonal.Asistent,"Gigi");
        PersonalSpital personalSpital3 = simpleFactory.createPersonal(TipPersonal.Brancardier,"Vali");
        PersonalSpital personalSpital4 = simpleFactory.createPersonal(TipPersonal.Medic,"Catalin");
        PersonalSpital personalSpital5 = simpleFactory.createPersonal(TipPersonal.Anestezist,"Ion",4);
        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(personalSpital1);
        listaPersonal.add(personalSpital2);
        listaPersonal.add(personalSpital3);
        listaPersonal.add(personalSpital4);
        listaPersonal.add(personalSpital5);
        for(PersonalSpital x : listaPersonal){
            x.afiseazaDescriere();
        }
    }
}
