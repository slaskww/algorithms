package org.sda.algorithms.exercices;

import org.junit.jupiter.api.Test;
import org.sda.algorithms.exercises.CesarCrypt;

import static org.assertj.core.api.Assertions.assertThat;

public class CesarTest {

    @Test
    public void testCesarEncode(){

        CesarCrypt cesarCrypt = new CesarCrypt();

        String inputData = "abcxyz ABCXYZ";

        String result = cesarCrypt.encodeCesar(inputData, 4);
        assertThat(result).isEqualTo("efgbcd EFGBCD");

        result = cesarCrypt.encodeCesar(inputData, 31);
        assertThat(result).isEqualTo("fghcde FGHCDE");

        result = cesarCrypt.encodeCesar(inputData, -4);
        assertThat(result).isEqualTo("wxytuv WXYTUV");

        result = cesarCrypt.encodeCesar(inputData, -31);
        assertThat(result).isEqualTo("vwxstu VWXSTU");
    }


    @Test
    public void testCesarDecode(){

        CesarCrypt cesarCrypt = new CesarCrypt();

        String inputData = "abcxyz ABCXYZ";

        String result = cesarCrypt.decodeCesar(inputData, 4);
        assertThat(result).isEqualTo("wxytuv WXYTUV");

        result = cesarCrypt.decodeCesar(inputData, 31);
        assertThat(result).isEqualTo("vwxstu VWXSTU");

        result = cesarCrypt.decodeCesar(inputData, -4);
        assertThat(result).isEqualTo("efgbcd EFGBCD");

        result = cesarCrypt.decodeCesar(inputData, -31);
        assertThat(result).isEqualTo("fghcde FGHCDE");
    }
}
