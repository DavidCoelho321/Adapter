package Adapter;

public class FixaAdapter extends Fixa3DeT {

    private IFixas FixasDeD;

    public FixaAdapter(IFixas Fixa3DeT) {
        this.fixa3DeT = Fixa3DeT;
    }

    public FixaAdapter(IFixas Fixas3DeT, IFixas fixasDeD){
        FixasDeD = fixasDeD;
        this.Fixas3DeT = Fixas3DeT;
    }
    public String recuperarfixa() {
        if (this.getFixa() = caoticobom)
            Fixas3DeT.setFixa("Personagem bom");
            else
                if (this.getFixa() = caoticoneutro)
                    Fixa3DeT.setFixa("Personagem normal");
                else
                    if (this.getFixa() = caoticonruim)
                        Fixa3DeT.setFixa("Personagem mal");
        return Fixa3DeT.getFixa();

    }
    public String salvarFixa() {
        if (this.getFixa() = caoticobom)
            Fixas3DeT.setFixa("Personagem bom");
            else
                if (this.getFixa() = caoticoneutro)
                Fixa3DeT.setFixa("Personagem normal");
            else
                    if (this.getFixa() = caoticonruim)
                        Fixa3DeT.setFixa("Personagem mal");
        return Fixa3DeT.getFixa();
    }
}


