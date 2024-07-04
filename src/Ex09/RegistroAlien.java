package Ex09;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RegistroAlien {
    protected List<Alienigena> alienigenas;

    public RegistroAlien() {
        this.alienigenas = new ArrayList<>(); // Inicializa a lista no construtor
    }

    public void registrarAlienigena(int id, String nome, Especie especie, String dataHoraEntrada) {
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraEntrada);
        Alienigena alienigena = new Alienigena(id, nome, especie, dataHora);
        alienigenas.add(alienigena);
    }

    public List<Alienigena> getAlienigenas() {
        return this.alienigenas;
    }
}
