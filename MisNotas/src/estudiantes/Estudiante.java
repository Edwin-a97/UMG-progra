package estudiantes;

public class Estudiante {
    private String carne;
    private String nombre;
    private double nota;

    public Estudiante(String carne, String nombre, double nota) {
        this.carne = carne;
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getCarne() { return carne; }
    public String getNombre() { return nombre; }
    public double getNota() { return nota; }

    @Override
    public String toString() {
        return "Carné: " + carne + ", Nombre: " + nombre + ", Nota: " + nota;
    }
}
