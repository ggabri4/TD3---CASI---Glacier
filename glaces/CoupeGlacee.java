package glaces;

import java.util.ArrayList;
import java.util.List;

public abstract class CoupeGlacee implements dessert{
    private List<Parfum> parfums;

    public CoupeGlacee() {
        this.parfums = new ArrayList<>();
    }

    public void addParfum(Parfum parfum) {
        this.parfums.add(parfum);
    }

    public abstract double Prix();

    public abstract String Description();
}
