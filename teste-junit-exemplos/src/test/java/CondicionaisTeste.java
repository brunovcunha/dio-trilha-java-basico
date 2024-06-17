import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "bruno")
    void validarAlgoSomenteNoUsuarioBruno() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
