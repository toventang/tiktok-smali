package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class AutoExchangeData {
    @c(a = "auto_exchange_after")
    private boolean after;
    @c(a = "auto_exchange_before")
    private boolean before;

    static {
        Covode.recordClassIndex(7322);
    }

    public AutoExchangeData() {
        this(false, false, 3, null);
    }

    public final boolean getAfter() {
        return this.after;
    }

    public final boolean getBefore() {
        return this.before;
    }

    public final void setAfter(boolean z) {
        this.after = z;
    }

    public final void setBefore(boolean z) {
        this.before = z;
    }

    public AutoExchangeData(boolean z, boolean z2) {
        this.before = z;
        this.after = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoExchangeData(boolean z, boolean z2, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2);
    }
}
