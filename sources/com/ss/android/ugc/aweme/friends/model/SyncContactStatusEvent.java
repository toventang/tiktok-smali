package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class SyncContactStatusEvent implements b {
    public final String enterFrom;
    public final boolean isSuccess;
    public final boolean lastValue;

    static {
        Covode.recordClassIndex(61613);
    }

    public final b post() {
        return c.a(this);
    }

    public final b postSticky() {
        return c.b(this);
    }

    public SyncContactStatusEvent(String str, boolean z, boolean z2) {
        l.d(str, "");
        this.enterFrom = str;
        this.isSuccess = z;
        this.lastValue = z2;
    }
}
