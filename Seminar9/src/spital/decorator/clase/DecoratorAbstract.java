package spital.decorator.clase;

public abstract class DecoratorAbstract implements FurnizareRezultat{

    private FurnizareRezultat atr;

    public DecoratorAbstract(FurnizareRezultat atr) {
        this.atr = atr;
    }

    public abstract void afisareOnline(String diagnostic);

    @Override
    public void printareRezultat(String diagnostic) {
        atr.printareRezultat(diagnostic);
    }
}
