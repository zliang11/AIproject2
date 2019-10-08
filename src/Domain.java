public class Domain {
    //domain could be different types
    int [] domain = new int[3];
    public Domain() {
        for (int i : this.domain) {
            i = 0;
        }

    }
    public String toString() {
        String results = "";
        for (int i: this.domain) {
            results = results + i + " ";
        }
        return results;
    }
}
