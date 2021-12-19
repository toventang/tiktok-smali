package com.ss.android.ugc.aweme.shoutouts;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class g implements Serializable {
    @c(a = "buyer_payment")
    private a buyerMoneyDes;
    @c(a = "coin")
    private int coin;
    @c(a = "creator_earning")
    private a moneyDes;

    static {
        Covode.recordClassIndex(87090);
    }

    public final a getBuyerMoneyDes() {
        return this.buyerMoneyDes;
    }

    public final int getCoin() {
        return this.coin;
    }

    public final a getMoneyDes() {
        return this.moneyDes;
    }

    public final void setBuyerMoneyDes(a aVar) {
        this.buyerMoneyDes = aVar;
    }

    public final void setCoin(int i2) {
        this.coin = i2;
    }

    public final void setMoneyDes(a aVar) {
        this.moneyDes = aVar;
    }
}
