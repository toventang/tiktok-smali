package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.g.i;
import com.facebook.common.g.k;
import com.facebook.common.k.f;
import com.facebook.h.b;
import com.facebook.h.c;
import com.facebook.h.d;
import com.facebook.imagepipeline.j.e;
import java.io.InputStream;
import java.util.concurrent.Executor;

public final class be implements ak<e> {

    /* renamed from: a  reason: collision with root package name */
    final Executor f48299a;

    /* renamed from: b  reason: collision with root package name */
    public final i f48300b;

    /* renamed from: c  reason: collision with root package name */
    private final ak<e> f48301c;

    static {
        Covode.recordClassIndex(29146);
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<e> kVar, al alVar) {
        this.f48301c.a(new a(kVar, alVar), alVar);
    }

    class a extends n<e, e> {

        /* renamed from: b  reason: collision with root package name */
        private final al f48305b;

        /* renamed from: c  reason: collision with root package name */
        private f f48306c = f.UNSET;

        static {
            Covode.recordClassIndex(29148);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            f fVar;
            e eVar = (e) obj;
            if (this.f48306c == f.UNSET && eVar != null) {
                com.facebook.common.d.i.a(eVar);
                c a2 = d.a(eVar.b());
                if (b.b(a2)) {
                    com.facebook.imagepipeline.nativecode.c cVar = com.facebook.imagepipeline.nativecode.d.f48440a;
                    if (cVar != null) {
                        fVar = f.valueOf(!cVar.isWebpNativelySupported(a2));
                    }
                    fVar = f.NO;
                } else {
                    if (a2 == c.f47633a) {
                        fVar = f.UNSET;
                    }
                    fVar = f.NO;
                }
                this.f48306c = fVar;
            }
            if (this.f48306c != f.NO) {
                if (!a(i2)) {
                    return;
                }
                if (this.f48306c == f.YES && eVar != null) {
                    be beVar = be.this;
                    k<O> kVar = this.f48362e;
                    al alVar = this.f48305b;
                    com.facebook.common.d.i.a(eVar);
                    beVar.f48299a.execute(new av<e>(kVar, alVar.c(), "WebpTranscodeProducer", alVar.b(), e.a(eVar)) {
                        /* class com.facebook.imagepipeline.n.be.AnonymousClass1 */

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ e f48302b;

                        static {
                            Covode.recordClassIndex(29147);
                        }

                        @Override // com.facebook.common.b.h, com.facebook.imagepipeline.n.av
                        public final void b() {
                            e.d(this.f48302b);
                            super.b();
                        }

                        /* JADX INFO: finally extract failed */
                        /* access modifiers changed from: private */
                        /* renamed from: d */
                        public e c() {
                            k a2 = be.this.f48300b.a();
                            try {
                                e eVar = this.f48302b;
                                InputStream b2 = eVar.b();
                                c a3 = d.a(b2);
                                if (a3 == b.f47626f || a3 == b.f47628h) {
                                    com.facebook.imagepipeline.nativecode.d.f48440a.transcodeWebpToJpeg(b2, a2, 80);
                                    eVar.f47991c = b.f47621a;
                                } else if (a3 == b.f47627g || a3 == b.f47629i) {
                                    com.facebook.imagepipeline.nativecode.d.f48440a.transcodeWebpToPng(b2, a2);
                                    eVar.f47991c = b.f47622b;
                                } else {
                                    throw new IllegalArgumentException("Wrong image format");
                                }
                                com.facebook.common.h.a a4 = com.facebook.common.h.a.a(a2.a());
                                try {
                                    e eVar2 = new e(a4);
                                    eVar2.b(this.f48302b);
                                    com.facebook.common.h.a.c(a4);
                                    return eVar2;
                                } catch (Throwable th) {
                                    com.facebook.common.h.a.c(a4);
                                    throw th;
                                }
                            } finally {
                                a2.close();
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.common.b.h, com.facebook.imagepipeline.n.av
                        public final /* synthetic */ void b(e eVar) {
                            e.d(eVar);
                        }

                        @Override // com.facebook.common.b.h, com.facebook.imagepipeline.n.av
                        public final void a(Exception exc) {
                            e.d(this.f48302b);
                            super.a(exc);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.facebook.common.b.h, com.facebook.imagepipeline.n.av
                        public final /* synthetic */ void a(e eVar) {
                            e.d(this.f48302b);
                            super.a(eVar);
                        }

                        {
                            this.f48302b = r6;
                        }
                    });
                    return;
                }
            }
            this.f48362e.b(eVar, i2);
        }

        public a(k<e> kVar, al alVar) {
            super(kVar);
            this.f48305b = alVar;
        }
    }

    public be(Executor executor, i iVar, ak<e> akVar) {
        this.f48299a = (Executor) com.facebook.common.d.i.a(executor);
        this.f48300b = (i) com.facebook.common.d.i.a(iVar);
        this.f48301c = (ak) com.facebook.common.d.i.a(akVar);
    }
}
