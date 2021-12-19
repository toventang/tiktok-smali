package com.ss.android.ugc.aweme.commercialize.event;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;

public final class AdCardClose implements b {
    public int cardStatus;

    static {
        Covode.recordClassIndex(45597);
    }

    public final b post() {
        return c.a(this);
    }

    public final b postSticky() {
        return c.b(this);
    }

    public AdCardClose(int i2) {
        this.cardStatus = i2;
    }
}
