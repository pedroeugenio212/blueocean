package br.com.blueocean;

import br.com.blueocean.entity.Conta;
import br.com.blueocean.entity.Endereco;
import br.com.blueocean.entity.Medalha;
import br.com.blueocean.entity.NotaFiscal;
import br.com.blueocean.entity.Parceiro;
import br.com.blueocean.entity.Sacola;
import br.com.blueocean.entity.TransacaoCashback;
import br.com.blueocean.entity.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Utilitario
{
    Scanner sc = new Scanner(System.in);
    Endereco enderecoUsuario = new Endereco();
    Endereco enderecoParceiro1 = new Endereco();
    Endereco enderecoParceiro2 = new Endereco();
    Conta conta = new Conta();
    Parceiro parceiro = new Parceiro();
    Usuario usuario = new Usuario();
    TransacaoCashback transacaoCashback = new TransacaoCashback();
    Sacola sacola = new Sacola();
    NotaFiscal notaFiscal = new NotaFiscal();
    Medalha medalha = new Medalha();
    
    List<Sacola> sacolas = new ArrayList<>();
    List<Parceiro> parceiros = new ArrayList<>();
    List<Parceiro> parceirosFavoritos = new ArrayList<>();
    List<NotaFiscal> notasFiscais = new ArrayList<>();
    List<NotaFiscal> notasFiscais2 = new ArrayList<>();

    public void Instanciar()
    {
        enderecoUsuario
            .setId(1)
            .setCep(41516140)
            .setEstado("SP")
            .setCidade("São Paulo")
            .setBairro("Bela Vista")
            .setLogradouro("Avenida Paulista");
        enderecoParceiro1 
            .setId(2)
            .setCep(39839486)
            .setEstado("BA")
            .setCidade("Salvador")
            .setBairro("Itaigara")
            .setLogradouro("Avenida Antônio Carlos Magalhães");
        enderecoParceiro2 
            .setId(2)
            .setCep(58694752)
            .setEstado("CE")
            .setCidade("Fortaleza")
            .setBairro("Benfica")
            .setLogradouro("Avenida Domingos Olímpio");
        
        conta 
            .setId(1)
            .setNumeroConta(0000045600)
            .setNumeroAgencia(2223)
            .setNumeroBanco(9876)
            .setNomeBanco("Banco do Brasil");



        sacolas.add(new Sacola().setId(123456).setQntReutilizacao(40).setNotaFiscal(notasFiscais));
        sacolas.add(new Sacola().setId(654321).setQntReutilizacao(70).setNotaFiscal(notasFiscais2));
        
        parceiros.add(new Parceiro()
            .setCnpj("12345678901234")
            .setNome("Pão de Açucar")
            .setEmail("paodeacucar@gmail.com")
            .setPorcentagemCashback(2)
            .setEndereco(enderecoParceiro1));
        parceiros.add(new Parceiro()
            .setCnpj("12154785849584")
            .setNome("Hiperideal")
            .setEmail("hiperideal@gmail.com")
            .setPorcentagemCashback(3)
            .setEndereco(enderecoParceiro2));

        parceirosFavoritos.add(new Parceiro() .setCnpj("12345678901234")
                .setNome("Pão de Açucar")
                .setEmail("paodeacucar@gmail.com")
                .setPorcentagemCashback(2)
                .setEndereco(enderecoParceiro1));

        usuario 
            .setCpf(1234567890)
            .setNome("Fernando")
            .setSobrenome("Barreto")
            .setEmail("fernandobarreto@gmail.com")
            .setSenha("1234")
            .setConta(conta)
            .setSacolas(sacolas)
            .setEndereco(enderecoUsuario)
                .setParceiros(parceirosFavoritos);
        
        notasFiscais.add(new NotaFiscal()
            .setId(142345)
            .setValorCompra((float) 500.00)
            .setData(LocalDate.of(2024, 6, 3))
            .setSacola(sacolas.get(0))
            .setParceiro(parceiros.get(0))
            .setTrasacaoCashback(transacaoCashback));
        notasFiscais.add(new NotaFiscal()
            .setId(2324235)
            .setValorCompra((float) 1500.00)
            .setData(LocalDate.of(2024, 5, 20))
            .setSacola(sacolas.get(1))
            .setParceiro(parceiros.get(1))
            .setTrasacaoCashback(transacaoCashback));
        notasFiscais.add(new NotaFiscal()
            .setId(3423423)
            .setValorCompra((float) 300.00)
            .setData(LocalDate.of(2024, 6, 1))
            .setSacola(sacolas.get(0))
            .setParceiro(parceiros.get(0))
            .setTrasacaoCashback(transacaoCashback));
        notasFiscais2.add(new NotaFiscal()
                .setId(4536280)
                .setValorCompra((float) 500.00)
                .setData(LocalDate.of(2024, 6, 1))
                .setSacola(sacolas.get(1))
                .setParceiro(parceiros.get(1))
                .setTrasacaoCashback(transacaoCashback));
        
        transacaoCashback
            .setId(1)
            .setData(LocalDate.of(2024, 6, 5))
            .setValorTransacao(notaFiscal.totalCashback(notasFiscais));
    }
   


    public int EscolherTela()
    {
        System.out.println("""
                --------------------------------------------------------------------------           
                Escolha uma das opções a seguir para navegar entre as telas do aplicativo:      
                
                1 - Home
                2 - Detalhes do escaneamento
                3 - Saque do cashback
                4 - Informações sobre o app
                5 - Quem são nossos parceiros
                6 - Configurações
                0 - Sair do aplicativo
                """);
        int op = sc.nextInt();
        return op;
    }

    public void LimparEntradaInvalida()
    {
        if (sc.hasNext())
            sc.next();
    }

    public void Home() 
    {
        System.out.println("-----------------------------------Home-----------------------------------");
        System.out.println("""           
                Olá,Fernando
                           
                O seu progresso:
                """);
        System.out.println("A sua blue ocean bag já foi reutilizada " + sacola.totalReutilizacoes(sacolas) + " vezes");
        System.out.println("Você já evitou que " + sacola.totalContribuicao(sacolas)  + " sacolas de plástico fossem parar nos oceanos");
        System.out.println("Suas medalhas: " + usuario.listarMedalhas(medalha.totalMedalhas(sacola.totalReutilizacoes(sacolas))));
    
    }
    
    public void Scan() 
    {
        System.out.println("-------------------------Detalhes do escaneamento-------------------------");
        System.out.println("Nota fiscal escaneada: " + notasFiscais.get(0).getId());
        System.out.println("Código da sua sacola: " + usuario.getSacolas().get(0).getId());
        System.out.println("Valor da sua compra: R$ " + String.format("%.2f", notasFiscais.get(0).getValorCompra()));
        System.out.println("Valor a ser recebido em cashback: R$ " + String.format("%.2f", notaFiscal.cashbackCompra(notasFiscais.get(0))));
    
    }
    
    public void Withdraw() 
    {
        System.out.println("---------------------- Saque do cashback ----------------------");
        System.out.println("Aqui você consegue sacar o valor recebido em cashback");
        System.out.println("Saldo disponível: R$ " + String.format("%.2f", notaFiscal.totalCashback(notasFiscais)));
        System.out.println("Seus dados bancários: ");
        System.out.println("Conta: " + usuario.getConta().getNumeroConta());
        System.out.println("Agência: " + usuario.getConta().getNumeroAgencia());
        System.out.println("Banco: " + usuario.getConta().getNumeroBanco());
        System.out.println(usuario.getConta().getNomeBanco());
    
    }
    public void Info() 
    {
        System.out.println("-------------------- Informações sobre o app --------------------");
        System.out.println("""
                           Novo por aqui, ou com dúvidas? Aqui é o seu lugar!
                           
                                Como começar?
                           Procure um dos nossos parceiros mais próximos a você na aba “Parceiros”. 
                           Depois, basta fazer suas compras normalmente no estabelecimento. 
                           Após pagar a compra, escaneie o qrcode da nota fiscal e pronto! A gente cuida de todo o resto.
                           
                                Em quanto tempo recebo o cashback?
                           Você poderá ver o valor de cashback recebido em uma compra instantaneamente no app da Blue Ocean.
                           
                                Onde posso comprar uma ecobag Blue Ocean?
                           Você pode comprar uma das nossas sacolas em qualquer um dos nossos parceiros. 
                           Caso elas não estejam visíveis, pergunte no caixa. 
                           Temos certeza que nossos parceiros ficarão felizes em ajudá-lo.
                           """);
    
    }
    public void Partners() 
    {
        System.out.println("--------------- Quem são nossos parceiros ---------------");
        System.out.println("Parceiros: \n" + parceiro.listarParceiros(parceiros));
    
    }
    public void Config() 
    {
        System.out.println("------------------------- Configurações -------------------------");
        System.out.println("Aqui você consegue ver todas as informačões relacionadas à sua conta:");
        System.out.println("\nMinhas informações pessoais: \nNome: " + usuario.getNome() +
                "\nEndereco: " + usuario.getEndereco() +
                "\nEmail: " + usuario.getEmail() +
                "\nCpf: " + usuario.getCpf());
        System.out.println("\nMeus parceiros favoritos: \nNome do parceiro: " + usuario.getParceiros().get(0).getNome() +
                "\nEndereco do parceiro: " + usuario.getParceiros().get(0).getEndereco() +
                "\nEmail do parceiro: " + usuario.getParceiros().get(0).getEmail());
        System.out.println("\nMeus recibos: \nId da transação: " + transacaoCashback.getId() +
                "\nData efetuada: " + transacaoCashback.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                "\nTotal retirado : R$ " + String.format("%.2f", transacaoCashback.getValorTransacao()) +
                "\nDetalhes da conta bancária: " +
                "\nNumero da conta: " + usuario.getConta().getNumeroConta() +
                "\nNumero da agéncia: " + usuario.getConta().getNumeroAgencia() +
                "\nCódigo do Banco: " + usuario.getConta().getNumeroBanco() +
                "\nNome do banco: " + usuario.getConta().getNomeBanco());
        System.out.println("\nMinhas sacolas: \nId: " + usuario.getSacolas().get(0).getId() +
                "\nReutilizada " + usuario.getSacolas().get(0).getQntReutilizacao() + " vezes" +
                "\nId: " + usuario.getSacolas().get(1).getId() +
                "\nReutilizada " + usuario.getSacolas().get(1).getQntReutilizacao() + " vezes" +
                "\nTotal de reutilizações: " + usuario.getSacolas().get(0).totalReutilizacoes(usuario.getSacolas()));
        System.out.println("\nMinhas medalhas: " + usuario.listarMedalhas(medalha.totalMedalhas(sacola.totalReutilizacoes(sacolas))));
        System.out.println("\nMeus escaneamentos: " + usuario.getSacolas().get(0).getNotaFiscal() + usuario.getSacolas().get(1).getNotaFiscal());
    }
}
