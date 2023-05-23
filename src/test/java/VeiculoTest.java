import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class VeiculoTest {
    @Test
    void deveArmazenarEstados() {
        Veiculo veiculo = new Veiculo();
        veiculo.setVeiculoEstado(VeiculoEstadoRevisao.getInstance());
        veiculo.setVeiculoEstado(VeiculoEstadoDisponivel.getInstance());
        veiculo.setVeiculoEstado(VeiculoEstadoAlugado.getInstance());
        assertEquals(3, veiculo.getListEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Veiculo veiculo = new Veiculo();
        veiculo.setVeiculoEstado(VeiculoEstadoRevisao.getInstance());
        veiculo.setVeiculoEstado(VeiculoEstadoDisponivel.getInstance());
        veiculo.setVeiculoEstado(VeiculoEstadoAlugado.getInstance());
        veiculo.restauraEstado(0);
        assertEquals(VeiculoEstadoRevisao.getInstance(), veiculo.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Veiculo veiculo = new Veiculo();
        veiculo.setVeiculoEstado(VeiculoEstadoRevisao.getInstance());
        veiculo.setVeiculoEstado(VeiculoEstadoDisponivel.getInstance());
        veiculo.setVeiculoEstado(VeiculoEstadoAlugado.getInstance());
        veiculo.restauraEstado(1);
        assertEquals(VeiculoEstadoDisponivel.getInstance(), veiculo.getEstado());
    }

    @Test
    void deveRetornarException() {
        try {
            Veiculo veiculo = new Veiculo();
            veiculo.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Indice invalido", e.getMessage());
        }
    }
}
