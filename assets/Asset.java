package assets;

public abstract class Asset {
    public boolean status;
    protected String name;

    public abstract void activate();

    public abstract void deactivate();
}
