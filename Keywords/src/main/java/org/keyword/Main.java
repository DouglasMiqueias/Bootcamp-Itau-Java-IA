package keyword;

import keyword.Client;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var user = new Client();
        user.setName("Jão");
        System.out.println(user.getName());

        var address = new Address();
    ;}
}