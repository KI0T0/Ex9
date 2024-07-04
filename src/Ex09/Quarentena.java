package Ex09;

import java.util.List;

public class Quarentena {

    protected List<Alienigena> alienigenas;
    protected List<Especie> especies;

    public Quarentena(List<Alienigena> alienigenas, List<Especie> especies) {
        this.alienigenas = alienigenas;
        this.especies = especies;
    }

    public void quarentenaEMonitoramento() {
        for (Alienigena alienigena : alienigenas) {
            if (alienigena.getPericulosidade() > 5) {
                alienigena.setEmQuarentena(true);
            }
        }
    }

    public List<Alienigena> getAlienigenas() {
        return this.alienigenas;
    }

    public List<Especie> getEspecies() {
        return this.especies;
    }
}
