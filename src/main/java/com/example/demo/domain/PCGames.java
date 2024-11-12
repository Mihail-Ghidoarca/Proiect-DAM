package com.example.demo.domain;

public class PCGames implements Game {
    private int idGame;
    private String gameName;

    // Constructor
    public PCGames(int idGame, String gameName) {
        this.idGame = idGame;
        this.gameName = gameName;
    }

    // Implementarea metodelor din interfața Game
    @Override
    public int getIdGame() {
        return idGame;
    }

    @Override
    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    @Override
    public String getGameName() {
        return gameName;
    }

    @Override
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    // toString method
    @Override
    public String toString() {
        return "PCGames{" +
                "idGame=" + idGame +
                ", gameName='" + gameName + '\'' +
                '}';
    }
}

