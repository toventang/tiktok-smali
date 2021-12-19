package com.ss.android.ugc.aweme.publish.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.e.a;
import com.ss.android.ugc.aweme.publish.i;
import h.f.b.l;

final class f implements i {
    static {
        Covode.recordClassIndex(77174);
    }

    @Override // com.ss.android.ugc.aweme.publish.i
    public final void b() {
        g.a();
    }

    @Override // com.ss.android.ugc.aweme.publish.i
    public final boolean a() {
        g.a();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.publish.i
    public final void a(String str, Throwable th) {
        l.d(str, "");
        l.d(th, "");
        l.d(str, "");
        l.d(th, "");
        g.a();
        a.a(str, th);
    }
}
