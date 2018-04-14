package ua.com.google;

public class Main {

    public static void main(String[] args) {
        PortionsStones portionsStones = new PortionsStones("ZZZzdszzds", "z");
        SearchingSystem searchingSystem = new SearchingSystem(portionsStones);
        System.out.println(searchingSystem.getGems());
    }
}
