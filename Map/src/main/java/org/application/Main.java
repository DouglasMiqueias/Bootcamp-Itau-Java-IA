package org.application;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("joao@joao.com", new User(56, "joao"));
        users.put("maria@maria.com", new User(45, "Maria"));
        users.put("leo@leo.com", new User(22, "Leo"));
        users.put("juca@juca.com", new User(18, "Juca"));

        System.out.println("=================================");
        users.keySet().forEach(System.out::println);

        System.out.println("=================================");
        System.out.println(users.containsKey("maria@maria.com"));
        System.out.println("=================================");
        System.out.println(users.remove("juca@juca.com"));
        System.out.println("=================================");

        users.forEach((k,v)-> System.out.printf("key: %s | value: %s ", k, v));
    }
}