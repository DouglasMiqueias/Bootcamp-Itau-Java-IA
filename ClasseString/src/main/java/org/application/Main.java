package org.application;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var value = "java;java;java";

        System.out.println("=== REPLACE ===");
        value = value.replace("j", "J");
        System.out.println(value);

        System.out.println("=== SPLIT ===");
        var values = value.split(";");

        for(var v : values){
            System.out.println(v);
        }

        System.out.println("=== UPPER E LOWERC===");
        var dados = "Douglas;32;Administrador";

        System.out.println(dados.toUpperCase());
        System.out.println(dados.toLowerCase());

        System.out.println("=== SUBSTRING ===");
        var substring = "/*****java*****/";
        System.out.println(substring.substring(5,11));

        System.out.println("=== EXEMPLO JSON ===");
        var json = """
                {"name": "João","age" : 18}
                """;

        Map<String, String> map= new HashMap<>();
        json = json.replace("{", "").replace("}", "").replace("\"", "");

        var jsonArr = json.split(",");

        System.out.println(map);

        for(var v : jsonArr){
            var keyValue = v.split(":");
            map.put(keyValue[0], keyValue[1]);
        }

        System.out.println("=== Stringbuilder and StringBuffer ===");
        TesteStringBuilder teste = new TesteStringBuilder();
        teste.iniciar();

    }
}