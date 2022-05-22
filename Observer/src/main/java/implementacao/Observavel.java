package implementacao;

import interfaces.iObservavel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.text.*;
//import java.util.Date;
import java.util.StringTokenizer;

public class Observavel implements iObservavel {
    private String frase;
    private String quebraFrase[];
    private List<Observador> clientes;

    public Observavel() {
        clientes = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador obs) {
        clientes.add(obs); //adiciona um observador
    }

    @Override
    public void removeObservador(Observador obs) {
        if(clientes.contains(obs))
            clientes.remove(obs); //remove observador se ele ja tiver sido adicionado
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : clientes) {
            observador.update(this);
        }
    }

    //Método chamado sempre que os valore se modificacam
    private void novasMedidas() {
        notificaObservadores();
    }

    public void setNovoFraseAplicativo(String frase) {
        System.out.println("\n\n####### Aplicativo anuncia frase nova #######\n\n");
        this.frase = frase;
        novasMedidas();
    }

    public String quebraPalavra() {
        String myString = this.frase;
        StringTokenizer stringTokenizer1 = new StringTokenizer(myString);
        int tokensCount1  = stringTokenizer1.countTokens();

        return String.valueOf(tokensCount1);
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String titulo) {
        this.frase = frase;
    }

    public void setClientes(List<Observador> clientes) {
        this.clientes = clientes;
    }

    public List<Observador> getClientes() {
        return clientes;
    }
}
