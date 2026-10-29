package org.application;

public class WhatsApp implements Marketing{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem + " \n -enviada pelo WhatsApp");
    }
}
