package org.example.domain.internetCafe;

import java.time.LocalDateTime;

public class Reservation {
    private int idReservation;
    private int idUser;
    private LocalDateTime data;
    private int idDev;
    private int idGame;

    // Constructor
    public Reservation(int idReservation, int idUser, LocalDateTime data, int idDev, int idGame) {
        this.idReservation = idReservation;
        this.idUser = idUser;
        this.data = data;
        this.idDev = idDev;
        this.idGame = idGame;
    }

    // Getters and Setters
    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getIdDev() {
        return idDev;
    }

    public void setIdDev(int idDev) {
        this.idDev = idDev;
    }

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    // toString method
    @Override
    public String toString() {
        return "Reservation{" +
                "idReservation=" + idReservation +
                ", idUser=" + idUser +
                ", data=" + data +
                ", idDev=" + idDev +
                ", idGame=" + idGame +
                '}';
    }
}

