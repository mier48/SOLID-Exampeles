package com.example.solid_examples.srp;

import androidx.annotation.NonNull;

public class Player {

    int id;
    String name;
    int win;
    int lose;
    String date;

    public Player(int id, String name, int win, int lose, String date) {
        this.id = id;
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @NonNull
    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", win=" + win +
                ", lose=" + lose +
                ", date='" + date + '\'' +
                '}';
    }
}
