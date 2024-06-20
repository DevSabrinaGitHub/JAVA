public class ejercicio8 {
    public static void main(String[] args) {
        
        var y = 5;
        var x= 10;
        var z= y++ + x--; //se guarda la suma en z, y++ quedaria en 6, x-- en 9
        
        System.out.println(y); //5
        System.out.println(x); //10
        System.out.println(z); //16

    }
}
