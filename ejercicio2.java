public class ejercicio2{
    public static void main(String args[]){

        //declarar variables en java
        //enteros
        int n= 10 + 10;
        System.out.println(n);

        //cadena
        String mensj= "hicimos una suma";
        System.out.println(mensj);

        //variable var , utilizada si no queremos declarar tipo de dato
        var cualquierdato = 10;
        System.out.println(cualquierdato);

        //actualizar variable 
        cualquierdato = 20;
        System.out.println(cualquierdato);

        //tipo dato float
        //si no ponemos el (float)valor el compiler por default tomara como un double y no flotante
        //si ponemos, obliga a que sea flotante
        float datof= (float)10.5;
        System.out.println(datof);

        //double
        double datod= 20.5;
        System.out.println(datod);

        //si queremos imprimir el valor minimo o maximo de un dato, en este caso el de float
        System.out.println("el valor minimo de "+ datof+ " es "+ Float.MIN_VALUE);
        System.out.println("el valor maximo de "+ datof+ " es "+ Float.MAX_VALUE);

        //de double 
        System.out.println("el valor minimo de "+ datod+ " es "+ Double.MIN_VALUE);

        //tipo dato char
        char caracter= 'a';
        System.out.println(caracter);


        //tipo dato boleano
        boolean boleano= true;
        System.out.println(boleano);

        if(boleano == false){
            System.out.println(boleano);
        }else{
            System.out.println("el otro tipo de dato");
        }


    }
}