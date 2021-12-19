package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class StandardMoney {
    @c(a = "currency_character")
    private final String currencyCharacter;
    @c(a = "currency_name")
    private final String currencyName;
    @c(a = "money")
    private final int money;
    @c(a = "money_str")
    private final String moneyStr;

    static {
        Covode.recordClassIndex(87112);
    }

    public static int com_ss_android_ugc_aweme_shoutouts_model_StandardMoney_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ StandardMoney copy$default(StandardMoney standardMoney, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = standardMoney.money;
        }
        if ((i3 & 2) != 0) {
            str = standardMoney.currencyName;
        }
        if ((i3 & 4) != 0) {
            str2 = standardMoney.currencyCharacter;
        }
        if ((i3 & 8) != 0) {
            str3 = standardMoney.moneyStr;
        }
        return standardMoney.copy(i2, str, str2, str3);
    }

    public final int component1() {
        return this.money;
    }

    public final String component2() {
        return this.currencyName;
    }

    public final String component3() {
        return this.currencyCharacter;
    }

    public final String component4() {
        return this.moneyStr;
    }

    public final StandardMoney copy(int i2, String str, String str2, String str3) {
        return new StandardMoney(i2, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardMoney)) {
            return false;
        }
        StandardMoney standardMoney = (StandardMoney) obj;
        return this.money == standardMoney.money && l.a(this.currencyName, standardMoney.currencyName) && l.a(this.currencyCharacter, standardMoney.currencyCharacter) && l.a(this.moneyStr, standardMoney.moneyStr);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shoutouts_model_StandardMoney_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_shoutouts_model_StandardMoney_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.money) * 31;
        String str = this.currencyName;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_shoutouts_model_StandardMoney_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.currencyCharacter;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.moneyStr;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "StandardMoney(money=" + this.money + ", currencyName=" + this.currencyName + ", currencyCharacter=" + this.currencyCharacter + ", moneyStr=" + this.moneyStr + ")";
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

    public StandardMoney(int i2, String str, String str2, String str3) {
        this.money = i2;
        this.currencyName = str;
        this.currencyCharacter = str2;
        this.moneyStr = str3;
    }
}
