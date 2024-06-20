package clases2;

public class pruebaclase2 {
    public static void main(String[] args) {
        
        //creamos nuevo objeto
        clases2 Clase2= new clases2();

        //asignamos
        Clase2.a= 3;
        Clase2.b= 10;

        //llamamos metodo
        Clase2.sumar();

        int result= Clase2.sumarconRetorno();
        System.out.println(result);

        Clase2.sumarconArgumentos(5, 8);

    }
}
