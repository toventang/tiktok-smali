package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.k.g;

public final class as {

    /* renamed from: a  reason: collision with root package name */
    public static int f132231a;

    /* renamed from: b  reason: collision with root package name */
    public static final as f132232b = new as();

    private as() {
    }

    static {
        Covode.recordClassIndex(86598);
    }

    public static final int a() {
        if (!c.u.a() && g.b()) {
            return f132231a + 300;
        }
        if (c.u.a() || !g.c()) {
            return f132231a + 150;
        }
        return f132231a + 500;
    }
}
