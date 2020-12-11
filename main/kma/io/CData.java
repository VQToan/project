package main.kma.io;
import java.util.ArrayList;

public class CData {
    private static ArrayList<String> dataCombo = new ArrayList<>();
    
    public static ArrayList<String> dataBD1() {
        dataCombo.add("101");
        dataCombo.add("102");
        dataCombo.add("103");
        dataCombo.add("104");
        dataCombo.add("105");
        return dataCombo;
    }
    public static ArrayList<String> dataBD2() {
        dataCombo.add("201");
        dataCombo.add("202");
        dataCombo.add("203");
        dataCombo.add("204");
        dataCombo.add("205");
        return dataCombo;
    }
    public static ArrayList<String> dataCC1() {
        dataCombo.add("301");
        dataCombo.add("302");
        dataCombo.add("303");
        return dataCombo;
    }
    public static ArrayList<String> dataCC2() {
        dataCombo.add("304");
        dataCombo.add("305");
        return dataCombo;
    }
    public static ArrayList<String> dataKG1() {
        dataCombo.add("401");
        dataCombo.add("402");
        dataCombo.add("403");
        return dataCombo;
    }
    public static ArrayList<String> dataKG2() {
        dataCombo.add("404");
        dataCombo.add("405");
        return dataCombo;
    }    
}
