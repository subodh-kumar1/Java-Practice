import java.util.ArrayList;

import assets.Asset;
import assets.constants.AssetType;
import assets.manager.AssetManager;
import formula.Formula;
import formula.manager.FormulaManager;

public class Java8Exercise {
    public static void main(String args[]) {
        AssetManager assetManager = new AssetManager();

        assetManager.addAsset(AssetType.TURBO_ENGINE);
        assetManager.addAsset(AssetType.WIND_MILL);
        assetManager.addAsset(AssetType.WIND_MILL);

        ArrayList<Asset> allAssets = assetManager.getAssetList();
        System.out.println("All Assets : \n" + allAssets);
        allAssets.get(1).activate();

        ArrayList<Asset> activeAssets = assetManager.getActiveAssetList();
        ArrayList<Asset> inactiveAssets = assetManager.getInactiveAssetList();
        System.out.println("Active Assets : \n" + activeAssets);
        System.out.println("Inactive Assets : \n" + inactiveAssets);

        System.out.println("Number of Active Assets : " + assetManager.getActiveAssetListCount());
        System.out.println("Number of Inactive Assets : " + assetManager.getInactiveAssetListCount());

        System.out.println("percentage of Active Assets : " + assetManager.percentageOfActiveAssets());
        System.out.println("percentage of Inactive Assets : " + assetManager.percentageOfInactiveAssets());

        FormulaManager formulaManager = new FormulaManager();

        formulaManager.createFormula("a+b");
        formulaManager.createFormula("c");
        formulaManager.createFormula("dcw*mn");
        formulaManager.createFormula("");

        ArrayList<Formula> formulas = formulaManager.getFormuLaList();

        System.out.println(formulas);
    }
}