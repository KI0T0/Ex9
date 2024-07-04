package Ex09;

import java.util.ArrayList;
import java.util.List;

public class SistemaControle {
    protected List<Alienigena> alienigenas;
    protected List<Especie> especies;

    public SistemaControle() {
        this.alienigenas = new ArrayList<>();
        this.especies = new ArrayList<>();
    }

//    public void registrarAlienigena(int id, String nome, Especie especie, String dataHoraEntrada) {
//        LocalDateTime dataHora = LocalDateTime.parse(dataHoraEntrada);
//        Alienigena alienigena = new Alienigena(id, nome, especie, dataHora);
//        alienigenas.add(alienigena);
//    }

    public void registrarEspecie(String nome, String planetaOrigem, int nivelPericulosidadeBase) {
        Especie especie = new Especie(nome, planetaOrigem, nivelPericulosidadeBase);
        especies.add(especie);
    }

    public void avaliarPericulosidade() {
        for (Alienigena alienigena : alienigenas) {
            alienigena.avaliarPericulosidade();
        }
    }

    public void quarentenaEMonitoramento() {
        // Implementação para colocar em quarentena e monitorar alienígenas perigosos
        for (Alienigena alienigena : alienigenas) {
            if (alienigena.getPericulosidade() > 5) {
                alienigena.setEmQuarentena(true);
                // Lógica de monitoramento aqui
            }
        }
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

    public void encerrarPrograma() {
        // Implementação para encerrar o programa
        System.out.println("Encerrando o programa de controle de alienígenas...");
        System.exit(0); // Encerra o programa com status de sucesso (0)
    }

    // Getters
    public List<Alienigena> getAlienigenas() {
        return this.alienigenas;
    }

    public List<Especie> getEspecies() {
        return this.especies;
    }
}
