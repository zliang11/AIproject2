public class Domain {
    //domain could be different types
    protected ArrayListSet allowedValues;

    public Domain(ArrayListSet values) {
        this.allowedValues = values;

    }

    public ArrayListSet getAllowedValues() {
        return this.allowedValues;
    }

    public String toString(){
        String result = "";
        for (int i=0; i< this.allowedValues.size(); i++ ){
            result = result + " " + this.allowedValues.get(i);


        }
        return result;

    } ;
}
