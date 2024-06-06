package br.com.blueocean.entity;

import java.time.LocalDate;
import java.util.List;


public class NotaFiscal
{
    private int id;
    private Usuario usuario;
    private Sacola sacola;
    private Parceiro parceiro;
    private float valorCompra;
    private LocalDate data;
    private TransacaoCashback trasacaoCashback;

    public int getId()
    {
        return id;
    }

    public NotaFiscal setId(int id)
    {
        this.id = id;
        return this;
    }

    public Usuario getUsuario()
    {
        return usuario;
    }

    public NotaFiscal setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
        return this;
    }

    public Sacola getSacola()
    {
        return sacola;
    }

    public NotaFiscal setSacola(Sacola sacola)
    {
        this.sacola = sacola;
        return this;
    }

    public Parceiro getParceiro()
    {   
        if(parceiro == null)
            parceiro = new Parceiro();
        return parceiro;
    }

    public NotaFiscal setParceiro(Parceiro parceiro)
    {
        this.parceiro = parceiro;
        return this;
    }
    

    public float getValorCompra()
    {
        return valorCompra;
    }

    public NotaFiscal setValorCompra(float valorCompra)
    {
        this.valorCompra = valorCompra;
        return this;
    }

    public LocalDate getData()
    {
        return data;
    }

    public NotaFiscal setData(LocalDate data)
    {
        this.data = data;
        return this;
    }

    public TransacaoCashback getTrasacaoCashback()
    {
        return trasacaoCashback;
    }

    public NotaFiscal setTrasacaoCashback(TransacaoCashback trasacaoCashback)
    {
        this.trasacaoCashback = trasacaoCashback;
        return this;
    }
    
    public float cashbackCompra(NotaFiscal notaFiscal)
    {
        float cashback = notaFiscal.getValorCompra() * notaFiscal.getParceiro().getPorcentagemCashback() / 100.0f;
        return cashback;
    }
    
    public float totalCashback(List<NotaFiscal> notasFiscais)
    {
        float saldo = 0;
        for(NotaFiscal notaFiscal : notasFiscais)
        {
            float cashback = notaFiscal.cashbackCompra(notaFiscal);
            saldo += cashback;
        }
        return saldo;
    }
    
    
}
