package com.ss.android.ugc.aweme.lego.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.e.b;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.r;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class o extends r {
    static {
        Covode.recordClassIndex(68706);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f107351a;

        static {
            Covode.recordClassIndex(68707);
        }

        a(List list) {
            this.f107351a = list;
        }

        public final void run() {
            for (final n nVar : this.f107351a) {
                Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoRequest");
                r rVar = (r) nVar;
                aa b2 = rVar.b();
                b bVar = f.f107538c;
                l.b(b2, "");
                bVar.a(b2, rVar);
                p.a(aa.NORMAL).execute(new Runnable() {
                    /* class com.ss.android.ugc.aweme.lego.a.a.o.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(68708);
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
            p.a(aa.P0).execute(new a(list));
        }
    }
}
