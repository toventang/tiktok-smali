package com.ss.android.ugc.aweme.cp;

import com.bytedance.covode.number.Covode;

public abstract class a {
    static {
        Covode.recordClassIndex(48521);
    }

    public abstract void a();

    public final void c() {
        if (b()) {
            a();
        }
    }

    protected static boolean b() {
        if (((Boolean) h.f78271b.getValue()).booleanValue()) {
            return ((Boolean) h.f78272c.getValue()).booleanValue();
        }
        return false;
    }
}
