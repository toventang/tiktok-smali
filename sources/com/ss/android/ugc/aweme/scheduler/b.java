package com.ss.android.ugc.aweme.scheduler;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import h.f.b.l;

public final class b implements k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f120851a;

    static {
        Covode.recordClassIndex(78737);
    }

    public b(boolean z) {
        this.f120851a = z;
    }

    @Override // com.ss.android.ugc.aweme.scheduler.k
    public final boolean a(q qVar, q qVar2) {
        l.d(qVar, "");
        l.d(qVar2, "");
        if (l.a((Object) qVar.f129873b, (Object) qVar2.f129873b) || this.f120851a) {
            return true;
        }
        return false;
    }
}
