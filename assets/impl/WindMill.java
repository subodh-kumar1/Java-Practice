package assets.impl;

import assets.Asset;

public class WindMill extends Asset {
    public WindMill() {
        status = false;
        name = "Wind Mill";
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
