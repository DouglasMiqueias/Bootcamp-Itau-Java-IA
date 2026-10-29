package org.application;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int opcao;

    public void iniciar(){
        do{
            System.out.println("=== MENU === ");
            System.out.println("1. Enviar mensagem pelo E-mail");
            System.out.println("2. Enviar mensagem pelo Whatsapp");
            System.out.println("3. Enviar mensagem pelo SMS");
            System.out.println("4. Enviar mensagem pelas Redes Sociais");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1->{
                    Email email = new Email();
                    System.out.println("Qual a mensagem que você deseja enviar? ");
                    String mensagem = sc.nextLine();

                    email.enviarMensagem(mensagem);
                }
                case 2->{
                    WhatsApp whatsapp = new WhatsApp();
                    System.out.println("Qual a mensagem deseja enviar? ");
                    String mensagem = sc.nextLine();

                    whatsapp.enviarMensagem(mensagem);
                }
                case 3->{
                    SMS sms = new SMS();
                    System.out.println("Qual a mensagem deseja enviar? ");
                    String mensagem = sc.nextLine();

                    sms.enviarMensagem(mensagem);
                }
                case 4->{
                    RedesSociais redes = new RedesSociais();
                    System.out.println("Qual a mensagem deseja enviar? ");
                    String mensagem = sc.nextLine();

                    redes.enviarMensagem(mensagem);
                }
                case 5->{
                    System.out.println("Saindo do sistema...");
                }
                default -> System.out.println("Valor inválido, tente novamente!");
            }
        } while(opcao != 5);
    }
}
