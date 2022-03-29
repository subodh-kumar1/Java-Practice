package formula.manager;

import java.util.ArrayList;

import formula.Formula;
import formula.constants.FormulaType;
import formula.factory.FormulaFactory;

public class FormulaManager {
    ArrayList<Formula> formulaList;
    FormulaFactory formulaFactory;

    public FormulaManager() {
        formulaList = new ArrayList<>();
        formulaFactory = new FormulaFactory();
    }

    public void createFormula(String expression) {
        int i = 0;
        if (expression.length() == 0) {
            return;
        }
        while (i < expression.length()) {
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '*') {
                break;
            }
            i++;
        }
        if (i == expression.length()) {
            return;
        }
        String op1 = expression.substring(0, i);
        String op2 = expression.substring(i + 1);

        Formula formula;
        if (expression.charAt(i) == '+') {
            formula = formulaFactory.getFormula(FormulaType.ADD, op1, op2);
        } else {
            formula = formulaFactory.getFormula(FormulaType.MULTIPLY, op1, op2);
        }

        formulaList.add(formula);
    }

    public ArrayList<Formula> getFormuLaList() {
        return formulaList;
    }
}
