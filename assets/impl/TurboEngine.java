package assets.impl;

import assets.Asset;

public class TurboEngine extends Asset {
    public TurboEngine() {
        status = false;
        name = "Turbo Engine";
    }

    @Override
    public String toString() {
        return "Status: " + status + ", Asset Name: " + name;
    }

    public void activate() {
        status = true;
    }

    public void deactivate() {
        status = true;
    }
}
