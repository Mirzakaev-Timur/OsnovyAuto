package ru.netology.service;


import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {


    @org.testng.annotations.Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldReturn999IfAmountIs1001() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldReturn1IfAmountIs999() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }
}