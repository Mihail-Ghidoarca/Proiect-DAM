package com.example.demo.domain;
import java.util.List;
public class Team {



        private int idTeam;
        private List<Integer> userIds;  // Lista de id-uri de utilizatori
        private String teamName;

        // Constructor
        public Team(int idTeam, List<Integer> userIds, String teamName) {
            this.idTeam = idTeam;
            this.userIds = userIds;
            this.teamName = teamName;
        }

        // Getters and Setters
        public int getIdTeam() {
            return idTeam;
        }

        public void setIdTeam(int idTeam) {
            this.idTeam = idTeam;
        }

        public List<Integer> getUserIds() {
            return userIds;
        }

        public void setUserIds(List<Integer> userIds) {
            this.userIds = userIds;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        // toString method
        @Override
        public String toString() {
            return "Team{" +
                    "idTeam=" + idTeam +
                    ", userIds=" + userIds +
                    ", teamName='" + teamName + '\'' +
                    '}';
        }
    }

