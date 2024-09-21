package org.com.RockPaperScissors.dtos;

import lombok.Data;

import java.util.List;
@Data
public class Score {
    Integer playerAWins = 0;
    Integer playerBWins = 0;
    Integer draws = 0;
}
