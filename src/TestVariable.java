public class TestVariable extends Variable {
    public TestVariable(String varName, Domain dom) {
        super(varName, dom);
    }

    @Override
    public Domain changeDomain() {
        return null;
    }

    @Override
    public Object assignValue() {
        return null;
    }
}

// maybe variables still need to be abstract, need to observe more
