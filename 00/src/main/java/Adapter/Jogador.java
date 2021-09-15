package Adapter;

public class Jogador {
    IFixas fixas;
    FixaAdapter persistencia;

    public Jogador() {
        fixas = new Fixa3DeT();
        persistencia = new FixaAdapter(fixas);
    }
    public void setFixas(String Fixas){
        fixas.setFixa(Fixas);
        persistencia.salvarFixa();
    }


}
