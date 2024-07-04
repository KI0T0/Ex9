package Ex09;

import java.util.List;

public class Relatorio {

    protected List<Alienigena> alienigenas;

    public Relatorio(List<Alienigena> alienigenas) {
        this.alienigenas = alienigenas;
    }

    public void relatorioDeEntradas() {
        System.out.println("Relatório de Entradas de Alienígenas:");
        for (Alienigena alienigena : alienigenas) {
            System.out.println("Nome: " + alienigena.getNome());
            System.out.println("Espécie: " + alienigena.getEspecie().getNome());
            System.out.println("Em quarentena: " + (alienigena.isEmQuarentena() ? "Sim" : "Não"));
            System.out.println("Nível de Periculosidade: " + alienigena.getPericulosidade());
            System.out.println("--------------------------");
        }
    }
}