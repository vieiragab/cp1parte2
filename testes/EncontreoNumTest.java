import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EncontreoNumTest {

    @Test
    public void testeEncontreoNumCenarioFeliz() {
        EncontreoNumFinder finder = new EncontreoNumFinder();
        int[] entrada = {4, 1, 2, 1, 2};
        int resultado = finder.encontreoNum(entrada);
        assertEquals(4, resultado);
    }

    @Test
    public void testeEncontreoNumCenarioExcecao() {
        EncontreoNumFinder finder = new EncontreoNumFinder();
        int[] entrada = {2, 2, 3, 3, 1};
        int resultado = finder.encontreoNum(entrada);
        assertEquals(1, resultado);
    }
}

