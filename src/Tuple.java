public class Tuple<X> {
    private X i;
    private X j;

    public Tuple(X x, X y) {
        this.i = x;
        this.j = y;
    }

    public X getI() {
        return i;
    }

    public void setI(X i) {
        this.i = i;
    }

    public X getJ() {
        return j;
    }

    public void setJ(X j) {
        this.j = j;
    }


}
