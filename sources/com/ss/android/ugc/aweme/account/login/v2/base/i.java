package com.ss.android.ugc.aweme.account.login.v2.base;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public b f64735a;

    /* renamed from: b  reason: collision with root package name */
    private f.a.b.b f64736b;

    public interface a {
        static {
            Covode.recordClassIndex(39785);
        }

        void a(String str);
    }

    public interface b {
        static {
            Covode.recordClassIndex(39786);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(39784);
    }

    public final void a() {
        f.a.b.b bVar = this.f64736b;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    static final class c<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f64737a;

        static {
            Covode.recordClassIndex(39787);
        }

        c(i iVar) {
            this.f64737a = iVar;
        }

        @Override // f.a.w
        public final void subscribe(final v<String> vVar) {
            l.d(vVar, "");
            this.f64737a.f64735a = new b() {
                /* class com.ss.android.ugc.aweme.account.login.v2.base.i.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(39788);
                }

                @Override // com.ss.android.ugc.aweme.account.login.v2.base.i.b
                public final void a(String str) {
                    l.d(str, "");
                    v vVar = vVar;
                    l.b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.a(str);
                    }
                }
            };
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f64739a;

        static {
            Covode.recordClassIndex(39789);
        }

        d(a aVar) {
            this.f64739a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            a aVar = this.f64739a;
            l.b(str, "");
            aVar.a(str);
        }
    }

    public final void a(String str) {
        l.d(str, "");
        b bVar = this.f64735a;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    public final void a(a aVar, TimeUnit timeUnit) {
        l.d(aVar, "");
        l.d(timeUnit, "");
        t a2 = t.a(new c(this));
        l.b(a2, "");
        this.f64736b = a2.d(1000, timeUnit).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new d(aVar));
    }
}
