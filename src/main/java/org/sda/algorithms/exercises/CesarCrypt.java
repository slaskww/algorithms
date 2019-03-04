package org.sda.algorithms.exercises;

public class CesarCrypt {

    private static final char CAPITAL_A = 'A';

    private static final char CAPITAL_Z = 'Z';

    private static final char SMALL_A = 'a';

    private static final char SMALL_Z = 'z';

    public static final byte ALPHABET_SIZE = CAPITAL_Z - CAPITAL_A + 1;

    /**
     * Podpowiedź:
     * <p>
     * byte cByte = (byte) c;
     */
    public String encodeCesar(String text, int step) {

        if (step > 31 || step < -31) {
            throw new IndexOutOfBoundsException("Step is out of range. Use step between <-31, 31>");
        }

        char[] textArray;
        textArray = text.toCharArray();
        StringBuilder encText = new StringBuilder();
        byte translationRange = step < 0 ? ALPHABET_SIZE : -ALPHABET_SIZE;

        for (int i = 0; i < textArray.length; i++) {
            byte cByte = (byte) textArray[i];   //element of textArray[] as ASCII code
            byte moved = (byte) (cByte + step); //cByte after step

            if (isLetter(textArray[i])) {
                if (exceedRange(cByte, moved)) {
                    cByte += translationRange + step;

                    if (exceedRange((byte) textArray[i], cByte)) { //conditional statement is checked for step > 26 and step < -26
                        encText.append((char) (cByte + translationRange));
                    } else {
                        encText.append((char) cByte);
                    }
                } else {
                    cByte += step;
                    encText.append((char) cByte);
                }
            } else {
                encText.append(textArray[i]);
            }

        }

        return encText.toString();
    }

    public String decodeCesar(String text, int step) {
        if (step > 31 || step < -31) {

            System.out.println("Step is out of range. Use step between <-31, 31>");
            throw new IndexOutOfBoundsException();

        }

        char[] textArray;
        textArray = text.toCharArray();
        StringBuilder encText = new StringBuilder();

        byte translationRange = (step < 0) ? -ALPHABET_SIZE : ALPHABET_SIZE;

        for (int i = 0; i < textArray.length; i++) {
            byte cByte = (byte) textArray[i];   //element of textArray[] as ASCII code
            byte moved = (byte) (cByte - step); //cByte after step

            if (isLetter(textArray[i])) {
                if (exceedRange(cByte, moved)) {
                    cByte += translationRange - step;

                    if (exceedRange((byte) textArray[i], cByte)) { //conditional statement gives 'true' for step > 26 and step < -26
                        encText.append((char) (cByte + translationRange));
                    } else
                        encText.append((char) cByte);
                } else {
                    cByte -= step;
                    encText.append((char) cByte);
                }
            } else {
                encText.append(textArray[i]);
            }
        }
        return encText.toString();
    }

    private boolean isLetter(char c) {
        return ((c >= CAPITAL_A) && (c <= CAPITAL_Z) || (c >= SMALL_A) && (c <= SMALL_Z));
    }

    private boolean exceedRange(byte cByte, byte position) {
        if ((cByte >= CAPITAL_A) && (cByte <= CAPITAL_Z)) {
            return (position < CAPITAL_A || position > CAPITAL_Z);
        }

        if ((cByte >= SMALL_A) && (cByte <= SMALL_Z)) {
            return (position < SMALL_A || position > SMALL_Z);
        }
        return true;
    }
}
