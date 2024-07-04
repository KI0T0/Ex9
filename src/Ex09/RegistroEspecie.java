package Ex09;

import java.util.ArrayList;
import java.util.List;

public class RegistroEspecie {

    protected List<Especie> especies;

    public RegistroEspecie() {
        this.especies = new ArrayList<>();
    }

    public void registrarEspecie(String nome, String planetaOrigem, int nivelPericulosidadeBase) {
        Especie especie = new Especie(nome, planetaOrigem, nivelPericulosidadeBase);
        especies.add(especie);
    }

    public List<Especie> getEspecies() {
        return this.especies;
    }
}
