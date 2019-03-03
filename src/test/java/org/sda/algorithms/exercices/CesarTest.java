package org.sda.algorithms.exercices;

import org.junit.jupiter.api.Test;
import org.sda.algorithms.exercises.CesarCrypt;

import static org.assertj.core.api.Assertions.assertThat;

public class CesarTest {

    @Test
    public void testCesarEncode(){

        CesarCrypt cesarCrypt = new CesarCrypt();

        String inputData = "ag";

        String result = cesarCrypt.encodeCesar(inputData, 4);
        assertThat(result).isEqualTo("ek");
    }


    @Test
    public void testCesarDecode(){

        CesarCrypt cesarCrypt = new CesarCrypt();

        String inputData = "ek";

        String result = cesarCrypt.decodeCesar(inputData, 4);
        assertThat(result).isEqualTo("ag");
    }
}
