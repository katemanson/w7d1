package com.example.user.dartsranking;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    private String mName;
    private String mNickname;
    private int mCurrentRanking;

    public Player(String name, String nickname, int currentRanking) {
        this.mName = name;
        this.mNickname = nickname;
        this.mCurrentRanking = currentRanking;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNickname() {
        return mNickname;
    }

    public void setNickname(String nickname) {
        mNickname = nickname;
    }

    public int getCurrentRanking() {
        return mCurrentRanking;
    }

    public void setCurrentRanking(int updatedRanking) {
        mCurrentRanking = updatedRanking;
    }

    @Override
    public String toString() {
        return "Name: " + mName + ", Nickname: " + mNickname + ", Ranking: " + mCurrentRanking;
    }
}
