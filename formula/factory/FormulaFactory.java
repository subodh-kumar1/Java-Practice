package formula.factory;

import formula.Formula;
import formula.constants.FormulaType;
import formula.impl.AddFormula;
import formula.impl.MultiplyFormula;

public class FormulaFactory {
    public Formula getFormula(String formulaType, String op1, String op2) {
        if (formulaType == null) {
            return null;
        }
        if (formulaType.equalsIgnoreCase(FormulaType.ADD)) {
            return new AddFormula(op1, op2);
        } else if (formulaType.equalsIgnoreCase(FormulaType.MULTIPLY)) {
            return new MultiplyFormula(op1, op2);
        }
        return null;

    }
}
