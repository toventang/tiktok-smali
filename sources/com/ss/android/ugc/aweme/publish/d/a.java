package com.ss.android.ugc.aweme.publish.d;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class a extends RuntimeException {
    private final String extra;
    private final int stage;

    static {
        Covode.recordClassIndex(77128);
    }

    public final String toString() {
        return "PublishDebugMockException(stage=" + this.stage + ", extra=" + this.extra + ')';
    }

    public a(int i2, String str) {
        this.stage = i2;
        this.extra = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, String str, int i3, g gVar) {
        this(i2, (i3 & 2) != 0 ? "" : str);
    }
}
