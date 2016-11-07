package com.example.user.dartsranking;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 07/11/2016.
 */

public class Ranking {

    protected ArrayList<Player> mRankingList;

    public Ranking() {
        mRankingList = new ArrayList<Player>();
        setUpRankingList();
    }

    private void setUpRankingList() {
        Collections.addAll(mRankingList,
            new Player("Aileen de Graaf", "Awesome", 1),
            new Player("Deta Hedman", "Deadly", 2),
            new Player("Anastasia Dobromyslova", "Amazing", 3),
            new Player("Sharon Prins", "Sureshot", 4),
            new Player("Lisa Ashton", "Lethal", 5),
            new Player("Fallon Sherrock", "Fatal", 6),
            new Player("Rachel Brooks", "Really Pretty Good* *For A Girl", 7),
            new Player("Lorraine Winstanley", "Quiche", 8),
            new Player("Corrine Hammond", "Kinda Overrated", 9),
            new Player("Trina Gulliver", "Totally", 10)
            );
    }

    public ArrayList<Player> getRankingList() {
        ArrayList<Player> list = new ArrayList<Player>(mRankingList);
        return list;
    }

    public void replacePlayer(String name, String nickname, int currentRanking) {
        Player player = new Player(name, nickname, currentRanking);
        mRankingList.set(currentRanking - 1, player);
    }

    public void replacePlayer(Player player) {
        int currentRanking = player.getCurrentRanking();
        mRankingList.set(currentRanking - 1, player);
    }

    public Player getPlayerRanked(int currentRanking) {
        Player player = mRankingList.get(currentRanking - 1);
        return player;
    }

    public void replacePlayerAtTen(String name, String nickname) {
        replacePlayer(name, nickname, 10);
    }

    public Player getPlayerByName(String name) {
        for (Player player : mRankingList) {
            if (player.getName() == name) {
                return player;
            }
        }
        return null;
    }

    public void moveOneRankingPlace(int fromRanking, String upOrDown) throws RankException, StringException {
        if (fromRanking == 10 && upOrDown.equals("down")) {
            throw new RankException("Can't move player ranked 10 down without a replacement.");
        }
        else if (upOrDown.equals("up")) {
            Player playerUp = getPlayerRanked(fromRanking);
            Player playerDown = getPlayerRanked(fromRanking - 1);
            playerUp.setCurrentRanking(fromRanking - 1);
            playerDown.setCurrentRanking(fromRanking);
            replacePlayer(playerUp);
            replacePlayer(playerDown);
        }
        else if (upOrDown.equals("down")) {
            Player playerDown = getPlayerRanked(fromRanking);
            Player playerUp = getPlayerRanked(fromRanking + 1);
            playerDown.setCurrentRanking(fromRanking + 1);
            playerUp.setCurrentRanking(fromRanking);
            replacePlayer(playerDown);
            replacePlayer(playerUp);
        }
        else {
            throw new StringException("Invalid string. Needs to be 'up' or 'down'.");
        }
    }

}
