package com.example.myapplication

import org.junit.Assert
import org.junit.Test

class GameTest {
    @Test
    fun testPickRandomOption() {
        val options = listOf("ROCK", "SCISSOR", "PAPPER")
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
    }

    @Test
    fun testPickDrawable() {
        Assert.assertEquals(R.drawable.stone, Game.pickDrawable("ROCK"))
        Assert.assertEquals(R.drawable.scissor, Game.pickDrawable("SCISSOR"))
        Assert.assertEquals(R.drawable.papper, Game.pickDrawable("PAPPER"))
    }

    @Test
    fun testIsDraw() {
        Assert.assertTrue(Game.isDraw("ROCK", "ROCK"))
        Assert.assertTrue(Game.isDraw("SCISSOR", "SCISSOR"))
        Assert.assertTrue(Game.isDraw("PAPPER", "PAPPER"))
        Assert.assertFalse(Game.isDraw("ROCK", "SCISSOR"))
        Assert.assertFalse(Game.isDraw("ROCK", "PAPPER"))
        Assert.assertFalse(Game.isDraw("SCISSOR", "ROCK"))
        Assert.assertFalse(Game.isDraw("SCISSOR", "PAPPER"))
    }

    @Test
    fun testIsWin() {
        Assert.assertTrue(Game.isWin("ROCK", "SCISSOR"))
        Assert.assertTrue(Game.isWin("SCISSOR", "PAPPER"))
        Assert.assertTrue(Game.isWin("PAPPER", "ROCK"))

        Assert.assertFalse(Game.isWin("SCISSOR", "ROCK"))
        Assert.assertFalse(Game.isWin("PAPPER", "SCISSOR"))
        Assert.assertFalse(Game.isWin("ROCK", "PAPPER"))
    }
}