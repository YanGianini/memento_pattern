public class VeiculoEstadoAlugado implements VeiculoEstado{

    private VeiculoEstadoAlugado() {};
    private static VeiculoEstadoAlugado instance = new VeiculoEstadoAlugado();
    public static VeiculoEstadoAlugado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Alugado";
    }

}
