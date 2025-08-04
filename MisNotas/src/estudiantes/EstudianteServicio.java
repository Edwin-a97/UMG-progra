package estudiantes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstudianteServicio implements Crud<Estudiante> {

    private List<Estudiante> lista = new ArrayList<>();
    private Map<String, Estudiante> mapa = new HashMap<>();

    @Override
    public void agregar(Estudiante est) {
        lista.add(est);
        mapa.put(est.getCarne(), est);
    }

    @Override
    public Estudiante buscar(String carne) {
        return mapa.get(carne);
    }

    @Override
    public void eliminar(String carne) {
        Estudiante est = mapa.remove(carne);
        if (est != null) lista.remove(est);
    }

    @Override
    public List<Estudiante> listar() {
        return lista;
    }
}
