package com.example.user.dartsranking;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Freida", "Fearsome", 1);
    }

    @Test
    public void testGetName() {
        assertEquals("Freida", player.getName());
    }

    @Test
    public void testSetName() {
        player.setName("Felicia");
        assertEquals("Felicia", player.getName());
    }

    @Test
    public void testGetNickname() {
        assertEquals("Fearsome", player.getNickname());
    }

    @Test
    public void testSetNickname() {
        player.setNickname("Ferocious");
        assertEquals("Ferocious", player.getNickname());
    }

    @Test
    public void testGetRanking() {
        assertEquals(1, player.getCurrentRanking());
    }

    @Test
    public void testSetRanking() {
        player.setCurrentRanking(2);
        assertEquals(2, player.getCurrentRanking());
    }

    @Test
    public void testToString() {
        assertEquals("Name: Freida, Nickname: Fearsome, Ranking: 1", player.toString());
    }
}
