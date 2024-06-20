package clases2;

public class clases2 {

    //atributos de la clase
    int a;
    int b;


    //metodos de la clase
    public void sumar(){
        int result= a + b ;
        System.out.println(result);
    }

    public int sumarconRetorno(){
        return a + b;
    }

    //pasar argumentos 
    public int sumarconArgumentos(int arg1, int arg2){
        a = arg1;
        b=  arg2;
        return a + b;
    }
}