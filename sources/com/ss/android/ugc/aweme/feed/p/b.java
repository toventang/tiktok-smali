package com.ss.android.ugc.aweme.feed.p;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.experiment.f;
import com.ss.android.ugc.aweme.feed.experiment.g;

public final class b {
    static {
        Covode.recordClassIndex(59585);
    }

    public static final boolean a(int i2, int i3) {
        return (i2 == 1 || i2 == 0) && i3 != 8;
    }

    public static final boolean a() {
        if (!f.f93059a || !g.f93062a) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }
}
