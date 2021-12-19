package com.ss.ugc.live.a.a;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f154050a;

    /* renamed from: b  reason: collision with root package name */
    private final c f154051b;

    static {
        Covode.recordClassIndex(102724);
    }

    g(f fVar, c cVar) {
        this.f154050a = fVar;
        this.f154051b = cVar;
    }

    public final void run() {
        f fVar = this.f154050a;
        c cVar = this.f154051b;
        String str = cVar.f154004a;
        String d2 = fVar.d(cVar);
        k kVar = fVar.f154042b.get(str);
        if (kVar != null) {
            for (d dVar : kVar.f154061b) {
                dVar.a(d2);
            }
        }
        fVar.f154042b.remove(str);
        for (b bVar : fVar.f154044d) {
            bVar.a(cVar.f154005b, cVar);
        }
        fVar.f154047g--;
        fVar.f154048h = 0;
        fVar.b();
    }
}
