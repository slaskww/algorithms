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

        if (step > 31 || step <  -31) {

            throw new IndexOutOfBoundsException("Step is out of range. Use step between <-31, 31>");

        }

        char[] textArray;
        textArray = text.toCharArray();
        StringBuilder encText = new StringBuilder();


        for (int i = 0; i < textArray.length; i++) {

            byte cByte = (byte) textArray[i];
            byte bstep = (byte) (cByte + step); //position after translation

            /*if (step < 0){

               // return decodeCesar(text, -step);
                step+=25;
            }*/

            byte translationRange = step < 0 ? ALPHABET_SIZE : -ALPHABET_SIZE;

            if (isLetter(textArray[i])) {

                if (exceedRange(cByte, bstep)) {

                    cByte += translationRange + step;

                    if (exceedRange((byte) textArray[i], cByte)) {

                        encText.append((char) (cByte + translationRange));

                    } else

                        encText.append((char) cByte);

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

        if (step > 31 || step <  -31) {

            System.out.println("Step is out of range. Use step between <-31, 31>");
            throw new IndexOutOfBoundsException();

        }

        char[] textArray;
        textArray = text.toCharArray();
        StringBuilder encText = new StringBuilder();

        byte translationRange = (step < 0) ? -ALPHABET_SIZE : ALPHABET_SIZE;

        for (int i = 0; i < textArray.length; i++) {

            byte cByte = (byte) textArray[i];
            byte bstep = (byte) (cByte - step);

            if (isLetter(textArray[i])) {

                if (exceedRange(cByte, bstep)) {

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

            return (position < 65 || position > 90);
        }

        if ((cByte >= SMALL_A) && (cByte <= SMALL_Z)) {

            return (position < 97 || position > 122);
        }

        return true;


        //  return((cByte > 87) && (cByte < 91) || (cByte > 119) );
        //return !(((cByte > 64) && (cByte < 91) || (cByte > 96) && (cByte < 123)));
        // return !isLetter((char) cByte);

    }


}
