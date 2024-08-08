/**
 * @author {MonkeyGT;} 
 * */
import java.util.Scanner;
public class promedio {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Se utiliza el comando "sout" para imprimir en pantalla el requerimiento solicitado para el usuario// 
            System.out.println("Ingrese la Primera Nota1:");
            int Nota1= scanner.nextInt();
            System.out.println("Ingrese la segunda Nota2:");
            int Nota2= scanner.nextInt();
            System.out.println("Ingrese la Tercera Nota3:");
            int Nota3= scanner.nextInt();
            System.out.println("Ingrese la Cuarta Nota4:");
            int Nota4= scanner.nextInt();
        /**Se realiza la operacion de calculo realizando primero una suma de notas y luego una division dentro de la cantidad de notas
         ingresadas para saber el promedio solicitado * */ 
            int Promedio= (Nota1+Nota2+Nota3+Nota4)/4;
            System.out.println("Su promedio es: "+ Promedio);
    }

}