package com.vk.api.sdk.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d extends Exception {
    static {
        Covode.recordClassIndex(103784);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(int i2, String str) {
        super("Server returned httpStatusCode=" + i2 + " with body: " + str);
        l.c(str, "");
    }
}
