package factory_method;

import factory_method.Asistent;
import factory_method.PersonalSpital;

public class FactoryAsistent implements Factory{
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Asistent(name);
    }
}
