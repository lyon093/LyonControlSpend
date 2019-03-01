package com.example.lyoncontrolspend.Gasto;

import android.widget.EditText;

public class Gasto {
    private long idGasto;
    private String data;
    private String descricao;
    private String categoria;
    private double valor;

    public Gasto(String data, String descricao, String categoria, double valor) {
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor = valor;
    }

    public Gasto(long idGasto, String data, String descricao, String categoria, double valor) {
        this.idGasto = idGasto;
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor = valor;
    }

    public long getIdGasto() {
        return idGasto;
    }

    public String getData() {
        return data;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return gasto;
    }


}
