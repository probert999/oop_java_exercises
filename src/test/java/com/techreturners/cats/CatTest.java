package com.techreturners.cats;

import org.junit.Test;
import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        Animal domesticCat = new DomesticCat();
        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        Animal domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        assertTrue("Cat should be snoozing", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakep() {
        Animal domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        Animal domesticCat = new DomesticCat();
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkLionSetting() {
        Animal lionCat = new LionCat();
        assertEquals("wild", lionCat.getSetting());
    }

    @Test
    public void checkCheetahSetting() {
        Animal cheetahCat = new CheetahCat();
        assertEquals("wild", cheetahCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        Animal domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        Animal lionCat = new LionCat();
        assertEquals(1100, lionCat.getAverageHeight());
    }

    @Test
    public void checkCheetahHeight() {
        Animal cheetahCat = new CheetahCat();
        assertEquals(900, cheetahCat.getAverageHeight());
    }


    @Test
    public void feedTheLion() {
        Animal lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        Animal cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        Animal domesticCat = new DomesticCat();
        String catEats = domesticCat.eat();

        assertTrue(catEats.equals("Purrrrrrr") || catEats.equals("Purrrrrrr. It will do I suppose."));
    }
}
