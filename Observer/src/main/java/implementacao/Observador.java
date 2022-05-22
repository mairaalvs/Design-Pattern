package implementacao;

import interfaces.iObservador;

public class Observador implements iObservador {
    private String frase;
    int id;

    public Observador(int id) {
        this.id = id;
    }

    String teste = "frase de teste";

    @Override
    public void update(Observavel aplicativo) {
        System.out.println("Frase: " + aplicativo.getFrase());
        System.out.println("Clientes: "+this.id);
        System.out.println("Essa frase tem " + aplicativo.quebraPalavra() + " palavras." );
    }

}
