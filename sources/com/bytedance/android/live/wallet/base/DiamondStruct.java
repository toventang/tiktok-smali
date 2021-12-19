package com.bytedance.android.live.wallet.base;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class DiamondStruct {
    @c(a = "describe")
    public String describe;
    @c(a = "diamond_count")
    public int diamondCount;
    @c(a = "exchange_price")
    public int exchangePrice;
    @c(a = "giving_count")
    public int givingCount;
    @c(a = "iap_id")
    public String iapId;
    @c(a = "id")
    public int id;
    @c(a = "price")
    public int price;

    static {
        Covode.recordClassIndex(7250);
    }

    public String toString() {
        return "DiamondStruct{id=" + this.id + ", iapId='" + this.iapId + '\'' + ", price=" + this.price + ", exchangePrice=" + this.exchangePrice + ", diamondCount=" + this.diamondCount + ", givingCount=" + this.givingCount + ", describe='" + this.describe + '\'' + '}';
    }
}
