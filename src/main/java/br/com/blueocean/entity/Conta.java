package br.com.blueocean.entity;


public class Conta
{
    private int id;
    private int numeroConta;
    private int numeroAgencia;
    private int numeroBanco;
    private String nomeBanco;
    
    public Conta(){}

    public Conta(int id, int numeroConta, int numeroAgencia, int numeroBanco, String nomeBanco)
    {
        this.id = id;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.numeroBanco = numeroBanco;
        this.nomeBanco = nomeBanco;
    }
    
    public int getId()
    {
        return id;
    }

    public Conta setId(int id)
    {
        this.id = id;
        return this;
    }

    public int getNumeroConta()
    {
        return numeroConta;
    }

    public Conta setNumeroConta(int numeroConta)
    {
        this.numeroConta = numeroConta;
        return this;
    }

    public int getNumeroAgencia()
    {
        return numeroAgencia;
    }

    public Conta setNumeroAgencia(int numeroAgencia)
    {
        this.numeroAgencia = numeroAgencia;
        return this;
    }

    public int getNumeroBanco()
    {
        return numeroBanco;
    }

    public Conta setNumeroBanco(int numeroBanco)
    {
        this.numeroBanco = numeroBanco;
        return this;
    }

    public String getNomeBanco()
    {
        return nomeBanco;
    }

    public Conta setNomeBanco(String nomeBanco)
    {
        this.nomeBanco = nomeBanco;
        return this;
    }
    
    
}
