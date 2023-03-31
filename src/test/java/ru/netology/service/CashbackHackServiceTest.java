package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void ShowBonusFromPurchaseFor900() {

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual,expected);

    }

    @Test
    public void ShowBonusFromPurchaseForNull() {

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual,expected);

    }

    @Test
    public void ShowBonusFromPurchaseFor1000() {

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual,expected);

    }


}