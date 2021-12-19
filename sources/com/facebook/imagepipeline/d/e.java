package com.facebook.imagepipeline.d;

import com.bytedance.covode.number.Covode;
import com.facebook.c.a.k;
import com.facebook.common.e.a;
import com.facebook.common.g.h;
import com.facebook.common.g.i;
import com.facebook.common.g.l;
import com.facebook.imagepipeline.p.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class e {

    /* renamed from: d  reason: collision with root package name */
    public static final Class<?> f47767d = e.class;

    /* renamed from: a  reason: collision with root package name */
    private final i f47768a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f47769b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f47770c;

    /* renamed from: e  reason: collision with root package name */
    public final com.facebook.c.b.i f47771e;

    /* renamed from: f  reason: collision with root package name */
    public final l f47772f;

    /* renamed from: g  reason: collision with root package name */
    public final v f47773g = new v();

    /* renamed from: h  reason: collision with root package name */
    public final n f47774h;

    static {
        Covode.recordClassIndex(28936);
    }

    public final b.i<Void> a() {
        this.f47773g.a();
        try {
            return b.i.b(new Callable<Void>() {
                /* class com.facebook.imagepipeline.d.e.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(28941);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    e.this.f47773g.a();
                    e.this.f47771e.c();
                    return null;
                }
            }, this.f47770c);
        } catch (Exception e2) {
            a.a(f47767d, e2, "Failed to schedule disk-cache clear", new Object[0]);
            return b.i.a(e2);
        }
    }

    public final boolean e(com.facebook.c.a.e eVar) {
        if (c(eVar)) {
            return true;
        }
        return f(eVar);
    }

    public final boolean c(com.facebook.c.a.e eVar) {
        if (this.f47773g.c(eVar) || this.f47771e.c(eVar)) {
            return true;
        }
        return false;
    }

    public final b.i<Boolean> d(com.facebook.c.a.e eVar) {
        if (c(eVar)) {
            return b.i.a((Object) true);
        }
        return b(eVar);
    }

    private b.i<Boolean> b(final com.facebook.c.a.e eVar) {
        try {
            return b.i.b(new Callable<Boolean>() {
                /* class com.facebook.imagepipeline.d.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28937);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Boolean call() {
                    return Boolean.valueOf(e.this.f(eVar));
                }
            }, this.f47769b);
        } catch (Exception e2) {
            a.a(f47767d, e2, "Failed to schedule disk-cache read for %s", eVar.a());
            return b.i.a(e2);
        }
    }

    public final boolean f(com.facebook.c.a.e eVar) {
        com.facebook.imagepipeline.j.e b2 = this.f47773g.b(eVar);
        if (b2 != null) {
            b2.close();
            a.a(f47767d, "Found image for %s in staging area", eVar.a());
            return true;
        }
        a.a(f47767d, "Did not find image for %s in staging area", eVar.a());
        try {
            return this.f47771e.d(eVar);
        } catch (Exception unused) {
            return false;
        }
    }

    public final b.i<Void> g(final com.facebook.c.a.e eVar) {
        com.facebook.common.d.i.a(eVar);
        this.f47773g.a(eVar);
        try {
            return b.i.b(new Callable<Void>() {
                /* class com.facebook.imagepipeline.d.e.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(28940);
                }

                /* JADX INFO: finally extract failed */
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    try {
                        b.a();
                        e.this.f47773g.a(eVar);
                        e.this.f47771e.b(eVar);
                        b.a();
                        return null;
                    } catch (Throwable th) {
                        b.a();
                        throw th;
                    }
                }
            }, this.f47770c);
        } catch (Exception e2) {
            a.a(f47767d, e2, "Failed to schedule disk-cache remove for %s", eVar.a());
            return b.i.a(e2);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public h a(com.facebook.c.a.e eVar) {
        try {
            Class<?> cls = f47767d;
            a.a(cls, "Disk cache read for %s", eVar.a());
            com.facebook.b.a a2 = this.f47771e.a(eVar);
            if (a2 == null) {
                a.a(cls, "Disk cache miss for %s", eVar.a());
                this.f47774h.g();
                return null;
            }
            a.a(cls, "Found entry in disk cache for %s", eVar.a());
            this.f47774h.f();
            InputStream a3 = a2.a();
            try {
                h a4 = this.f47768a.a(a3, (int) a2.b());
                a3.close();
                a.a(cls, "Successful read from disk cache for %s", eVar.a());
                return a4;
            } catch (Throwable th) {
                a3.close();
                throw th;
            }
        } catch (IOException e2) {
            a.a(f47767d, e2, "Exception reading from cache for %s", eVar.a());
            throw e2;
        }
    }

    private b.i<com.facebook.imagepipeline.j.e> b(final com.facebook.c.a.e eVar, final AtomicBoolean atomicBoolean) {
        try {
            return b.i.b(new Callable<com.facebook.imagepipeline.j.e>() {
                /* class com.facebook.imagepipeline.d.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(28938);
                }

                /* JADX INFO: finally extract failed */
                /* access modifiers changed from: private */
                /* renamed from: a */
                public com.facebook.imagepipeline.j.e call() {
                    try {
                        b.a();
                        if (!atomicBoolean.get()) {
                            com.facebook.imagepipeline.j.e b2 = e.this.f47773g.b(eVar);
                            if (b2 != null) {
                                a.a(e.f47767d, "Found image for %s in staging area", eVar.a());
                            } else {
                                a.a(e.f47767d, "Did not find image for %s in staging area", eVar.a());
                                try {
                                    com.facebook.common.h.a a2 = com.facebook.common.h.a.a(e.this.a(eVar));
                                    try {
                                        b2 = new com.facebook.imagepipeline.j.e(a2);
                                    } finally {
                                        com.facebook.common.h.a.c(a2);
                                    }
                                } catch (Exception unused) {
                                    b.a();
                                    return null;
                                }
                            }
                            if (Thread.interrupted()) {
                                a.a(e.f47767d, "Host thread was interrupted, decreasing reference count");
                                b2.close();
                                throw new InterruptedException();
                            }
                            b.a();
                            return b2;
                        }
                        throw new CancellationException();
                    } catch (Throwable th) {
                        b.a();
                        throw th;
                    }
                }
            }, this.f47769b);
        } catch (Exception e2) {
            a.a(f47767d, e2, "Failed to schedule disk-cache read for %s", eVar.a());
            return b.i.a(e2);
        }
    }

    /* JADX INFO: finally extract failed */
    public b.i<com.facebook.imagepipeline.j.e> a(com.facebook.c.a.e eVar, AtomicBoolean atomicBoolean) {
        try {
            b.a();
            com.facebook.imagepipeline.j.e b2 = this.f47773g.b(eVar);
            if (b2 != null) {
                a.a(f47767d, "Found image for %s in staging area", eVar.a());
                b.i<com.facebook.imagepipeline.j.e> a2 = b.i.a(b2);
                b.a();
                return a2;
            }
            b.i<com.facebook.imagepipeline.j.e> b3 = b(eVar, atomicBoolean);
            b.a();
            return b3;
        } catch (Throwable th) {
            b.a();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(final com.facebook.c.a.e eVar, com.facebook.imagepipeline.j.e eVar2) {
        try {
            b.a();
            com.facebook.common.d.i.a(eVar);
            com.facebook.common.d.i.a(com.facebook.imagepipeline.j.e.e(eVar2));
            this.f47773g.a(eVar, eVar2);
            final com.facebook.imagepipeline.j.e a2 = com.facebook.imagepipeline.j.e.a(eVar2);
            try {
                this.f47770c.execute(new Runnable() {
                    /* class com.facebook.imagepipeline.d.e.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(28939);
                    }

                    public final void run() {
                        try {
                            b.a();
                            e eVar = e.this;
                            com.facebook.c.a.e eVar2 = eVar;
                            com.facebook.imagepipeline.j.e eVar3 = a2;
                            a.a(e.f47767d, "About to write to disk-cache for key %s", eVar2.a());
                            try {
                                eVar.f47771e.a(eVar2, new k(eVar3) {
                                    /* class com.facebook.imagepipeline.d.e.AnonymousClass6 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ com.facebook.imagepipeline.j.e f47786a;

                                    static {
                                        Covode.recordClassIndex(28942);
                                    }

                                    @Override // com.facebook.c.a.k
                                    public final void a(OutputStream outputStream) {
                                        e.this.f47772f.a(this.f47786a.b(), outputStream);
                                    }

                                    {
                                        this.f47786a = r2;
                                    }
                                });
                                a.a(e.f47767d, "Successful disk-cache write for key %s", eVar2.a());
                            } catch (IOException e2) {
                                a.a(e.f47767d, e2, "Failed to write to disk-cache for key %s", eVar2.a());
                            }
                        } finally {
                            e.this.f47773g.b(eVar, a2);
                            com.facebook.imagepipeline.j.e.d(a2);
                            b.a();
                        }
                    }
                });
            } catch (Exception e2) {
                a.a(f47767d, e2, "Failed to schedule disk-cache write for %s", eVar.a());
                this.f47773g.b(eVar, eVar2);
                com.facebook.imagepipeline.j.e.d(a2);
            }
            b.a();
        } catch (Throwable th) {
            b.a();
            throw th;
        }
    }

    public e(com.facebook.c.b.i iVar, i iVar2, l lVar, Executor executor, Executor executor2, n nVar) {
        this.f47771e = iVar;
        this.f47768a = iVar2;
        this.f47772f = lVar;
        this.f47769b = executor;
        this.f47770c = executor2;
        this.f47774h = nVar;
    }
}
