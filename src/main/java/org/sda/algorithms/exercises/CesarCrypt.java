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
        StringBuilder encoded = new StringBuilder();
        final int alphabetLength = CAPITAL_Z - CAPITAL_A + 1; // number of letters in alphabet
        final int realStep = step % alphabetLength;
        for (char c : text.toCharArray()) {
            if (isLetter(c)) {
                byte cByte = (byte) c;
                cByte += realStep;
                if (exceedRange(cByte)) {
                    cByte -= alphabetLength;
                }
                encoded.append((char) cByte);
            }
            else {
                encoded.append(c);
            }
        }
        return encoded.toString();
    }

    public String decodeCesar(String text, int step) {
        return text;
    }

    private boolean isLetter(char c){
        return (c >= CAPITAL_A && c <= CAPITAL_Z) || (c >= SMALL_A && c <= SMALL_Z);
    }

    private boolean exceedRange(byte cByte){
        return (cByte < SMALL_A && cByte > CAPITAL_Z) || cByte > SMALL_Z;
    }
}
