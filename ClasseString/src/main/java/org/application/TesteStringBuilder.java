package org.application;

import java.time.Duration;
import java.time.OffsetDateTime;

public class TesteStringBuilder {
    public void iniciar(){

        var stringStart = OffsetDateTime.now();
        String stringConcat = "";
        for(int i = 0; i < 1_000_000; i++){
            stringConcat += i;
        }
        var stringEnd = OffsetDateTime.now();
        System.out.printf("String: %s \n", Duration.between(stringStart, stringEnd).toSeconds());

        var builderStart = OffsetDateTime.now();
        StringBuilder builderConcat = new StringBuilder();
        for(int i = 0; i < 1_000_000; i++){
            builderConcat.append(i);
        }
        var builderEnd = OffsetDateTime.now();

        System.out.printf("StringBuilder singlethread: %s \n", Duration.between(builderStart, builderEnd).toSeconds());

        var bufferStart = OffsetDateTime.now();
        StringBuffer bufferConcat = new StringBuffer();
        for(int i = 0; i < 1_000_000; i++){
            bufferConcat.append(i);
        }
        var bufferEnd = OffsetDateTime.now();
        System.out.printf("StringBuffer multithread: %s \n", Duration.between(bufferStart, bufferEnd).toSeconds());
    }

}
