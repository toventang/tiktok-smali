package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class BackFromSettingEvent implements b {
    public final String enterFrom;

    static {
        Covode.recordClassIndex(61567);
    }

    public final b post() {
        return c.a(this);
    }

    public final b postSticky() {
        return c.b(this);
    }

    public BackFromSettingEvent(String str) {
        l.d(str, "");
        this.enterFrom = str;
    }
}
