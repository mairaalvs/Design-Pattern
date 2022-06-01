import implementacao.Observador;
import implementacao.Observavel;
import org.junit.Test;
import static org.junit.Assert.*;

//import static junit.framework.TestCase.assertTrue;

public class TesteObserver {

    @Test
    public void testeInscritos(){
        Observavel aplicativo = new Observavel();
        Observador obs1 = new Observador(1);
        aplicativo.registraObservador(obs1);
        assertTrue(!aplicativo.getClientes().isEmpty());
    }

    @Test
    public void teste3Inscritos(){
        Observavel aplicativo = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);
        aplicativo.registraObservador(obs1);
        aplicativo.registraObservador(obs2);
        aplicativo.registraObservador(obs3);
        assertEquals(aplicativo.getClientes().size(), 3);
    }

    @Test
    public void testeNumPalavras(){
        Observavel aplicativo = new Observavel();
        Observador obs1 = new Observador(1);
        aplicativo.registraObservador(obs1);
        aplicativo.setNovoFraseAplicativo("Engenharia de Software eh legal");
        assertEquals(aplicativo.quantidadePalavras(), 5);
    }

    @Test
    public void testeQuebraFrase(){
        Observavel aplicativo = new Observavel();
        Observador obs1 = new Observador(1);
        aplicativo.registraObservador(obs1);
        aplicativo.setNovoFraseAplicativo("Fisica eh chato");

        assertEquals(aplicativo.quebraPalavras()[0], "Fisica" );
        assertEquals(aplicativo.quebraPalavras()[1], "eh" );
        assertEquals(aplicativo.quebraPalavras()[2], "chato" );
    }
}
