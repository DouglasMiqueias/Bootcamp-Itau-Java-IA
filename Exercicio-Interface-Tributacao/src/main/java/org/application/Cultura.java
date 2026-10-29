package org.application;

public class Cultura implements Tributacao{

    double preco;

    public Cultura(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularImposto(double valorProduto) {
        return valorProduto * 0.04;
    }
}
