package br.com.blueocean.entity;

import java.util.List;


public class Parceiro
{

    private String cnpj;
    private String nome;
    private String email;
    private float porcentagemCashback;
    private Endereco endereco;

    public String getCnpj()
    {
        return cnpj;
    }

    public Parceiro setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
        return this;
    }

    public String getNome()
    {
        return nome;
    }

    public Parceiro setNome(String nome)
    {
        this.nome = nome;
        return this;
    }

    public String getEmail()
    {
        return email;
    }

    public Parceiro setEmail(String email)
    {
        this.email = email;
        return this;
    }

    public float getPorcentagemCashback()
    {
        return porcentagemCashback;
    }

    public Parceiro setPorcentagemCashback(float porcentagemCashback)
    {
        this.porcentagemCashback = porcentagemCashback;
        return this;
    }

    public Endereco getEndereco()
    {
        if (endereco == null)
            endereco = new Endereco();
        return endereco;
    }

    public Parceiro setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
        return this;
    }

    public String listarParceiros(List<Parceiro> parceiros)
    {
        String listaParceiros = "";
        for (Parceiro parceiro : parceiros)
        {
            listaParceiros += "\n" + "Nome: " + parceiro.getNome() + "\n";
            listaParceiros += "Endereço: " + parceiro.getEndereco().getLogradouro() + " Bairro: " + parceiro.getEndereco().getBairro() + " Cidade: " + parceiro.getEndereco().getCidade() + "\n";
            listaParceiros += "Email de contato: " + parceiro.getEmail() + "\n";
            listaParceiros += "CNPJ: " + parceiro.getCnpj() + "\n";
        }
        return listaParceiros;
    }



}
