package dio.primeiros_passos;

import org.springframework.stereotype.Component;

@Component
public class InnerCalculadora {
    public Integer calcular(int a, int b) {
        return a + b;
    }
}
