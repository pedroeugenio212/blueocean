package br.com.blueocean.entity;

import java.util.ArrayList;
import java.util.List;

public class Medalha
{
    private int id;
    private String tipo;

    public int getId()
    {
        return id;
    }

    public Medalha setId(int id)
    {
        this.id = id;
        return this;
    }
    
    public String getTipo()
    {
        return tipo;
    }

    public Medalha setTipo(String tipo)
    {
        this.tipo = tipo;
        return this;
    }

    public List<Medalha> totalMedalhas(int totalReutilizacoes)
    {
        List<Medalha> medalhas = new ArrayList<>();
        if(totalReutilizacoes >= 25)
            medalhas.add(new Medalha().setTipo("Silver"));
        if((totalReutilizacoes >= 50))
            medalhas.add(new Medalha().setTipo("Gold"));
        if((totalReutilizacoes >= 100))
            medalhas.add(new Medalha().setTipo("Platinum"));
        return medalhas;
    }
    
}
