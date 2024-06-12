import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.teste.junit.Pessoa;

public class AssertionsTeste {
    @Test
    void validarLancamento () {
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,20,30,40,60};

        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoNulo () {
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);
    }

    @Test
    void validarNumerosTiposDiferentes () {
        double valor = 5.0;

        int outroValor = 5;

        Assertions.assertEquals(valor, outroValor);
    }
}
