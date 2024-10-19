import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppListado {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Definimos el listado de Personas
        List<Persona> personas = new ArrayList<>();

        //Empezamos con el menu
        boolean salir = false;

        while (!salir){
            mostrarMenu();
            try {
                salir = operacion(scan, personas);

            }catch (Exception e){
                System.out.println("Ocurrio un Error"+e.getMessage());
            }
            System.out.println("");
        }
    }

    private static boolean operacion(Scanner scan, List<Persona> personas) {
        int opcion = Integer.parseInt(scan.nextLine());
        boolean salir = false;
        //Revisamos la opcion
        switch (opcion){
            case 1 ->{
                //Agregar persona a la lista
                System.out.print("Nombre de la persona: ");
                String nombre = scan.nextLine();
                System.out.print("Telefono de la persona: ");
                String telefono = scan.nextLine();
                System.out.print("Email de la persona: ");
                String email = scan.nextLine();

                //creamos objeto persona
                Persona persona = new Persona(nombre, telefono, email);
                //Lo agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: "+personas.size());
            }
            case 2 ->{
                //Mostramos el listado
                System.out.println("Lsitado de personas");
                //Mejora usando lambda y metodo de referencia
                //personas.forEach((persona -> System.out.println(persona)));
                personas.forEach(System.out::println);
            }
            case 3 ->{
                //La opcion es salir, cambiamos el estado
                System.out.println("Saliendo del programa....");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: "+ opcion);
        }
        return salir;
    }

    private static void mostrarMenu() {
        //Mostramos las opciones
        System.out.print("""
                **Programa de listado de personas**
                1. Agregar Persona
                2. Lista de Personas
                3. Salir del programa
                """);
        System.out.print("El n° de opcion es: ");
    }
}