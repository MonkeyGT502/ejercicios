/**
 * @author {Monkey;} 
 * */
import java.util.Scanner;
public class promedio {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            System.out.println("Ingrese la Primera Nota1:");
            int Nota1= scanner.nextInt();
            System.out.println("Ingrese la segunda Nota2:");
            int Nota2= scanner.nextInt();
            System.out.println("Ingrese la Tercera Nota3:");
            int Nota3= scanner.nextInt();
            System.out.println("Ingrese la Cuarta Nota4:");
            int Nota4= scanner.nextInt();
            int Promedio= (Nota1+Nota2+Nota3+Nota4)/4;
            System.out.println("Su promedio es: "+ Promedio);
    }

}