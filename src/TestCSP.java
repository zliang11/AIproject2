
public class TestCSP extends CSP {

    public TestCSP() {

        // use this test as australia.
        //domain

        ArrayListSet<ColorDomain> colorRGB = new ArrayListSet<ColorDomain>();

        colorRGB.add(ColorDomain.BLUE);
        colorRGB.add(ColorDomain.RED);
        colorRGB.add(ColorDomain.GREEN);
        Domain domainColor = new Domain(colorRGB);
        System.out.println(domainColor);
        //variables

        Variable testVariable= new TestVariable("TestVariable", domainColor);
        Variable testVariable2= new TestVariable("TestVariable2", domainColor);
        Variable testVariable3= new TestVariable("TestVariable3", domainColor);

        this.variables = new ArrayListSet<Variable>();
        this.variables.add(testVariable);
        this.variables.add(testVariable2);
        this.variables.add(testVariable3);
        this.PrintVariable();


        //constraints
        ArrayListSet<Variable> con1Var = new ArrayListSet<>();
        con1Var.add(testVariable);
        con1Var.add(testVariable2);

        ArrayListSet<Variable> con2Var = new ArrayListSet<>();
        con2Var.add(testVariable2);
        con2Var.add(testVariable3);

        Constraint con1 = new TestConstraints(con1Var, ConstraintType.NotEqualConstraint);
        Constraint con2 = new TestConstraints(con2Var, ConstraintType.NotEqualConstraint);

        this.constraints = new ArrayListSet<Constraint>();
        this.constraints.add(con1);
        this.constraints.add(con2);
        this.PrintConstraints();


    }

    public static void main(String[] args) {
        CSP testing = new TestCSP();
    }
}
