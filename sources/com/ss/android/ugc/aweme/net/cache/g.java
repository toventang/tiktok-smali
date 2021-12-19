package com.ss.android.ugc.aweme.net.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.a.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.c;
import com.ss.android.ugc.aweme.net.cache.a;
import h.f.b.l;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final g f112265a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(72145);
    }

    @Override // com.bytedance.retrofit2.a.a
    public final c a(Request request) {
        boolean z;
        c cVar = null;
        if (request == null) {
            return null;
        }
        l.d(request, "");
        if (a.f112248b != null && b.d(request)) {
            a.f112249c.incrementAndGet();
            cVar = (c) a.a(b.e(request), a.f112250d, a.f112251e, new a.C2867a(request));
            if (cVar != null) {
                z = true;
                b.a(request, z);
                return cVar;
            }
        }
        z = false;
        b.a(request, z);
        return cVar;
    }

    @Override // com.bytedance.retrofit2.a.a
    public final c a(Request request, c cVar) {
        if (request == null || cVar == null) {
            return null;
        }
        return a.a(request, cVar);
    }
}
