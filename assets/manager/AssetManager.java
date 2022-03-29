package assets.manager;

import java.util.ArrayList;
import java.util.stream.Collectors;

import assets.Asset;
import assets.factory.AssetFactory;

public class AssetManager {
    ArrayList<Asset> assetList;
    AssetFactory assetFactory;

    public AssetManager() {
        assetList = new ArrayList<>();
        assetFactory = new AssetFactory();
    }

    public void addAsset(String assetType) {
        try {
            Asset newAsset = assetFactory.getAsset(assetType);
            assetList.add(newAsset);
        } catch (NullPointerException npe) {
            System.err.println("Could not add asset type");
        }
    }

    public ArrayList<Asset> getAssetList() {
        return assetList;
    }

    public ArrayList<Asset> getActiveAssetList() {
        return (ArrayList<Asset>) assetList.stream().filter(asset -> asset.status == true)
                .collect(Collectors.toList());
    }

    public ArrayList<Asset> getInactiveAssetList() {
        return (ArrayList<Asset>) assetList.stream().filter(asset -> asset.status == true)
                .collect(Collectors.toList());
    }

    public int getActiveAssetListCount() {
        return (int) assetList.stream().filter(asset -> asset.status == true)
                .count();
    }

    public int getInactiveAssetListCount() {
        return (int) assetList.stream().filter(asset -> asset.status == false).count();
    }

    public int percentageOfActiveAssets() {
        int countActive = getActiveAssetListCount();
        int countInactive = getInactiveAssetListCount();

        int perc = ((countActive * 100) / (countActive + countInactive));
        return perc;
    }

    public int percentageOfInactiveAssets() {

        int activePerc = percentageOfActiveAssets();
        return 100 - activePerc;
    }
}
