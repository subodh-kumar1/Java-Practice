package formula.impl;

import formula.Formula;

public class AddFormula extends Formula {
    public AddFormula(String op1, String op2) {
        this.op1 = op1;
        this.op2 = op2;
        this.name = op1 + "+" + op2;
        this.desc = "Add " + op1 + " " + op2;
    }

    @Override
    public int test(int op1, int op2) {
        return op1 + op2;
    }

    @Override
    public String toString() {
        return "( Expression: " + op1 + "+" + op2 + ", Name: " + name + ", Desc: " + desc + " )";
    }

}
