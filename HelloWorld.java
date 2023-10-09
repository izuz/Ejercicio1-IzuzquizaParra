// Importo librerias
import java.util.Scanner;
import java.time.LocalDate;

// Clase principal
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creo un objeto Scanner
        System.out.println("¿Cómo te llamas?"); // Imprimo un mensaje
        String name = scanner.nextLine(); // Leo la entrada del usuario
        System.out.println("¡Hola " + name + "!"); // Imprimo un mensaje
    }
}