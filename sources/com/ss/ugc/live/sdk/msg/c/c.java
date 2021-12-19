package com.ss.ugc.live.sdk.msg.c;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class c extends RuntimeException {
    private final int statusCode;

    static {
        Covode.recordClassIndex(102811);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(int i2, String str, Exception exc) {
        super(str, exc);
        l.c(str, "");
        this.statusCode = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i2, String str, Exception exc, int i3, g gVar) {
        this(i2, str, (i3 & 4) != 0 ? null : exc);
    }
}
