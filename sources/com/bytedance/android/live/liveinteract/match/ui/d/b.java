package com.bytedance.android.live.liveinteract.match.ui.d;

import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f10843a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(5797);
    }

    public static final String a(long j2) {
        int i2 = (int) j2;
        if (i2 == 1) {
            String a2 = y.a((int) R.string.dyc);
            l.b(a2, "");
            return a2;
        } else if (i2 == 2) {
            String a3 = y.a((int) R.string.dyf);
            l.b(a3, "");
            return a3;
        } else if (i2 != 3) {
            return "";
        } else {
            String a4 = y.a((int) R.string.dyd);
            l.b(a4, "");
            return a4;
        }
    }
}
