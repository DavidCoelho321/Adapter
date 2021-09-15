package Adapter;

public class Fixa3DeT implements IFixas {

    private String Caracteristica;
    private Object Fixa3DeT;

    @Override
    public static String getFixa(){
        return this.Caracteristica;
    }

    @Override
    public static void setFixa(String Fixa) {
        this.Caracteristica = Caracteristica;

    }
}