package com.ss.android.ugc.aweme.shoutouts;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "currency_character")
    private String currencyCharacter;
    @c(a = "currency_name")
    private String currencyName;
    @c(a = "money")
    private int money;
    @c(a = "money_str")
    private String moneyStr;

    static {
        Covode.recordClassIndex(87044);
    }

    public final String getCurrencyCharacter() {
        return this.currencyCharacter;
    }

    public final String getCurrencyName() {
        return this.currencyName;
    }

    public final int getMoney() {
        return this.money;
    }

    public final String getMoneyStr() {
        return this.moneyStr;
    }

    public final void setCurrencyCharacter(String str) {
        this.currencyCharacter = str;
    }

    public final void setCurrencyName(String str) {
        this.currencyName = str;
    }

    public final void setMoney(int i2) {
        this.money = i2;
    }

    public final void setMoneyStr(String str) {
        this.moneyStr = str;
    }
}
