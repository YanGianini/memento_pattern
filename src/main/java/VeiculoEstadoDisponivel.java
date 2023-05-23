public class VeiculoEstadoDisponivel implements VeiculoEstado{

    private VeiculoEstadoDisponivel() {};
    private static VeiculoEstadoDisponivel instance = new VeiculoEstadoDisponivel();
    public static VeiculoEstadoDisponivel getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Disponivel";
    }
}
