package com.facebook.imagepipeline.n;

import android.net.Uri;
import b.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.i;
import com.facebook.common.g.k;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;
import com.facebook.imagepipeline.o.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ah implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.e f48156a;

    /* renamed from: b  reason: collision with root package name */
    private final f f48157b;

    /* renamed from: c  reason: collision with root package name */
    private final i f48158c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.g.a f48159d;

    /* renamed from: e  reason: collision with root package name */
    private final ak<e> f48160e;

    static {
        Covode.recordClassIndex(29095);
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(final k<e> kVar, final al alVar) {
        b a2 = alVar.a();
        if (!a2.mIsDiskCacheEnabled) {
            this.f48160e.a(kVar, alVar);
            return;
        }
        alVar.c().onProducerStart(alVar.b(), "PartialDiskCacheProducer");
        Uri build = a2.mSourceUri.buildUpon().appendQueryParameter("fresco_partial", "true").build();
        f fVar = this.f48157b;
        alVar.d();
        final com.facebook.c.a.e a3 = fVar.a(build);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        b.i<e> a4 = this.f48156a.a(a3, atomicBoolean);
        final String b2 = alVar.b();
        final an c2 = alVar.c();
        a4.a(new g<e, Void>() {
            /* class com.facebook.imagepipeline.n.ah.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29096);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ Void then(b.i<e> iVar) {
                boolean z;
                boolean z2;
                boolean z3 = false;
                if (iVar.b() || (iVar.c() && (iVar.e() instanceof CancellationException))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c2.onProducerFinishWithCancellation(b2, "PartialDiskCacheProducer", null);
                    kVar.b();
                } else if (iVar.c()) {
                    c2.onProducerFinishWithFailure(b2, "PartialDiskCacheProducer", iVar.e(), null);
                    ah.this.a(kVar, alVar, a3, (e) null);
                } else {
                    e d2 = iVar.d();
                    if (d2 != null) {
                        an anVar = c2;
                        String str = b2;
                        anVar.onProducerFinishWithSuccess(str, "PartialDiskCacheProducer", ah.a(anVar, str, true, d2.h()));
                        int h2 = d2.h() - 1;
                        if (h2 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        com.facebook.common.d.i.a(z2);
                        com.facebook.imagepipeline.common.a aVar = new com.facebook.imagepipeline.common.a(0, h2);
                        d2.f47998j = aVar;
                        int h3 = d2.h();
                        b a2 = alVar.a();
                        com.facebook.imagepipeline.common.a aVar2 = a2.mBytesRange;
                        if (aVar2 == null || aVar.f47732a > aVar2.f47732a || aVar.f47733b < aVar2.f47733b) {
                            kVar.b(d2, 8);
                            c a3 = c.a(a2);
                            int i2 = h3 - 1;
                            if (i2 >= 0) {
                                z3 = true;
                            }
                            com.facebook.common.d.i.a(z3);
                            a3.p = new com.facebook.imagepipeline.common.a(i2, Integer.MAX_VALUE);
                            ah.this.a(kVar, new au(a3.a(), alVar), a3, d2);
                        } else {
                            c2.onUltimateProducerReached(b2, "PartialDiskCacheProducer", true);
                            kVar.b(d2, 9);
                        }
                    } else {
                        an anVar2 = c2;
                        String str2 = b2;
                        anVar2.onProducerFinishWithSuccess(str2, "PartialDiskCacheProducer", ah.a(anVar2, str2, false, 0));
                        ah.this.a(kVar, alVar, a3, d2);
                    }
                }
                return null;
            }
        });
        alVar.a(new e() {
            /* class com.facebook.imagepipeline.n.ah.AnonymousClass2 */

            static {
                Covode.recordClassIndex(29097);
            }

            @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
            public final void a() {
                atomicBoolean.set(true);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public static class a extends n<e, e> {

        /* renamed from: a  reason: collision with root package name */
        private final com.facebook.imagepipeline.d.e f48169a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.c.a.e f48170b;

        /* renamed from: c  reason: collision with root package name */
        private final i f48171c;

        /* renamed from: d  reason: collision with root package name */
        private final com.facebook.common.g.a f48172d;

        /* renamed from: f  reason: collision with root package name */
        private final e f48173f;

        static {
            Covode.recordClassIndex(29098);
        }

        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            e eVar;
            Throwable th;
            e eVar2 = (e) obj;
            if (b(i2)) {
                return;
            }
            if (this.f48173f == null || eVar2.f47998j == null) {
                if (a(i2, 8) && a(i2) && eVar2.c() != com.facebook.h.c.f47633a) {
                    this.f48169a.a(this.f48170b, eVar2);
                }
                this.f48362e.b(eVar2, i2);
                return;
            }
            try {
                e eVar3 = this.f48173f;
                k a2 = this.f48171c.a(eVar2.h() + eVar2.f47998j.f47732a);
                a(eVar3.b(), a2, eVar2.f47998j.f47732a);
                a(eVar2.b(), a2, eVar2.h());
                com.facebook.common.h.a a3 = com.facebook.common.h.a.a(a2.a());
                try {
                    eVar = new e(a3);
                    try {
                        eVar.j();
                        this.f48362e.b(eVar, 1);
                        e.d(eVar);
                        com.facebook.common.h.a.c(a3);
                        eVar2.close();
                        this.f48173f.close();
                        this.f48169a.g(this.f48170b);
                    } catch (Throwable th2) {
                        th = th2;
                        e.d(eVar);
                        com.facebook.common.h.a.c(a3);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    eVar = null;
                    e.d(eVar);
                    com.facebook.common.h.a.c(a3);
                    throw th;
                }
            } catch (IOException e2) {
                com.facebook.common.e.a.c("PartialDiskCacheProducer", "Error while merging image data", e2);
                this.f48362e.b(e2);
            } catch (Throwable th4) {
                eVar2.close();
                this.f48173f.close();
                throw th4;
            }
        }

        private void a(InputStream inputStream, OutputStream outputStream, int i2) {
            MethodCollector.i(13100);
            byte[] bArr = (byte[]) this.f48172d.a(16384);
            int i3 = i2;
            while (i3 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i3));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i3 -= read;
                    }
                } catch (Throwable th) {
                    this.f48172d.a(bArr);
                    MethodCollector.o(13100);
                    throw th;
                }
            }
            this.f48172d.a(bArr);
            if (i3 <= 0) {
                MethodCollector.o(13100);
                return;
            }
            IOException iOException = new IOException(com.a.a(null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
            MethodCollector.o(13100);
            throw iOException;
        }

        private a(k<e> kVar, com.facebook.imagepipeline.d.e eVar, com.facebook.c.a.e eVar2, i iVar, com.facebook.common.g.a aVar, e eVar3) {
            super(kVar);
            this.f48169a = eVar;
            this.f48170b = eVar2;
            this.f48171c = iVar;
            this.f48172d = aVar;
            this.f48173f = eVar3;
        }

        /* synthetic */ a(k kVar, com.facebook.imagepipeline.d.e eVar, com.facebook.c.a.e eVar2, i iVar, com.facebook.common.g.a aVar, e eVar3, byte b2) {
            this(kVar, eVar, eVar2, iVar, aVar, eVar3);
        }
    }

    public final void a(k<e> kVar, al alVar, com.facebook.c.a.e eVar, e eVar2) {
        this.f48160e.a(new a(kVar, this.f48156a, eVar, this.f48158c, this.f48159d, eVar2, (byte) 0), alVar);
    }

    static Map<String, String> a(an anVar, String str, boolean z, int i2) {
        if (!anVar.requiresExtraMap(str)) {
            return null;
        }
        if (z) {
            return com.facebook.common.d.f.of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i2));
        }
        return com.facebook.common.d.f.of("cached_value_found", String.valueOf(z));
    }

    public ah(com.facebook.imagepipeline.d.e eVar, f fVar, i iVar, com.facebook.common.g.a aVar, ak<e> akVar) {
        this.f48156a = eVar;
        this.f48157b = fVar;
        this.f48158c = iVar;
        this.f48159d = aVar;
        this.f48160e = akVar;
    }
}
