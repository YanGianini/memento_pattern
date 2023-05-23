import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private VeiculoEstado veiculoEstado;
    private List<VeiculoEstado> memento = new ArrayList<VeiculoEstado>();

    public VeiculoEstado getEstado() {
        return this.veiculoEstado;
    }

    public void setVeiculoEstado(VeiculoEstado veiculoEstado) {
        this.veiculoEstado = veiculoEstado;
        this.memento.add(this.veiculoEstado);
    }

    public void restauraEstado(int ind) {
        if (ind < 0 || ind > this.memento.size() -1) {
            throw new IllegalArgumentException("Indice invalido");
        }
        this.veiculoEstado = this.memento.get(ind);
    }

    public List<VeiculoEstado> getListEstados() {
        return this.memento;
    }
}
