package com.bytedance.android.live.wallet.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class BasePackage {
    @c(a = "id")
    private long id;
    @c(a = "price")
    private long price;
    @c(a = "real_dot")
    private int realDot;

    static {
        Covode.recordClassIndex(7325);
    }

    public BasePackage() {
        this(0, 0, 0, 7, null);
    }

    public final long getId() {
        return this.id;
    }

    public final long getPrice() {
        return this.price;
    }

    public final int getRealDot() {
        return this.realDot;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setPrice(long j2) {
        this.price = j2;
    }

    public final void setRealDot(int i2) {
        this.realDot = i2;
    }

    public BasePackage(long j2, long j3, int i2) {
        this.id = j2;
        this.price = j3;
        this.realDot = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasePackage(long j2, long j3, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : j2, (i3 & 2) == 0 ? j3 : 0, (i3 & 4) != 0 ? 0 : i2);
    }
}
