package com.example.demo.domain.internetcafe;

public class User {
    private int idUser;
    private String username;
    private String password;
    private String birthDate;
    private String email;
    private String phoneNumber;
    private boolean isLoggedIn;
    private Status status;

    public enum Status {
        ACTIVE,
        INACTIVE,
    }

    // Constructor
    public User(int idUser, String username, String password, String birthDate, String email, String phoneNumber, boolean isLoggedIn, Status status) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isLoggedIn = isLoggedIn;
        this.status = status;
    }

    // Getters and Setters
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // toString method
    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isLoggedIn=" + isLoggedIn +
                ", status=" + status +
                '}';
    }
}
