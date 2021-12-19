package com.ss.android.ugc.aweme.story.avatar.entry;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.avatar.o;
import h.f.b.l;
import h.n;

public final class e {
    static {
        Covode.recordClassIndex(89397);
    }

    public static final d a(o oVar) {
        l.d(oVar, "");
        int i2 = f.f136821a[oVar.ordinal()];
        if (i2 == 1) {
            return d.WESTWINDOW;
        }
        if (i2 == 2) {
            return d.FEED;
        }
        if (i2 == 3) {
            return d.INBOX;
        }
        if (i2 == 4) {
            return d.PROFILE;
        }
        if (i2 == 5) {
            return d.FOLLOW_LIST;
        }
        throw new n();
    }
}
