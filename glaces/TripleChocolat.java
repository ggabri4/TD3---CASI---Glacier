package glaces;

public class TripleChocolat extends CoupeGlacee {
    private static TripleChocolat instance = null;

    private TripleChocolat() {
        super();
        this.addParfum(Parfum.CHOCONOIR);
        this.addParfum(Parfum.CHOCOLAIT);
        this.addParfum(Parfum.CHOCOBLANC);
    }

    public static TripleChocolat getInstance() {
        if (instance == null) {
            instance = new TripleChocolat();
        }
        return instance;
    }

    @Override
    public double Prix() {
        // implémenter le calcul du prix
        return 6;
    }

    @Override
    public String Description() {
        // implémenter la description
        return "Triple Chocolat";
    }
}
