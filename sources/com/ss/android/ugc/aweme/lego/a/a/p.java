package com.ss.android.ugc.aweme.lego.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.e.b;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.r;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class p extends r {
    static {
        Covode.recordClassIndex(68709);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f107353a;

        static {
            Covode.recordClassIndex(68710);
        }

        a(List list) {
            this.f107353a = list;
        }

        public final void run() {
            for (final n nVar : this.f107353a) {
                Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoRequest");
                r rVar = (r) nVar;
                aa b2 = rVar.b();
                b bVar = f.f107538c;
                l.b(b2, "");
                bVar.a(b2, rVar);
                com.ss.android.ugc.aweme.lego.p.a(aa.P0).execute(new Runnable() {
                    /* class com.ss.android.ugc.aweme.lego.a.a.p.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(68711);
                    }

                    public final void run() {
                        f.f107538c.a((r) nVar, com.ss.android.ugc.aweme.lego.a.b.a());
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.e.a
    public final void a(List<? extends n> list) {
        l.d(list, "");
        if (!list.isEmpty()) {
            com.ss.android.ugc.aweme.lego.p.a(aa.P0).execute(new a(list));
        }
    }
}
