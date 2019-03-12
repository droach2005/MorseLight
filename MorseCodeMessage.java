package com.roach.a.deserie.morselight;

import com.roach.a.deserie.morselight.MorseCode;


/**
 * Created by Clarent on 3/11/2019.
 */

public class MorseCodeMessage {

    public void blinkLight(String message) {
        String[] letters = message.split("");
        for (String letter : letters) {
            String morse = MorseCode.Code.get(letter);
            blink(morse);
        }
    }

    public void blink(String letter) {
        String[] chars = letter.split("");
        for (String ch : chars) {
            String morse = MorseCode.Code.get(letter);


        }
    }

    public void displayMorseCode(String message){
        String morse = "";
        String[] letters = message.split("");
        for (String letter : letters){
            morse +=  (letter + " " + MorseCode.Code.get(letter)) + "\r\n";
        }
    }
}
