package simple_factory;

public class Brancardier extends PersonalSpital{
    public Brancardier(String name){
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Brancardier" + super.getName());
    }
}
