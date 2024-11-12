package org.example.domain.internetCafe;

public class Tournament {
    private int idTournament;
    private String tournamentName;

    // Constructor
    public Tournament(int idTournament, String tournamentName) {
        this.idTournament = idTournament;
        this.tournamentName = tournamentName;
    }

    // Getters and Setters
    public int getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(int idTournament) {
        this.idTournament = idTournament;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    // toString method
    @Override
    public String toString() {
        return "Tournament{" +
                "idTournament=" + idTournament +
                ", tournamentName='" + tournamentName + '\'' +
                '}';
    }
}
