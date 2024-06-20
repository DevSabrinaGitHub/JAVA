import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        System.out.println("ingrese su nombre");
        Scanner valorusuario = new Scanner(System.in);  //lee el valor
        var usuario= valorusuario.nextLine(); //el valor que leyo asigna ahora a "usuario"
        System.out.println("su nombre es: "+ usuario);

        valorusuario.close(); // cerramos el Scanner
    }  
}
