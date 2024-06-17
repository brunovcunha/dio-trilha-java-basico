import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.teste.junit.BancoDeDados;

public class ConsultarDadosPessoaTeste {
  
    @BeforeAll
    static void configuraConexao () {
        BancoDeDados.iniciarConexao();

        System.out.println("Rodou configuraConexao");
    }

    @Test
    void validarDadosDeRetorno () {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao () {
        BancoDeDados.finalizarConexao();;
        System.out.println("rodou finalizarConexao");
    }
}
