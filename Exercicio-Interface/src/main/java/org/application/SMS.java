package org.application;

public class SMS implements Marketing{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem + " \n -enviada SMS");

    }
}
