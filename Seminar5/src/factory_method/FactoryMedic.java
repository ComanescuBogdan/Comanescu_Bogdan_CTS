package factory_method;

import factory_method.Medic;
import factory_method.PersonalSpital;

public class FactoryMedic implements Factory{
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Medic(name);
    }
}
