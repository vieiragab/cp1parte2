import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SomaMaxTest {

    @Test
    public void testeMaxSubArraySumCenarioFeliz() {
        MaxSubArrayFinder finder = new MaxSubArrayFinder();
        int[] entrada = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int resultado = finder.maxSubArraySoma(entrada);
        assertEquals(6, resultado);
    }

    @Test
    public void testeMaxSubArraySumArrayVazio() {
        MaxSubArrayFinder finder = new MaxSubArrayFinder();
        int[] entrada = {};
        int resultado = finder.maxSubArraySoma(entrada);
        assertEquals(0, resultado);
    }
}

