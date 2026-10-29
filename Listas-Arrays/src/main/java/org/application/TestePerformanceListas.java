package org.application;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestePerformanceListas {
    public static void testePerformance(){

        var arrayStart = OffsetDateTime.now();
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100_000_000; i++) {
            arrayList.add(i);
        }
        System.out.println(Duration.between(arrayStart, OffsetDateTime.now()).toSeconds());


        var vectorStart = OffsetDateTime.now();
        List<Integer> vector = new Vector<>();
        for (int i = 0; i < 100_000_00; i++) {
            vector.add(i);
        }
        System.out.println(Duration.between(arrayStart, OffsetDateTime.now()).toSeconds());
    }
}
