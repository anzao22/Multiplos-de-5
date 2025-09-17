import java.util.Scanner; //Llamar Scanner
public class Mult5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//activar lector
        System.out.println("Ingrese la cantidad de múltiplos de 5 que desea ver"); // Solicitar entrada
        int N = sc.nextInt(); //Leer N (dato ingresado)
        sc.close();
        
        int i = 1; // contador de números mostrados
        int M = 5; //al primer múltiplo lo llamaré M
        
          System.out.println("Los primeros " + (N) + " múltiplos de 5 son:"); //mostrar msj presentación

        while(i<=N){        //Si el contador es menor o igual al número dado
           System.out.println(M); //mostrar el múltiplo

            M+=5;//aumentar de 5 en 5
            i++; //aumentar contador de 1 en 1
        }
       
    }
    
}
