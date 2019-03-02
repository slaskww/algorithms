package org.sda.algorithms.exercises;

public class CesarCrypt {

    private static final char CAPITAL_A = 'A';

    private static final char CAPITAL_Z = 'Z';

    private static final char SMALL_A = 'a';

    private static final char SMALL_Z = 'z';

    /**
     *
     * Podpowiedź:
     *
     * byte cByte = (byte) c;
     */
    public String encodeCesar(String text, int step) {
        return text;
    }

    public String decodeCesar(String text, int step) {
        return text;
    }

    private boolean isLetter(char c){

        return ((c >= CAPITAL_A) && (c <= CAPITAL_Z) || (c >= SMALL_A) && (c <= SMALL_Z) );
    }

    private boolean exceedRange(byte cByte){

        return((cByte > 87) && (cByte < 91) || (cByte > 119) );

    }


}
