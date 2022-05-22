package implementacao;

import interfaces.iObservador;

public class Observador implements iObservador {
    private String frase;
    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel aplicativo) {
        System.out.println("Frase: " + aplicativo.getFrase());
        System.out.println("Clientes: "+this.id);
    }

}
