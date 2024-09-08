package se.dsve;

public class ExampleClass {
    private int privateNumber; // privat till denna klass
    int packageNum; // Åtkomlig inom paketet
    protected int protectedVar;
    public int publicInt;

    public int getPrivateNumber() {
        return privateNumber;
    }

}
