package ru.netology;

import org.testng.Assert;

public class CashBackHackerTest {
    @org.testng.annotations.Test
    public void test() {
        CashbackHackService service = new CashbackHackService();
        int amount = 200;
        int expected = 800;

        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void test_2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);
    }

    @org.testng.annotations.Test
    public void test_3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;

        int actual = service.remain(amount);
        Assert.assertEquals(expected,actual);
    }
}
