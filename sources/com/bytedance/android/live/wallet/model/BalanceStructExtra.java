package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class BalanceStructExtra {
    @c(a = "base_package")
    private BasePackage basePackage;
    @c(a = "currency_info")
    private CurrencyInfo currencyInfo;
    @c(a = "coins")
    private long maxCoins;

    static {
        Covode.recordClassIndex(7324);
    }

    public BalanceStructExtra() {
        this(null, null, 0, 7, null);
    }

    public final BasePackage getBasePackage() {
        return this.basePackage;
    }

    public final CurrencyInfo getCurrencyInfo() {
        return this.currencyInfo;
    }

    public final long getMaxCoins() {
        return this.maxCoins;
    }

    public final void setBasePackage(BasePackage basePackage2) {
        this.basePackage = basePackage2;
    }

    public final void setCurrencyInfo(CurrencyInfo currencyInfo2) {
        this.currencyInfo = currencyInfo2;
    }

    public final void setMaxCoins(long j2) {
        this.maxCoins = j2;
    }

    public BalanceStructExtra(CurrencyInfo currencyInfo2, BasePackage basePackage2, long j2) {
        this.currencyInfo = currencyInfo2;
        this.basePackage = basePackage2;
        this.maxCoins = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BalanceStructExtra(CurrencyInfo currencyInfo2, BasePackage basePackage2, long j2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : currencyInfo2, (i2 & 2) != 0 ? null : basePackage2, (i2 & 4) != 0 ? 0 : j2);
    }
}
