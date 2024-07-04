package Ex09;

public class Especie {
    protected String nome;
    protected String planetaOrigem;
    protected int periculosidadeBase;

    public Especie(String nome, String planetaOrigem, int periculosidadeBase) {
        this.nome = nome;
        this.planetaOrigem = planetaOrigem;
        this.periculosidadeBase = periculosidadeBase;
    }


    public String getNome() {
        return this.nome;
    }

    public String getPlanetaOrigem() {
        return this.planetaOrigem;
    }

    public int getPericulosidadeBase() {
        return this.periculosidadeBase;
    }
}
