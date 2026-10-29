package org.application;

public class Vestuario implements Tributacao{

    double preco;

    public Vestuario(double preco) {
        this.preco = preco;
    }
    @Override
    public double calcularImposto(double valorProduto) {
        return valorProduto * 0.025;
    }
}
