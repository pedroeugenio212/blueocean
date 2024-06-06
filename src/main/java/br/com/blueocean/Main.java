package br.com.blueocean;

import java.util.InputMismatchException;


public class Main
{
    public static void main(String[] args)
    {
        Utilitario util = new Utilitario();
        util.Instanciar();
        int op;
        System.out.println("Bem vindo a tela inicial da Blue Ocean");
        do
        {
            try
            {
                op = util.EscolherTela();
                switch (op)
                {
                    case 1 -> util.Home();
                    case 2 -> util.Scan();
                    case 3 -> util.Withdraw();
                    case 4 -> util.Info();
                    case 5 -> util.Partners();
                    case 6 -> util.Config();
                    case 0 -> System.out.println("Finalizando o programa");
                    default -> System.out.println("\nOpção inválida");
                }
            } catch (InputMismatchException e)
            {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                util.LimparEntradaInvalida();
                op = -1;
            }
        } while (op != 0);
}

}
