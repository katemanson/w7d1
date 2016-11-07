package com.example.user.dartsranking;
import org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 07/11/2016.
 */

public class RankingTest {

    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;
    Player player6;
    Player player7;
    Player player8;
    Player player9;
    Player player10;

    @Before
    public void before() {
        player1 = new Player("Aileen de Graaf", "Awesome", 1);
        player2 = new Player("Deta Hedman", "Deadly", 2);
        player3 = new Player("Anastasia Dobromyslova", "Amazing", 3);
        player4 = new Player("Sharon Prins", "Sureshot", 4);
        player5 = new Player("Lisa Ashton", "Lethal", 5);
        player6 = new Player("Fallon Sherrock", "Fatal", 6);
        player7 = new Player("Rachel Brooks", "Relentless", 7);
        player8 = new Player("Lorraine Winstanley", "Really Very Good", 8);
        player9 = new Player("Corrine Hammond", "Somewhat Overrated", 9);
        player10 = new Player("Trina Gulliver", "Totally", 10);
    }

    
}
