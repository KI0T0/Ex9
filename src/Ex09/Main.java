package Ex09;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SistemaControle sistema = new SistemaControle();
        RegistroAlien alien1 = new RegistroAlien();
        RegistroAlien alien2 = new RegistroAlien();

        RegistroEspecie especie1 = new RegistroEspecie();
        RegistroEspecie especie2 = new RegistroEspecie();


        especie1.registrarEspecie("Vulcaniano", "Vulcano", 3);
        especie2.registrarEspecie("Klingon", "Qo'noS", 7);

        alien1.registrarAlienigena(1, "Spock", especie1.getEspecies().getFirst(), "2024-07-04T10:15:30");
        alien2.registrarAlienigena(2, "Worf", especie2.getEspecies().getFirst(), "2024-07-04T11:30:00");


        Relatorio relatorio = new Relatorio(alien1.getAlienigenas());
        relatorio.relatorioDeEntradas();
        Quarentena quarentena = new Quarentena(sistema.getAlienigenas(), sistema.getEspecies());
        quarentena.quarentenaEMonitoramento();
        //Não consegui implementar relatorioDeEntradas
        sistema.relatorioDeEntradas();
        Avaliacao avaliacao = new Avaliacao();

        //Não consegui implementar avaliarPericulosidade
        avaliacao.avaliarPericulosidade();
        Encerramento.encerrarPrograma();
    }
}
