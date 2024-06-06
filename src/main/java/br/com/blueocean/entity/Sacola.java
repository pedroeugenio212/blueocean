package br.com.blueocean.entity;

import java.util.ArrayList;
import java.util.List;


public class Sacola
{
    private int id;
    private int qntReutilizacao;
    private Usuario usuario;
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

    public Usuario getUsuario()
    {
        if(usuario == null)
            usuario = new Usuario();
        return usuario;
    }

    public Sacola setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
        return this;
    }

    public List<NotaFiscal> getNotaFiscal()
    {
        if(notasFiscais == null)
            notasFiscais = new ArrayList<>();
        return notasFiscais;
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
