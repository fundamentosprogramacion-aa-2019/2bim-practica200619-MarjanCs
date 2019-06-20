
package manejodemetodos;



public class MisMetodos {
    
    public static double obtenerPotencia(int base, int potencia){
        double valor = Math.pow(base, potencia);
        
        return valor;
    }
    
    public static void obtenerPotenciaDos(int b, int p){
        double valor = Math.pow(b, p);
        System.out.printf("El valor de su operacion es %.2f\n", valor);
        
    }
}
