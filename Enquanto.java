import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Exemplo while (ENQUANTO)

        int contador = 0;

        //while (condição)
        while (contador < 10) {
            System.out.println(contador);
            contador = contador + 1;
        }

        Scanner sc = new Scanner(System.in);
        int opcao = 1;

        /*whilw (true){

            System.out.printf("Informe o valor");
            opcao = sc.nextInt();

            if (opcao == 0){
                break;
            }
        }*/

        while (opcao != 0) {
            System.out.println("Informe um valor");
            opcao = sc.nextInt();
        }
    }
}
