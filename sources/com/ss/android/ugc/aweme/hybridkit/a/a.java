package com.ss.android.ugc.aweme.hybridkit.a;

import com.bytedance.android.alog.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.j.b;
import h.f.b.l;

public final class a implements com.bytedance.lynx.hybrid.j.a {
    static {
        Covode.recordClassIndex(63571);
    }

    @Override // com.bytedance.lynx.hybrid.j.a
    public final void a(Throwable th, String str, String str2) {
        l.d(th, "");
        l.d(str, "");
        l.d(str2, "");
        c.a(4, str2, str);
    }

    @Override // com.bytedance.lynx.hybrid.j.a
    public final void a(String str, b bVar, String str2) {
        l.d(str, "");
        l.d(bVar, "");
        l.d(str2, "");
        int i2 = b.f99734a[bVar.ordinal()];
        if (i2 == 1) {
            c.a(1, str2, str);
        } else if (i2 == 2) {
            c.a(0, str2, str);
        } else if (i2 == 3) {
            c.a(2, str2, str);
        } else if (i2 == 4) {
            c.a(3, str2, str);
        } else if (i2 == 5) {
            c.a(4, str2, str);
        }
    }
}
