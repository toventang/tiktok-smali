package com.facebook.c.b;

import com.bytedance.covode.number.Covode;
import com.facebook.common.e.a;
import com.facebook.common.g.h;
import com.facebook.common.g.i;
import com.facebook.imagepipeline.d.e;
import com.facebook.imagepipeline.d.n;
import com.facebook.imagepipeline.d.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class k extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f47043a = k.class;

    /* renamed from: b  reason: collision with root package name */
    public final v f47044b;

    /* renamed from: c  reason: collision with root package name */
    public final n f47045c;

    /* renamed from: i  reason: collision with root package name */
    private final i f47046i;

    /* renamed from: j  reason: collision with root package name */
    private final i f47047j;

    /* renamed from: k  reason: collision with root package name */
    private final Executor f47048k;

    static {
        Covode.recordClassIndex(28604);
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.d.e
    public final h a(com.facebook.c.a.e eVar) {
        try {
            Class<?> cls = f47043a;
            a.a(cls, "Disk cache read for %s", eVar.toString());
            com.facebook.b.a a2 = this.f47046i.a(eVar);
            if (a2 == null) {
                a.a(cls, "Disk cache miss for %s", eVar.toString());
                this.f47045c.g();
                return null;
            }
            a.a(cls, "Found entry in disk cache for %s", eVar.toString());
            this.f47045c.f();
            InputStream a3 = a2.a();
            try {
                h a4 = this.f47047j.a(a3, (int) a2.b());
                a3.close();
                a.a(cls, "Successful read from disk cache for %s", eVar.toString());
                return a4;
            } catch (Throwable th) {
                a3.close();
                throw th;
            }
        } catch (IOException e2) {
            a.a(f47043a, e2, "Exception reading from cache for %s", eVar.toString());
            throw e2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final h b(com.facebook.c.a.e eVar) {
        try {
            Class<?> cls = f47043a;
            a.a(cls, "Disk temp file cache read for %s", eVar.toString());
            i iVar = this.f47046i;
            if (!(iVar instanceof l)) {
                return null;
            }
            com.facebook.b.a f2 = ((l) iVar).f();
            if (f2 == null) {
                a.a(cls, "Disk temp file cache miss for %s", eVar.toString());
                return null;
            }
            a.a(cls, "Found temp file entry in disk cache for %s", eVar.toString());
            InputStream a2 = f2.a();
            try {
                h a3 = this.f47047j.a(a2, (int) f2.b());
                a2.close();
                a.a(cls, "Successful read temp file from disk cache for %s", eVar.toString());
                return a3;
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        } catch (IOException e2) {
            a.a(f47043a, e2, "Exception reading temp file from cache for %s", eVar.toString());
            return null;
        }
    }

    private static b.i<com.facebook.imagepipeline.j.e> b(com.facebook.c.a.e eVar, com.facebook.imagepipeline.j.e eVar2) {
        a.a(f47043a, "Found image for %s in staging area", eVar.toString());
        return b.i.a(eVar2);
    }

    @Override // com.facebook.imagepipeline.d.e
    public final b.i<com.facebook.imagepipeline.j.e> a(com.facebook.c.a.e eVar, AtomicBoolean atomicBoolean) {
        com.facebook.imagepipeline.j.e b2 = this.f47044b.b(eVar);
        if (b2 != null) {
            return b(eVar, b2);
        }
        return a(eVar, atomicBoolean, true);
    }

    public final b.i<com.facebook.imagepipeline.j.e> b(com.facebook.c.a.e eVar, AtomicBoolean atomicBoolean) {
        com.facebook.imagepipeline.j.e b2 = this.f47044b.b(eVar);
        if (b2 != null) {
            return b(eVar, b2);
        }
        return a(eVar, atomicBoolean, false);
    }

    private b.i<com.facebook.imagepipeline.j.e> a(final com.facebook.c.a.e eVar, final AtomicBoolean atomicBoolean, final boolean z) {
        try {
            return b.i.b(new Callable<com.facebook.imagepipeline.j.e>() {
                /* class com.facebook.c.b.k.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28605);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public com.facebook.imagepipeline.j.e call() {
                    if (!atomicBoolean.get()) {
                        com.facebook.imagepipeline.j.e b2 = k.this.f47044b.b(eVar);
                        if (b2 != null) {
                            a.a(k.f47043a, "Found image for %s in staging area", eVar.toString());
                        } else {
                            a.a(k.f47043a, "Did not find image for %s in staging area", eVar.toString());
                            try {
                                h a2 = k.this.a(eVar);
                                if (a2 != null || z) {
                                    com.facebook.common.h.a a3 = com.facebook.common.h.a.a(a2);
                                    try {
                                        b2 = new com.facebook.imagepipeline.j.e(a3);
                                    } finally {
                                        com.facebook.common.h.a.c(a3);
                                    }
                                } else {
                                    h b3 = k.this.b(eVar);
                                    if (b3 != null) {
                                        com.facebook.common.h.a a4 = com.facebook.common.h.a.a(b3);
                                        try {
                                            b2 = new m(a4);
                                        } finally {
                                            com.facebook.common.h.a.c(a4);
                                        }
                                    }
                                    return b2;
                                }
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                        if (!Thread.interrupted()) {
                            return b2;
                        }
                        a.a(k.f47043a, "Host thread was interrupted, decreasing reference count");
                        b2.close();
                        throw new InterruptedException();
                    }
                    throw new CancellationException();
                }
            }, this.f47048k);
        } catch (Exception e2) {
            a.a(f47043a, e2, "Failed to schedule disk-cache read for %s", eVar.toString());
            return b.i.a(e2);
        }
    }
}
