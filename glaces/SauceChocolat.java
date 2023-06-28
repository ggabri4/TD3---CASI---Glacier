package glaces;

public class SauceChocolat extends ToppingDecorator {
    public SauceChocolat(dessert dessert) {
        super(dessert);
    }

    @Override
    public double Prix() {
        return super.Prix() + 0.7;
    }

    @Override
    public String Description() {
        return super.Description() + " et sa délicieuse sauce chocolat";
    }
}
