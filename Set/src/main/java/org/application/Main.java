package org.application;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();

        users.add(new User(1, "Jão"));
        users.add(new User(2, "Maria"));
        users.add(new User(3, "Douglas"));
        users.add(new User(4, "Manu"));
        users.add(new User(5, "Jão"));


        System.out.println(new User(1, "Jão").hashCode());

        System.out.println(users.contains(new User(1, "Jão")));

        users.forEach(System.out::println);

        var iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("--- REMOVEIF ---");
        users.removeIf(u -> u.getId() == 2);
        users.forEach(System.out::println);
    }
}