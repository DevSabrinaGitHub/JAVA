import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        // Convertir un String a entero
        var convertir = Integer.parseInt("20");
        System.out.println(convertir);

        // Pedir al usuario que ingrese su edad
        var consola = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        
        // Leer la entrada del usuario como String y convertirla a entero
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("Edad ingresada: " + edad);

        // Cerrar el Scanner para liberar recursos
        consola.close();
    }
}
