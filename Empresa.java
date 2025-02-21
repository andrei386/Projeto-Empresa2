import java.util.*;
import java.lang.Math;

class ProjetoEmpresa {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Sistema de informação
        System.out.println("Sistema de informação");

        // Declaração da empresa
        String nome;
        double salário;

        System.out.println("informe nome");
        nome = input.nextLine();
        System.out.println("informe salário");
        salário = input.nextDouble();

        // Pocessamento
        if (salário >= 5000) {

            // Saida
            System.out.println("Quantidade a ser paga=R$" + (salário - salário * 0.8));
        } else {

            // Saida
            System.out.println("Você não precisa ´pagar imposto. ");
        }
    }
}
