package org.application;

public class RedesSociais implements Marketing{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem + " \n -enviada por Redes Sociais");

    }
}
