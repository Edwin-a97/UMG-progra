package estudiantes;

import java.util.List;

public interface Crud<T> {
    void agregar(T obj);
    T buscar(String clave);
    void eliminar(String clave);
    List<T> listar();
}
