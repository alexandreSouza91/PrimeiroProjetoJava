import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        var numeroRandomico = new Random().nextInt (100);

        System.out.println("Diga um Numero de 0 a 100 e veja se acerta?");
        for (int i = 0; i < 5; i++) {

            double numeros= Double.parseDouble(leitura.next().toString());
            if(numeroRandomico != numeros){
                System.out.println("Você Errou! Tentativa "+ (i+1) + " de 5");
                if(i == 4)
                    System.out.println("Que Pena! o numero era: " + numeroRandomico);
                else
                System.out.println("Diga um Numero de 0 a 100 e veja se acerta?");

             }
            else {
                System.out.println("Parabens você acertou");
                i = 5;
            }

        }

    }
}


