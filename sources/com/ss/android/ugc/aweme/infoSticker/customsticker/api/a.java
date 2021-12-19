package com.ss.android.ugc.aweme.infoSticker.customsticker.api;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class a extends Exception {
    private final String message;

    static {
        Covode.recordClassIndex(67069);
    }

    public a() {
        this(null, 1, null);
    }

    public final String getMessage() {
        return this.message;
    }

    public a(String str) {
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str);
    }
}
