package org.application;

public class Alimentacao implements Tributacao{
    double preco;

    public Alimentacao(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularImposto(double valorProduto) {
        return valorProduto * 0.01;
    }
}
