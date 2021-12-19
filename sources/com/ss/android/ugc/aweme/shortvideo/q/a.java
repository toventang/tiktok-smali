package com.ss.android.ugc.aweme.shortvideo.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.dh;
import com.ss.android.ugc.aweme.shortvideo.q.b;
import h.a.n;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f129928a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(85272);
    }

    public static final void a(b bVar) {
        l.d(bVar, "");
        String str = bVar.f129930b;
        if (dh.a() != 0 && !g.a().A().a() && !n.a((Iterable) c.f129941a, (Object) str)) {
            if (!bVar.f129933e || com.ss.android.ugc.aweme.shortvideo.edit.a.a()) {
                if (bVar instanceof b.c) {
                    b.c cVar = (b.c) bVar;
                    com.ss.android.ugc.aweme.port.in.l.f115658a.b().k().a(cVar.f129936f, bVar.f129931c, bVar.f129932d, cVar.f129937g);
                } else if (bVar instanceof b.d) {
                    b.d dVar = (b.d) bVar;
                    com.ss.android.ugc.aweme.port.in.l.f115658a.b().k().a(dVar.f129938f, bVar.f129931c, bVar.f129932d, dVar.f129940h);
                } else if (bVar instanceof b.C3384b) {
                    b.C3384b bVar2 = (b.C3384b) bVar;
                    com.ss.android.ugc.aweme.port.in.l.f115658a.b().k().a(bVar2.f129934f, bVar.f129931c, bVar2.f129935g);
                } else if (bVar instanceof b.a) {
                    com.ss.android.ugc.aweme.port.in.l.f115658a.b().k().a(((b.a) bVar).f129934f, bVar.f129931c, bVar.f129932d);
                }
                com.ss.android.ugc.aweme.port.in.l.f115658a.b().j();
            }
        }
    }
}
