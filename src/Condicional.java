public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2021;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano= "Normal";
        if(anoDeLancamento>=2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        }else {
            System.out.println("Filme Retro que vale a pena assistir!");
        }
        //condição OU representada por || condiçao E representada por &&
        if (incluidoNoPlano == true && tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Deve pagar a locação");
        }
    }
}
