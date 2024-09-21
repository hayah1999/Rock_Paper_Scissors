package org.com.RockPaperScissors.enums;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Random;


public enum Choices {
    ROCK,
    PAPER,
    SCISSORS;

    private static final Random random = new Random();
    public static Choices randomChoice (){
        Choices[] choices = values();
        return choices[random.nextInt(choices.length)];
    }
}
