package com.facebook.imagepipeline.n;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.a;
import com.facebook.common.g.i;
import com.facebook.common.g.k;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.n.ag;
import com.facebook.imagepipeline.p.b;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public final class af implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    final i f48151a;

    /* renamed from: b  reason: collision with root package name */
    final a f48152b;

    /* renamed from: c  reason: collision with root package name */
    final ag f48153c;

    static {
        Covode.recordClassIndex(29091);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> a(t tVar, int i2) {
        if (!tVar.b().requiresExtraMap(tVar.a())) {
            return null;
        }
        return this.f48153c.getExtraMap(tVar, i2);
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<e> kVar, al alVar) {
        alVar.c().onProducerStart(alVar.b(), "NetworkFetchProducer");
        final t createFetchState = this.f48153c.createFetchState(kVar, alVar);
        this.f48153c.fetch(createFetchState, new ag.a() {
            /* class com.facebook.imagepipeline.n.af.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29092);
            }

            @Override // com.facebook.imagepipeline.n.ag.a
            public final void a() {
                af afVar = af.this;
                t tVar = createFetchState;
                tVar.b().onProducerFinishWithCancellation(tVar.a(), "NetworkFetchProducer", afVar.a(tVar, -1));
                tVar.f48389d.b();
            }

            @Override // com.facebook.imagepipeline.n.ag.a
            public final void a(Throwable th) {
                String str;
                af afVar = af.this;
                t tVar = createFetchState;
                Map<String, String> a2 = afVar.a(tVar, -1);
                if (a2 == null) {
                    a2 = new HashMap<>(1);
                }
                if (afVar.f48153c == null) {
                    str = "null";
                } else {
                    str = afVar.f48153c.getClass().getName() + ", " + afVar.f48153c.toString();
                }
                a2.put("NetworkFetcher", str);
                tVar.b().onProducerFinishWithFailure(tVar.a(), "NetworkFetchProducer", th, a2);
                tVar.b().onUltimateProducerReached(tVar.a(), "NetworkFetchProducer", false);
                tVar.f48389d.b(th);
            }

            @Override // com.facebook.imagepipeline.n.ag.a
            public final void a(InputStream inputStream, int i2) {
                k a2;
                float f2;
                MethodCollector.i(13106);
                b.a();
                af afVar = af.this;
                t tVar = createFetchState;
                if (i2 > 0) {
                    a2 = afVar.f48151a.a(i2);
                } else {
                    a2 = afVar.f48151a.a();
                }
                byte[] bArr = (byte[]) afVar.f48152b.a(16384);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read < 0) {
                            afVar.f48153c.onFetchCompletion(tVar, a2.b());
                            Map<String, String> a3 = afVar.a(tVar, a2.b());
                            an b2 = tVar.b();
                            b2.onProducerFinishWithSuccess(tVar.a(), "NetworkFetchProducer", a3);
                            b2.onUltimateProducerReached(tVar.a(), "NetworkFetchProducer", true);
                            af.a(a2, tVar.f48392g | 1, tVar.f48393h, tVar.f48389d);
                            afVar.f48152b.a(bArr);
                            a2.close();
                            b.a();
                            MethodCollector.o(13106);
                            return;
                        } else if (read > 0) {
                            a2.write(bArr, 0, read);
                            long uptimeMillis = SystemClock.uptimeMillis();
                            if (tVar.f48390e.h() && afVar.f48153c.shouldPropagate(tVar) && uptimeMillis - tVar.f48391f >= 100) {
                                tVar.f48391f = uptimeMillis;
                                tVar.b().onProducerEvent(tVar.a(), "NetworkFetchProducer", "intermediate_result");
                                af.a(a2, tVar.f48392g, tVar.f48393h, tVar.f48389d);
                            }
                            int b3 = a2.b();
                            if (i2 > 0) {
                                f2 = ((float) b3) / ((float) i2);
                            } else {
                                double d2 = (double) (-b3);
                                Double.isNaN(d2);
                                f2 = 1.0f - ((float) Math.exp(d2 / 50000.0d));
                            }
                            tVar.f48389d.b(f2);
                        }
                    } catch (Throwable th) {
                        afVar.f48152b.a(bArr);
                        a2.close();
                        MethodCollector.o(13106);
                        throw th;
                    }
                }
            }
        });
    }

    public af(i iVar, a aVar, ag agVar) {
        this.f48151a = iVar;
        this.f48152b = aVar;
        this.f48153c = agVar;
    }

    static void a(k kVar, int i2, com.facebook.imagepipeline.common.a aVar, k<e> kVar2) {
        Throwable th;
        com.facebook.common.h.a a2 = com.facebook.common.h.a.a(kVar.a());
        e eVar = null;
        try {
            e eVar2 = new e(a2);
            try {
                eVar2.f47998j = aVar;
                eVar2.j();
                kVar2.b(eVar2, i2);
                e.d(eVar2);
                com.facebook.common.h.a.c(a2);
            } catch (Throwable th2) {
                th = th2;
                eVar = eVar2;
                e.d(eVar);
                com.facebook.common.h.a.c(a2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            e.d(eVar);
            com.facebook.common.h.a.c(a2);
            throw th;
        }
    }
}
