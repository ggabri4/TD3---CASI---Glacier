package glaces;

public class Chantilly extends ToppingDecorator {
    public Chantilly(dessert dessert) {
        super(dessert);
    }

    @Override
    public double Prix() {
        return super.dessert.Prix() + 0.5;
    }

    @Override
    public String Description() {
        return super.dessert.Description() + " chantilly";
    }
}
