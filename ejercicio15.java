public class ejercicio15 {
    public static void main(String[] args) {
        
        for ( var b = 0; b < 3; b++){
            if (b % 2 != 0){
                continue;  //si el resto de i es distinto a 0, es decir, es impar
            }
            System.out.println(b); //continue no imprime si es impar, imprime unicamente cuando sea par, siguiendo una condicion
        }
    }
    
}
