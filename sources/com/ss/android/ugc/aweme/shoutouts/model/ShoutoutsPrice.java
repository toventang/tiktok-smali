package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ShoutoutsPrice {
    @c(a = "buyer_payment")
    private final StandardMoney buyerPayment;
    @c(a = "coin")
    private final int coin;
    @c(a = "creator_earning")
    private final StandardMoney creatorEarning;

    static {
        Covode.recordClassIndex(87101);
    }

    public static int com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsPrice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ ShoutoutsPrice copy$default(ShoutoutsPrice shoutoutsPrice, int i2, StandardMoney standardMoney, StandardMoney standardMoney2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = shoutoutsPrice.coin;
        }
        if ((i3 & 2) != 0) {
            standardMoney = shoutoutsPrice.buyerPayment;
        }
        if ((i3 & 4) != 0) {
            standardMoney2 = shoutoutsPrice.creatorEarning;
        }
        return shoutoutsPrice.copy(i2, standardMoney, standardMoney2);
    }

    public final int component1() {
        return this.coin;
    }

    public final StandardMoney component2() {
        return this.buyerPayment;
    }

    public final StandardMoney component3() {
        return this.creatorEarning;
    }

    public final ShoutoutsPrice copy(int i2, StandardMoney standardMoney, StandardMoney standardMoney2) {
        return new ShoutoutsPrice(i2, standardMoney, standardMoney2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsPrice)) {
            return false;
        }
        ShoutoutsPrice shoutoutsPrice = (ShoutoutsPrice) obj;
        return this.coin == shoutoutsPrice.coin && l.a(this.buyerPayment, shoutoutsPrice.buyerPayment) && l.a(this.creatorEarning, shoutoutsPrice.creatorEarning);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsPrice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsPrice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.coin) * 31;
        StandardMoney standardMoney = this.buyerPayment;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsPrice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (standardMoney != null ? standardMoney.hashCode() : 0)) * 31;
        StandardMoney standardMoney2 = this.creatorEarning;
        if (standardMoney2 != null) {
            i2 = standardMoney2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShoutoutsPrice(coin=" + this.coin + ", buyerPayment=" + this.buyerPayment + ", creatorEarning=" + this.creatorEarning + ")";
    }

    public final StandardMoney getBuyerPayment() {
        return this.buyerPayment;
    }

    public final int getCoin() {
        return this.coin;
    }

    public final StandardMoney getCreatorEarning() {
        return this.creatorEarning;
    }

    public ShoutoutsPrice(int i2, StandardMoney standardMoney, StandardMoney standardMoney2) {
        this.coin = i2;
        this.buyerPayment = standardMoney;
        this.creatorEarning = standardMoney2;
    }
}
