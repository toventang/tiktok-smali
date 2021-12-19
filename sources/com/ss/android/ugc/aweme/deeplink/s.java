package com.ss.android.ugc.aweme.deeplink;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.c.d;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public int f79529a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f79530b = new ArrayList();

    static {
        Covode.recordClassIndex(49399);
    }

    public final s a(d dVar) {
        l.d(dVar, "");
        this.f79530b.add(dVar);
        return this;
    }

    public final void a(d dVar, s sVar) {
        l.d(dVar, "");
        l.d(sVar, "");
        if (this.f79529a != this.f79530b.size()) {
            this.f79529a++;
            this.f79530b.get(this.f79529a).a(dVar, sVar);
        }
    }
}
