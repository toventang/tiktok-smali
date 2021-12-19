package com.ss.android.ugc.aweme.shortvideo.ae;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.challenge.recommend.a.a;
import com.ss.android.ugc.aweme.challenge.recommend.a.b;
import com.ss.android.ugc.aweme.shortvideo.e;

public final class c implements f<a, e> {
    static {
        Covode.recordClassIndex(82055);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.a.f
    public final /* synthetic */ e a(a aVar) {
        a aVar2 = aVar;
        e eVar = new e();
        eVar.f126658a = aVar2.f69998a;
        eVar.f126659b = aVar2.f69999b;
        eVar.f126660c = a.a(aVar2.f70000c);
        eVar.f126661d = aVar2.f70001d;
        return eVar;
    }

    public static com.ss.android.ugc.aweme.shortvideo.f a(b bVar) {
        if (bVar == null) {
            return null;
        }
        com.ss.android.ugc.aweme.shortvideo.f fVar = new com.ss.android.ugc.aweme.shortvideo.f();
        fVar.f128473c = bVar.f70008c;
        fVar.f128472b = bVar.f70007b;
        fVar.f128475e = bVar.f70010e;
        fVar.f128474d = bVar.f70009d;
        fVar.f128471a = ap.a((Iterable) ap.a(bVar.a(), new c()));
        return fVar;
    }
}
