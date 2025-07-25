package estudiantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EstudianteServicio servicio = new EstudianteServicio();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante por carné");
            System.out.println("3. Eliminar estudiante por carné");
            System.out.println("4. Listar todos los estudiantes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Carné: ");
                    String carne = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();
                    servicio.agregar(new Estudiante(carne, nombre, nota));
                    System.out.println("✅ Estudiante agregado.");
                    break;

                case 2:
                    System.out.print("Ingrese el carné a buscar: ");
                    String buscarCarne = sc.nextLine();
                    Estudiante e = servicio.buscar(buscarCarne);
                    System.out.println(e != null ? e : "❌ Estudiante no encontrado.");
                    break;

                case 3:
                    System.out.print("Ingrese el carné a eliminar: ");
                    String eliminarCarne = sc.nextLine();
                    servicio.eliminar(eliminarCarne);
                    System.out.println("✅ Eliminado (si existía).");
                    break;

                case 4:
                    System.out.println("📋 Lista de estudiantes:");
                    for (Estudiante est : servicio.listar()) {
                        System.out.println(est);
                    }
                    break;

                case 0:
                    System.out.println("👋 Saliendo...");
                    break;

                default:
                    System.out.println("❗ Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}

