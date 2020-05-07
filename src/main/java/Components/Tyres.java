package Components;

public class Tyres {
    private boolean winterReady;
    private int litersAir;

    public Tyres(boolean winterReady, int litersAir) {
        this.winterReady = winterReady;
        this.litersAir = litersAir;
    }

    public boolean isWinterReady() {
        return winterReady;
    }

    public int getLitersAir() {
        return litersAir;
    }
}
