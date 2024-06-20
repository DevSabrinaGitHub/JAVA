public class ejercicio9{
    public static void main(String[] args) {
        
        //switch java

        var num = 2;
        var texto = "valor";

        switch (num) {
            case 1:
                texto= "numero uno";
                break;
            case 2: 
                texto=" numero dos CORRECTO!";
                break;
        
            default:
                texto ="error";
                break;
        }
        System.out.println(texto);
    }
}