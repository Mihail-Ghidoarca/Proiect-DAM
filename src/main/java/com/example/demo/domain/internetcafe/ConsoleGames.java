package com.example.demo.domain.internetcafe;

public class ConsoleGames implements Game {
    private int idGame;
    private String gameName;
    private int nrBucati;

    // Constructor
    public ConsoleGames(int idGame, String gameName, int nrBucati) {
        this.idGame = idGame;
        this.gameName = gameName;
        this.nrBucati = nrBucati;
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

    // Getter și Setter pentru nrBucati
    public int getNrBucati() {
        return nrBucati;
    }

    public void setNrBucati(int nrBucati) {
        this.nrBucati = nrBucati;
    }

    // toString method
    @Override
    public String toString() {
        return "ConsoleGames{" +
                "idGame=" + idGame +
                ", gameName='" + gameName + '\'' +
                ", nrBucati=" + nrBucati +
                '}';
    }
}

