import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.teste.junit.Pessoa;

public class PessoaTeste {
    
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa p1 = new Pessoa("Zezinho", LocalDateTime.of(2000, 6, 10, 15, 10, 6));

        Assertions.assertEquals(24, p1.getIdade());
    }

    @Test
    void deveRetornarSeMaiorDeIdade() {
        Pessoa p1 = new Pessoa("Zé", LocalDateTime.of(2010, 6, 10, 10, 5, 10));

        Assertions.assertTrue(p1.ehMaiorDeIdade());
    }
}
