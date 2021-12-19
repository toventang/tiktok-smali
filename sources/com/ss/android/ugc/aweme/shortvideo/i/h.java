package com.ss.android.ugc.aweme.shortvideo.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.record.ar;
import com.ss.android.ugc.aweme.shortvideo.record.s;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public g f128558a;

    /* renamed from: b  reason: collision with root package name */
    private final ar f128559b;

    static {
        Covode.recordClassIndex(84293);
    }

    private final void b() {
        if (this.f128558a == null) {
            this.f128558a = new s(this.f128559b);
        }
    }

    public final int a() {
        b();
        g gVar = this.f128558a;
        if (gVar == null) {
            l.a("strategy");
        }
        return gVar.a();
    }

    public h(ar arVar) {
        l.d(arVar, "");
        this.f128559b = arVar;
    }
}
