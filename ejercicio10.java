public class ejercicio10 {
    public static void main(String[] args) {
        
        var estacion = "estacion desconocida";
        var mes =1;

        switch (mes) {
            case 12: case 1: case 2: case 3: 
                estacion  ="verano"; 
                break;
            case 4: case 5: case 6: 
                estacion= "otoño";
                break;
            default:
               estacion= "error";
               break;
        }
        System.out.println(estacion);
    }
}
