package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import h.f.b.l;

public final class by {

    /* renamed from: a  reason: collision with root package name */
    public static final by f125063a = new by();

    private by() {
    }

    static {
        Covode.recordClassIndex(82160);
    }

    public static final long a(c cVar, String str) {
        l.d(cVar, "");
        long b2 = (long) c.f115629h.b(str);
        if (cVar.getPresenterDuration() <= 0) {
            return b2;
        }
        long presenterDuration = (long) cVar.getPresenterDuration();
        return Math.abs(b2 - presenterDuration) >= 1000 ? presenterDuration : b2;
    }
}
