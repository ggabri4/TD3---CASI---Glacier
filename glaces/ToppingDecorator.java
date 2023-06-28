package glaces;

public abstract class ToppingDecorator implements dessert {
    protected dessert dessert;

    public ToppingDecorator(dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public double Prix() {
        return this.dessert.Prix();
    }

    @Override
    public String Description() {
        return this.dessert.Description();
    }
}
