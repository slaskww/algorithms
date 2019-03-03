package org.sda.algorithms.exercices;

import org.junit.jupiter.api.Test;
import org.sda.algorithms.exercises.CesarCrypt;

import static org.assertj.core.api.Assertions.assertThat;

public class CesarTest {

    @Test
    public void testCesarEncode(){

        CesarCrypt cesarCrypt = new CesarCrypt();

        String inputData = "ag";
        String inputData2 = "xyz";

        String result = cesarCrypt.encodeCesar(inputData, 4);
        assertThat(result).isEqualTo("ek");

        result = cesarCrypt.encodeCesar(inputData2, 3);
        assertThat(result).isEqualTo("abc");

        result = cesarCrypt.encodeCesar(inputData, -4);
        assertThat(result).isEqualTo("wc");
    }


    @Test
    public void testCesarDecode(){

        CesarCrypt cesarCrypt = new CesarCrypt();

        String inputData = "ek";
        String inputData2 = "abc";


        String result = cesarCrypt.decodeCesar(inputData, 4);
        assertThat(result).isEqualTo("ag");

        result = cesarCrypt.decodeCesar(inputData2, 3);
        assertThat(result).isEqualTo("xyz");
    }
}
