package Ex09;

import java.time.LocalDateTime;

public class Alienigena {
    protected int id;
    protected String nome;
    protected Especie especie;
    protected int periculosidade;
    protected LocalDateTime dataEHora;
    protected boolean emQuarentena;

    public Alienigena(int id, String nome, Especie especie, LocalDateTime dataEHora) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.dataEHora = dataEHora;
        this.periculosidade = especie.getPericulosidadeBase();
        this.emQuarentena = false;
    }


    public void avaliarPericulosidade() {

        if (this.periculosidade > 6) {
            this.emQuarentena = true;
        }
    }


    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Especie getEspecie() {
        return this.especie;
    }

    public int getPericulosidade() {
        return this.periculosidade;
    }

    public LocalDateTime getDataEHora() {
        return this.dataEHora;
    }

    public boolean isEmQuarentena() {
        return this.emQuarentena;
    }

    public void setPericulosidade(int periculosidade) {
        this.periculosidade = periculosidade;
    }

    public void setEmQuarentena(boolean emQuarentena) {
        this.emQuarentena = emQuarentena;
    }
}
