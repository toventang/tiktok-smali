package com.ss.android.ugc.aweme.search.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.search.e.c;
import com.ss.android.ugc.aweme.search.p.a;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f121152a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(78919);
    }

    public static void a(a aVar) {
        c aVar2;
        int originType;
        l.d(aVar, "");
        d dVar = aVar.f121148b;
        if (dVar != null) {
            dVar.getSchema();
        }
        d dVar2 = aVar.f121148b;
        if (dVar2 == null || (originType = dVar2.getOriginType()) == 0 || originType == 80) {
            aVar2 = new a();
        } else if (originType == 81) {
            aVar2 = new c();
        } else {
            throw new UnsupportedOperationException("Unknown DynamicPatch's origin_type: ".concat(String.valueOf(originType)));
        }
        aVar2.a(aVar);
    }
}
