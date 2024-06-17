import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
    @Test
    void validarAlgoSomenteNoUsuarioBruno() {
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
    }
}
