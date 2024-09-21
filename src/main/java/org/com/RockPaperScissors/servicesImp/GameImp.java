package org.com.RockPaperScissors.servicesImp;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.com.RockPaperScissors.dtos.Player;
import org.com.RockPaperScissors.dtos.Score;
import org.com.RockPaperScissors.enums.Choices;
import org.com.RockPaperScissors.services.Game;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameImp implements Game {

    @Override
    public Score playGame () {
        Score score = new Score();
        Player player1 = new Player();
        player1.setChoice(Choices.ROCK);
        Player player2 = new Player();

        for (int i = 0; i < 100; i++){
            Choices choice = Choices.randomChoice();
            System.out.println(choice);
            player2.setChoice(choice);
            if(player1.getChoice().equals(player2.getChoice())){
                score.setDraws(score.getDraws()+1);
            }else {
                if("SCISSORS".equals(String.valueOf(player2.getChoice()))){
                    score.setPlayerAWins(score.getPlayerAWins()+1);
                } else if ("PAPER".equals(String.valueOf(player2.getChoice()))) {
                    score.setPlayerBWins(score.getPlayerBWins()+1);
                }
            }
        }
        System.out.println("Player A wins " + score.getPlayerAWins() + " of 100 games");
        System.out.println("Player B wins " + score.getPlayerBWins() + " of 100 games");
        System.out.println("Draws: " + score.getDraws() + " of 100 games");
        return score;
    }


}
