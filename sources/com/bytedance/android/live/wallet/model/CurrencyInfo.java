package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class CurrencyInfo {
    @c(a = "code")
    private String code;
    @c(a = "keep_dot")
    private int keepDot;
    @c(a = "symbol")
    private String symbol;

    static {
        Covode.recordClassIndex(7329);
    }

    public CurrencyInfo() {
        this(null, 0, null, 7, null);
    }

    public final String getCode() {
        return this.code;
    }

    public final int getKeepDot() {
        return this.keepDot;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final void setKeepDot(int i2) {
        this.keepDot = i2;
    }

    public final void setCode(String str) {
        l.d(str, "");
        this.code = str;
    }

    public final void setSymbol(String str) {
        l.d(str, "");
        this.symbol = str;
    }

    public CurrencyInfo(String str, int i2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.code = str;
        this.keepDot = i2;
        this.symbol = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrencyInfo(String str, int i2, String str2, int i3, g gVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str2);
    }
}
