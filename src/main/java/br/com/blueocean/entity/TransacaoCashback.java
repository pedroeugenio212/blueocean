package br.com.blueocean.entity;

import java.time.LocalDate;


public class TransacaoCashback
{
    private int id;
    private float valorTransacao;
    private LocalDate data;

    public int getId()
    {
        return id;
    }

    public TransacaoCashback setId(int id)
    {
        this.id = id;
        return this;
    }

    public float getValorTransacao()
    {
        return valorTransacao;
    }

    public TransacaoCashback setValorTransacao(float valorTransacao)
    {
        this.valorTransacao = valorTransacao;
        return this;
    }

    public LocalDate getData()
    {
        return data;
    }

    public TransacaoCashback setData(LocalDate data)
    {
        this.data = data;
        return this;
    }
    
    
}
