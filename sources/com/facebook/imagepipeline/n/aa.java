package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.g.i;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;
import java.io.InputStream;
import java.util.concurrent.Executor;

public abstract class aa implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f48118a;

    /* renamed from: b  reason: collision with root package name */
    private final i f48119b;

    static {
        Covode.recordClassIndex(29078);
    }

    /* access modifiers changed from: protected */
    public abstract e a(b bVar);

    /* access modifiers changed from: protected */
    public abstract String a();

    protected aa(Executor executor, i iVar) {
        this.f48118a = executor;
        this.f48119b = iVar;
    }

    /* access modifiers changed from: protected */
    public final e b(InputStream inputStream, int i2) {
        return a(inputStream, i2);
    }

    /* access modifiers changed from: protected */
    public final e a(InputStream inputStream, int i2) {
        a aVar;
        if (i2 <= 0) {
            try {
                aVar = a.a(this.f48119b.a(inputStream));
            } catch (Throwable th) {
                com.facebook.common.d.b.a(inputStream);
                a.c(null);
                throw th;
            }
        } else {
            aVar = a.a(this.f48119b.a(inputStream, i2));
        }
        e eVar = new e(aVar);
        com.facebook.common.d.b.a(inputStream);
        a.c(aVar);
        return eVar;
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<e> kVar, al alVar) {
        final an c2 = alVar.c();
        final String b2 = alVar.b();
        final b a2 = alVar.a();
        final AnonymousClass1 r1 = new av<e>(kVar, a(), c2, b2) {
            /* class com.facebook.imagepipeline.n.aa.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29079);
            }

            @Override // com.facebook.common.b.h
            public final /* synthetic */ Object c() {
                e a2 = aa.this.a(a2);
                if (a2 == null) {
                    c2.onUltimateProducerReached(b2, aa.this.a(), false);
                    return null;
                }
                a2.j();
                c2.onUltimateProducerReached(b2, aa.this.a(), true);
                return a2;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.b.h, com.facebook.imagepipeline.n.av
            public final /* synthetic */ void b(e eVar) {
                e.d(eVar);
            }
        };
        alVar.a(new e() {
            /* class com.facebook.imagepipeline.n.aa.AnonymousClass2 */

            static {
                Covode.recordClassIndex(29080);
            }

            @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
            public final void a() {
                r1.a();
            }
        });
        this.f48118a.execute(r1);
    }
}
