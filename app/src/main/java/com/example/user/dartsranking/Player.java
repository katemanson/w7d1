package com.example.user.dartsranking;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    private String name;
    private String nickname;
    private int currentRanking;

    public Player(String name, String nickname, int currentRanking) {
        this.name = name;
        this.nickname = nickname;
        this.currentRanking = currentRanking;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getCurrentRanking() {
        return this.currentRanking;
    }

    public void setCurrentRanking(int updatedRanking) {
        this.currentRanking = updatedRanking;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Nickname: " + this.nickname + ", Ranking: " + this.currentRanking;
    }
}
