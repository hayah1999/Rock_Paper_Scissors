package org.com.RockPaperScissors.services;

import org.com.RockPaperScissors.dtos.Score;
import org.springframework.stereotype.Service;

@Service
public interface Game {
    public Score playGame();
}
