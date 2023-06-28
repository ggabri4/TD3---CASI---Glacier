package glaces;

public class FruitsRouges extends CoupeGlacee {
    private static FruitsRouges instance = null;

    private FruitsRouges() {
        super();
        this.addParfum(Parfum.FRAISE);
        this.addParfum(Parfum.FRAMBOISE);
        this.addParfum(Parfum.CASSIS);
    }

    public static FruitsRouges getInstance() {
        if (instance == null) {
            instance = new FruitsRouges();
        }
        return instance;
    }

    @Override
    public double Prix() {
        // implémenter le calcul du prix
        return 5.5;
    }

    @Override
    public String Description() {
        // implémenter la description
        return "Fruits Rouges";
    }
}
