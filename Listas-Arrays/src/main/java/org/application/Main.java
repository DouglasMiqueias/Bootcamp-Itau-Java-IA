package org.application;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List teste = new ArrayList();
        teste.add("a");
        teste.add(1);
        teste.add(true);

        System.out.println(teste);

        int[] codes = new int[2];
        codes[0] = 1;
        codes[1] = 123;

        System.out.println(codes[0]);
        System.out.println(codes[1]);


        int [] codes2 = {1,2};
        System.out.println(codes2[0]);
        System.out.println(codes2[1]);


        System.out.println("=== ARRAYLIST ===");
        List<User> users = new ArrayList<>();
        var user = new User(1, "Jão");
        users.add(user);

        users.add(new User(2, "Maria"));
        users.add(new User(3, "Jose"));

        System.out.println(users.contains(user));
        System.out.println(users.size());
        System.out.println(users.isEmpty());
        System.out.println(users.getFirst());
        System.out.println(users.getLast());
        System.out.println(users.size() - 1);

        System.out.println("== IMPRIMINDO ==");
        System.out.println(users);

        System.out.println("=== TO STRING ===");
        System.out.println(users.toString());

        System.out.println("=== TESTE PERFORMANCE ===");
        TestePerformanceListas.testePerformance();
    }
}