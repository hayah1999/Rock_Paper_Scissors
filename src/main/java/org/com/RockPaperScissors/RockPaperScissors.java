package org.com.RockPaperScissors;

import org.com.RockPaperScissors.servicesImp.GameImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RockPaperScissors {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(RockPaperScissors.class, args);
        GameImp gameImp = applicationContext.getBean(GameImp.class);
        gameImp.playGame();
    }
}