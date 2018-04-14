package ua.com.google;


public class PortionsStones {
    private final String stones;
    private final String instrutions;

    public PortionsStones(String stones, String instrutions) {
        this.stones = stones;
        this.instrutions = instrutions;
    }

    public String getInstrutions() {
        return instrutions;
    }

    public String getStones() {
        return stones;
    }
}
