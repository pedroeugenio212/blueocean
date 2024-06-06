package br.com.blueocean.entity;


public class Endereco
{
    private int id;
    private int cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;

    public int getId()
    {
        return id;
    }

    public Endereco setId(int id)
    {
        this.id = id;
        return this;
    }

    public int getCep()
    {
        return cep;
    }

    public Endereco setCep(int cep)
    {
        this.cep = cep;
        return this;
    }

    public String getLogradouro()
    {
        return logradouro;
    }

    public Endereco setLogradouro(String logradouro)
    {
        this.logradouro = logradouro;
        return this;
    }

    public String getBairro()
    {
        return bairro;
    }

    public Endereco setBairro(String bairro)
    {
        this.bairro = bairro;
        return this;
    }

    public String getCidade()
    {
        return cidade;
    }

    public Endereco setCidade(String cidade)
    {
        this.cidade = cidade;
        return this;
    }

    public String getEstado()
    {
        return estado;
    }

    public Endereco setEstado(String estado)
    {
        this.estado = estado;
        return this;
    }
    
    
    
}
