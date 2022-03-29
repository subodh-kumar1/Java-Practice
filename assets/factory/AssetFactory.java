package assets.factory;

import assets.Asset;
import assets.constants.AssetType;
import assets.impl.TurboEngine;
import assets.impl.WindMill;

public class AssetFactory {
    public Asset getAsset(String assetType) {
        if (assetType == null) {
            return null;
        }
        if (assetType.equalsIgnoreCase(AssetType.TURBO_ENGINE)) {
            return new TurboEngine();
        } else if (assetType.equalsIgnoreCase(AssetType.WIND_MILL)) {
            return new WindMill();
        }
        return null;

    }
}
