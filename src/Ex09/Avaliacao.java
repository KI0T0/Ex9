package Ex09;

import java.util.ArrayList;
import java.util.List;

public class Avaliacao {

    protected List<Alienigena> alienigenas;
    protected List<Especie> especies;

    public Avaliacao() {
        this.alienigenas = new ArrayList<>();
        this.especies = new ArrayList<>();
    }

    public void avaliarPericulosidade() {
        for (Alienigena alienigena : alienigenas) {
            alienigena.avaliarPericulosidade();
            //Não consegui tempo para implementar

        }
    }

    public List<Alienigena> getAlienigenas() {
        return this.alienigenas;
    }

    public List<Especie> getEspecies() {
        return this.especies;
    }
}
