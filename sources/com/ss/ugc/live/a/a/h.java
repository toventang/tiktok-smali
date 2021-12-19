package com.ss.ugc.live.a.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.a.a.c.a;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f154052a;

    /* renamed from: b  reason: collision with root package name */
    private final c f154053b;

    /* renamed from: c  reason: collision with root package name */
    private final a f154054c;

    static {
        Covode.recordClassIndex(102725);
    }

    h(f fVar, c cVar, a aVar) {
        this.f154052a = fVar;
        this.f154053b = cVar;
        this.f154054c = aVar;
    }

    public final void run() {
        f fVar = this.f154052a;
        c cVar = this.f154053b;
        a aVar = this.f154054c;
        k kVar = fVar.f154042b.get(cVar.f154004a);
        if (kVar != null) {
            if (cVar.f154011h < Math.max(cVar.f154006c.length, fVar.f154043c.f154027c) - 1) {
                fVar.f154046f.postDelayed(new i(fVar, cVar), (long) fVar.f154043c.a());
                return;
            }
        }
        fVar.f154045e.put(cVar.f154004a, new Pair<>(false, Long.valueOf(System.currentTimeMillis())));
        if (kVar != null) {
            for (d dVar : kVar.f154061b) {
                dVar.a(aVar);
            }
        }
        fVar.f154042b.remove(cVar.f154004a);
        for (b bVar : fVar.f154044d) {
            bVar.a(aVar);
        }
        fVar.f154047g--;
        fVar.f154048h++;
        fVar.b();
    }
}
