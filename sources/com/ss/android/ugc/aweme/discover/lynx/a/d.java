package com.ss.android.ugc.aweme.discover.lynx.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f81433a = new ArrayList();

    static {
        Covode.recordClassIndex(50604);
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        this.f81433a.add(cVar);
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        for (c cVar : this.f81433a) {
            cVar.a(bVar);
        }
    }
}
