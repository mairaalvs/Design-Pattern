import implementacao.Observavel;
import implementacao.Observador;

public class AplicativoQP {
    public static void main(String[] args) {

        // Criando o observavel (subject) aplicativo.
        Observavel aplicativo = new Observavel();

        //Criando 3 observadores e fazendo a inscrição em Netflix.
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        aplicativo.registraObservador(obs1);
        aplicativo.registraObservador(obs2);
        aplicativo.registraObservador(obs3);

        aplicativo.setNovoFraseAplicativo("Engenharia de Software eh legal");
        aplicativo.setNovoFraseAplicativo("Fisica eh chato");

        aplicativo.removeObservador(obs3);

        System.out.println("\n\nMandando notificacao da ultima frases: ");
        aplicativo.notificaObservadores();
    }
}
