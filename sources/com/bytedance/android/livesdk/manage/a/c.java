package com.bytedance.android.livesdk.manage.a;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.a.a.a.b;
import com.ss.ugc.live.a.a.d.a;
import com.ss.ugc.live.a.a.d.d;
import com.ss.ugc.live.a.a.d.f;
import com.ss.ugc.live.a.a.e;

public final class c implements a<String> {

    /* renamed from: a  reason: collision with root package name */
    private static d<String> f18875a;

    /* renamed from: b  reason: collision with root package name */
    private static d<String> f18876b;

    static {
        Covode.recordClassIndex(11230);
    }

    private static d<String> a(b bVar) {
        return new com.ss.ugc.live.a.a.d.b(new b(bVar));
    }

    @Override // com.ss.ugc.live.a.a.d.a
    public final d<String> a(com.ss.ugc.live.a.a.c cVar, e eVar) {
        if (!cVar.f154009f) {
            d<String> dVar = f18876b;
            if (dVar != null) {
                return dVar;
            }
            d<String> a2 = a(eVar.f154025a);
            f18876b = a2;
            return a2;
        }
        d<String> dVar2 = f18875a;
        if (dVar2 != null) {
            return dVar2;
        }
        f fVar = new f(a(eVar.f154025a));
        f18875a = fVar;
        return fVar;
    }
}
