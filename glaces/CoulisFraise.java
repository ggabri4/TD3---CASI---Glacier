package glaces;

public class CoulisFraise extends ToppingDecorator {
    public CoulisFraise(dessert dessert) {
        super(dessert);
    }

    @Override
    public double Prix() {
        return super.Prix() + 1.0;
    }

    @Override
    public String Description() {
        return super.Description() + " au coulis de fraises fraîches";
    }
}