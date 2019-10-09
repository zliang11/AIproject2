
public class TestCSP extends CSP {

    public TestCSP() {
        ArrayListSet<ColorDomain> colorRGB = new ArrayListSet<ColorDomain>();
        colorRGB.add(ColorDomain.BLUE);
        colorRGB.add(ColorDomain.RED);
        colorRGB.add(ColorDomain.GREEN);

        Domain domainColor = new Domain(colorRGB);
        System.out.println(domainColor);

        Variable testVariable= new TestVariable("TestVariable", domainColor);
        Variable testVariable2= new TestVariable("TestVariable2", domainColor);
        Variable testVariable3= new TestVariable("TestVariable3", domainColor);

        ArrayListSet<Variable> variables = new ArrayListSet<>();
        variables.add(testVariable);
        variables.add(testVariable2);
        variables.add(testVariable3);
        this.variables = variables;
        this.PrintVariable();


    }

    public static void main(String[] args) {
        CSP testing = new TestCSP();
    }
}
