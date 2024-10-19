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
            System.out.println("");
        }
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