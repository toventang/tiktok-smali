package com.ss.android.ugc.aweme.deeplink.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.d;
import com.ss.android.ugc.aweme.deeplink.s;
import h.f.b.l;

public abstract class b implements d {

    /* renamed from: b  reason: collision with root package name */
    public boolean f79452b;

    static {
        Covode.recordClassIndex(49361);
    }

    public abstract boolean a(d dVar);

    public boolean b(d dVar) {
        l.d(dVar, "");
        return true;
    }

    public /* synthetic */ b() {
        this(false);
    }

    public b(boolean z) {
        this.f79452b = z;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.c.d
    public final void a(d dVar, s sVar) {
        l.d(dVar, "");
        l.d(sVar, "");
        if (b(dVar)) {
            a(dVar);
            if (this.f79452b) {
                return;
            }
        }
        sVar.a(dVar, sVar);
    }
}
