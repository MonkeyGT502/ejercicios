import java.util.Scanner;
public class kilowatts {

    /**
     * @autor MonkeyGT
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        // Se ingresan los Kilowatts consumidos
        System.out.println("Ingrese los Kilowatts consumindos: ");
        double kilowatts = scanner.nextDouble();
        // Se ingresara el valor de un Kilowatts
        System.out.println("Ingrese el valor de un Kilowatts: ");
        double valorKilowatts = scanner.nextDouble();
        // Operacion de total a pagar
        double total = kilowatts * valorKilowatts;
        // Se imprimira el valor a pagar
        System.out.println("Total a pagar: " + total);
    } 
}