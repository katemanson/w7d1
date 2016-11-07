package com.example.user.dartsranking;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

import dalvik.annotation.TestTargetClass;

/**
 * Created by user on 07/11/2016.
 */

public class RankingTest {

    Ranking list;

    @Before
    public void before() {
        list = new Ranking();
    }

    @Test
    public void testGetRankingList() {
        ArrayList<Player> rankingList = list.getRankingList();
        assertEquals(10, rankingList.size());
    }

    @Test
    public void testGetPlayerRanked() {
        assertEquals("Anastasia Dobromyslova", list.getPlayerRanked(3).getName());
    }

    @Test
    public void testReplacePlayer_WithNew() {
        list.replacePlayer("Amanda", "Alliterative", 1);
        assertEquals("Amanda", list.getPlayerRanked(1).getName());
    }

    @Test
    public void testReplacePlayerAtTen() {
        assertEquals("Trina Gulliver", list.getPlayerRanked(10).getName());
        list.replacePlayerAtTen("Trisha", "Typhoon");
        assertEquals("Trisha", list.getPlayerRanked(10).getName());
    }

    @Test
    public void testGetPlayerByName() {
        assertEquals(list.getPlayerRanked(7), list.getPlayerByName("Rachel Brooks"));
    }

    @Test
    public void testMoveOneRankingPlace_Up() {
        try {
            list.moveOneRankingPlace(8, "up");
        }
        catch (RankException rankEx) {
            rankEx.printStackTrace();
            System.out.println("Exception Message:");
            System.out.println(rankEx.getMessage());
        }
        catch (StringException stringEx) {
            stringEx.printStackTrace();
            System.out.println("Exception Message:");
            System.out.println(stringEx.getMessage());
        }
        assertEquals("Rachel Brooks", list.getPlayerRanked(8).getName());
        assertEquals(8, list.getPlayerRanked(8).getCurrentRanking());
        assertEquals("Lorraine Winstanley", list.getPlayerRanked(7).getName());
        assertEquals(7, list.getPlayerRanked(7).getCurrentRanking());
    }

    @Test
    public void testMoveOneRankingPlace_Down() {
        try {
            list.moveOneRankingPlace(6, "down");
        }
        catch (RankException rankEx) {
            rankEx.printStackTrace();
            System.out.println("Exception Message:");
            System.out.println(rankEx.getMessage());
        }
        catch (StringException stringEx) {
            stringEx.printStackTrace();
            System.out.println("Exception Message:");
            System.out.println(stringEx.getMessage());
        }
        assertEquals("Rachel Brooks", list.getPlayerRanked(6).getName());
        assertEquals(6, list.getPlayerRanked(6).getCurrentRanking());
        assertEquals("Fallon Sherrock", list.getPlayerRanked(7).getName());
        assertEquals(7, list.getPlayerRanked(7).getCurrentRanking());
    }

    @Test
    public void testReplacePlayer_WithExisting() {
        Player player = new Player("Amanda", "Alliterative", 1);
        list.replacePlayer(player);
        assertEquals("Amanda", list.getPlayerRanked(1).getName());
    }

}
