package org.application;

public class Email implements Marketing{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem + " \n -enviada pelo E-mail");

    }
}
