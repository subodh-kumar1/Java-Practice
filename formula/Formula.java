package formula;

public abstract class Formula {
    public String name;
    public String desc;

    public String op1;
    public String op2;

    public abstract int test(int op1, int op2);
}
