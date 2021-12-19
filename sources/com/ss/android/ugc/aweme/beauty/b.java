package com.ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.utils.q;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f68623a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(42229);
    }

    public static final boolean a() {
        boolean z = !g.a().y().b().booleanValue();
        q.d("isBeautyM: ".concat(String.valueOf(z)));
        return z;
    }

    public static final boolean b() {
        if (!g.a().y().b().booleanValue()) {
            return true;
        }
        return false;
    }
}
