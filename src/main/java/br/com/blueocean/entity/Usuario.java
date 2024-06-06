package br.com.blueocean.entity;

import java.util.ArrayList;
import java.util.List;


public class Usuario
{
    private int cpf;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private Endereco endereco;
    private Conta conta;
    private List<Sacola> sacolas;
    private List<Parceiro> parceirosFavoritos;
    
    public int getCpf()
    {
        return cpf;
    }

    public Usuario setCpf(int cpf)
    {
        this.cpf = cpf;
        return this;
    }

    public String getNome()
    {
        return nome;
    }

    public Usuario setNome(String nome)
    {
        this.nome = nome;
        return this;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public Usuario setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
        return this;
    }

    public String getEmail()
    {
        return email;
    }

    public Usuario setEmail(String email)
    {
        this.email = email;
        return this;
    }

    public String getSenha()
    {
        return senha;
    }

    public Usuario setSenha(String senha)
    {
        this.senha = senha;
        return this;
    }

    public Endereco getEndereco()
    {
        if (endereco == null)
			endereco = new Endereco();
        return endereco;
    }

    public Usuario setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
        return this;
    }

    public Conta getConta()
    {
        if (conta == null)
			conta = new Conta();
        return conta;
    }

    public Usuario setConta(Conta conta)
    {
        this.conta = conta;
        return this;
    }

    public List<Sacola> getSacolas()
    {
        if (sacolas == null)
			sacolas = new ArrayList<>();
        return sacolas;
    }

    public Usuario setSacolas(List<Sacola> sacolas)
    {
        this.sacolas = sacolas;
        return this;
    }

    public List<Parceiro> getParceiros()
    {
        if (parceirosFavoritos == null)
			parceirosFavoritos = new ArrayList<>();
        return parceirosFavoritos;
    }

    public Usuario setParceiros(List<Parceiro> parceirosFavoritos)
    {
        this.parceirosFavoritos = parceirosFavoritos;
        return this;
    }
    
    public String listarMedalhas(List<Medalha> medalhas)
    {
        String listaMedalha = "";
        for(Medalha medalha : medalhas)
        {
            listaMedalha += "(" + medalha.getTipo() + ")";
        }
        return listaMedalha;
    }
}
