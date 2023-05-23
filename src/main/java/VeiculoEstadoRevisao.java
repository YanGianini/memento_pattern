public class VeiculoEstadoRevisao implements VeiculoEstado {

    private VeiculoEstadoRevisao() {};
    private static VeiculoEstadoRevisao instance = new VeiculoEstadoRevisao();
    public static VeiculoEstadoRevisao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em revisão";
    }

}
