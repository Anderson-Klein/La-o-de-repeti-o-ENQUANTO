import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int numero = 0;
        int ateQuanto = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe o quanto quer multiplicar: ");
        ateQuanto = scanner.nextInt();

        System.out.println("Informe o valor para multiplicar: ");
        numero = scanner.nextInt();
        
        
        //Exemplo de For (PARA)

        for (int x = 1; x <= ateQuanto; x++) {
            System.out.println(numero + "x" + x +": " + x*numero);
        }
    }
}
