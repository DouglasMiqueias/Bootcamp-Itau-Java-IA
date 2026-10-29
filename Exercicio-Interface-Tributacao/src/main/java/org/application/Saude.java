package org.application;

public class Saude implements Tributacao{
    double preco;

    public Saude(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularImposto(double valorProduto) {
        return valorProduto * 0.015;
    }
}
