package org.example.domain.internetCafe;

import lombok.Getter;
import lombok.Setter;

public class Game {
    @Getter
    @Setter
    private int idGame;
    @Setter
    @Getter
    private String gameName;
    private GamePlatform gamePlatform;

    public enum GamePlatform {
        Console,
        PC,
        Both
    }

    // Constructor
    public Game(int idGame, String gameName, GamePlatform gamePlatform) {
        this.idGame = idGame;
        this.gameName = gameName;
        this.gamePlatform = gamePlatform;
    }

    @Override
    public String toString() {
        return "ConsoleGames{" +
                "idGame=" + idGame +
                ", gameName='" + gameName + '\'' +
                '}';
    }
}
