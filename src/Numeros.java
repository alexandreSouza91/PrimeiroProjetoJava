import javax.print.attribute.standard.PrinterStateReason;
import java.util.Random;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero!");
        int numero= leitura.nextInt();


            if (numero > 0) {
                System.out.println("Numero Positivo");
            } else {
                System.out.println("Numero Negativo!");
            }
        }
    }
