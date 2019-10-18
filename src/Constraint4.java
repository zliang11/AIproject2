public class Constraint4 extends Constraint {

    public boolean check(Double X, Double Y) {
        if (Y == Math.pow(X, 2)) {
            return true;
        }
        else{
            return false;
        }
    }
}
