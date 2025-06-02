import java.util.*;
import java.awt.*;

public class VisaoDeTexto implements VisaoSimulador {

    private Set<Class<?>> classes;
    
    private Map<Class<?>, Color> cores;

    private EstatisticasCampo estatisticas;

    public VisaoDeTexto() {
        this.classes = new HashSet<>();
        this.cores = new LinkedHashMap<>();;
        this.estatisticas = new EstatisticasCampo();;
    }

    @Override
    public void definirCor(Class<?> classeAnimal, Color cor) {
        
    }

    @Override
    public boolean ehViavel(Campo campo) {
        return estatisticas.ehViavel(campo);
    }


    @Override
    public void mostrarStatus(int passo, Campo campo) {
        estatisticas.reiniciar();
        System.out.println("Passo " + passo + " - " + estatisticas.obterDetalhesPopulacao(campo));
    }

    @Override
    public void reiniciar() {
        estatisticas.reiniciar();
    }

    @Override
    public void reabilitarOpcoes() {

    }

    

    
    
}