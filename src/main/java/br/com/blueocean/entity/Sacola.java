package br.com.blueocean.entity;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Sacola
{
    private int id;
    private int qntReutilizacao;
    private List<NotaFiscal> notasFiscais;
    
    public int getId()
    {
        return id;
    }

    public Sacola setId(int id)
    {
        this.id = id;
        return this;
    }

    public int getQntReutilizacao()
    {
        return qntReutilizacao;
    }

    public Sacola setQntReutilizacao(int qntReutilizacao)
    {
        this.qntReutilizacao = qntReutilizacao;
        return this;
    }

    public String getNotaFiscal()
    {
        DecimalFormat df = new DecimalFormat("#0.00");
        String todasAsNotasFiscais = "";
        if(notasFiscais == null)
            notasFiscais = new ArrayList<>();

        for (NotaFiscal notaFiscal : notasFiscais)
        {
            todasAsNotasFiscais += "\nId da nota fiscal: " + notaFiscal.getId() +
                    "\nSacola vinculada: " + getId() +
                    "\nData: " + notaFiscal.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                    "\nValor da compra: R$ " + String.format("%.2f", notaFiscal.getValorCompra()) +
                    "\nCashback recebido: R$ " + String.format("%.2f", notaFiscal.cashbackCompra(notaFiscal)) + "\n";
        }
        return todasAsNotasFiscais;
    }

    public Sacola setNotaFiscal(List<NotaFiscal> notasFiscais)
    {
        this.notasFiscais = notasFiscais;
        return this;
    }
    
    public int totalReutilizacoes(List<Sacola> sacolas)
    {
        int totalReutilizacoes = 0;
        for (Sacola sacola : sacolas)
        {
            totalReutilizacoes += sacola.getQntReutilizacao();
        }
        return totalReutilizacoes;
    }
    
    public int totalContribuicao(List<Sacola> sacolas)
    {
        int totalReutilizacoes = this.totalReutilizacoes(sacolas);
        return totalReutilizacoes * 7;
    }    
    
}
