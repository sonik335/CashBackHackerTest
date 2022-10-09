package ru.netology.service;


import org.testng.Assert;
import org.testng.annotations.Test;


public class CashBackHackServiceTest {

    @Test
    public void testRemain() {

        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 1000;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void testRemainLess() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainEquals() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}
