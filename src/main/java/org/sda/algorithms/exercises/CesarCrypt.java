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


        char[] textArray  =  new char[]{};
        textArray =  text.toCharArray();
        StringBuilder encText = new StringBuilder();

        for (int i = 0; i < textArray.length ; i++) {

            byte cByte = (byte) textArray[i];
            byte bstep = (byte) (cByte + step);

            /*if (step < 0){

               // return decodeCesar(text, -step);
                step+=25;
            }*/

            if (isLetter(textArray[i])){

                if (exceedRange(bstep)){

                    if (step  < 0){

                        byte ii = (byte) (26 + step);
                        cByte += ii;
                        encText.append((char)cByte);
                    } else{

                        byte ii = (byte) (3 - step);
                        cByte -= 23+ii;
                        encText.append((char)cByte);
                    }


                } else {

                    cByte += step;
                    encText.append((char)cByte);
                }
            } else {

                encText.append(textArray[i]);
            }

        }

        return encText.toString();
    }

    public String decodeCesar(String text, int step) {

        char[] textArray  =  new char[]{};
        textArray =  text.toCharArray();
        StringBuilder encText = new StringBuilder();

        /*if (step < 0){

           // return encodeCesar(text, -step);

        }*/

        for (int i = 0; i < textArray.length ; i++) {

            byte cByte = (byte) textArray[i];
            byte bstep = (byte) (cByte - step);

            if (isLetter(textArray[i])){

                if (exceedRange(bstep)){

                    byte ii = (byte) (24 - step);
                    cByte += ii;
                    encText.append((char)cByte);
                } else{

                    cByte -= step;
                    encText.append((char)cByte);
                }

            } else {

                encText.append(textArray[i]);
            }


        }

        return encText.toString();

    }

    private boolean isLetter(char c){

        return ((c >= CAPITAL_A) && (c <= CAPITAL_Z) || (c >= SMALL_A) && (c <= SMALL_Z) );
    }

    private boolean exceedRange(byte cByte){

      //  return((cByte > 87) && (cByte < 91) || (cByte > 119) );
        //return !(((cByte > 64) && (cByte < 91) || (cByte > 96) && (cByte < 123)));
        return !isLetter((char) cByte);

    }


}
