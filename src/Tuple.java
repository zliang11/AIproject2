public class Tuple {
    private Variable i;
    private Variable j;

    public Tuple(Variable x, Variable y) {
        this.i = x;
        this.j = y;
    }

    public Variable getI() {
        return i;
    }

    public void setI(Variable i) {
        this.i = i;
    }

    public Variable getJ() {
        return j;
    }

    public void setJ(Variable j) {
        this.j = j;
    }


}
