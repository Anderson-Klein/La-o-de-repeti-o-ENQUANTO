import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int opcao = 0;
        Scanner scanner = new Scanner(System.in);


        //Exemplo de ate
        do {
            System.out.println("Para continuar informe 0");
            opcao = scanner.nextInt();

        }while(opcao == 0);
    }
}
