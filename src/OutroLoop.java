import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao  =0;
        double nota=0;
        int totalDeNotas = 0;
        while (nota != -1) {
            System.out.println("Diga uma nota para o filme? ou -1 para encerrar");
            nota= leitura.nextDouble();
            if (nota!= -1){

            mediaAvaliacao = mediaAvaliacao+nota;
            totalDeNotas++;}
        }
        System.out.println("Media de avaliações " + mediaAvaliacao/3);
    }
}

