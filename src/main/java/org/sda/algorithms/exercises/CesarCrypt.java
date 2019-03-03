package org.sda.algorithms.exercises;

public class CesarCrypt {

    private static final char CAPITAL_A = 'A';

    private static final char CAPITAL_Z = 'Z';

    private static final char SMALL_A = 'a';

    private static final char SMALL_Z = 'z';

    /**
     *
     * Podpowiedź:
     * char c = 'a';
     * byte cByte = (byte) c;
     */
    public String encodeCesar(String text, int step) {

        int alphabetLength = CAPITAL_Z - CAPITAL_A  + 1;
        char[] chars = text.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char c: chars){
            if(isLetter(c)){
                byte cByte = (byte) c;
                cByte += step;

                if (exceedRange(cByte)) {
                    cByte -= alphabetLength;
                }

                stringBuilder.append((char) cByte);
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public String decodeCesar(String text, int step) {

        int alphabetLength = CAPITAL_Z - CAPITAL_A  + 1;
        char[] chars = text.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char c: chars){
            if(isLetter(c)){
                byte cByte = (byte) c;
                cByte -= step;

                if (exceedRange(cByte)) {
                    cByte += alphabetLength;
                }

                stringBuilder.append((char) cByte);
            } else {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }

    private boolean isLetter(char c){
        return (64 < c && c < 91) || (96 < c && c < 123);
    }

    private boolean exceedRange(byte cByte){
        return !isLetter((char) cByte);
//        return 65 > cByte || (90 < cByte && cByte < 97) || cByte > 122;
    }
}
