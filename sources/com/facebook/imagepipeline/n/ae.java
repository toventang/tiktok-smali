package com.facebook.imagepipeline.n;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.common.c;
import com.facebook.imagepipeline.p.b;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class ae<K, T extends Closeable> implements ak<T> {

    /* renamed from: a  reason: collision with root package name */
    final Map<K, ae<K, T>.a> f48138a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final ak<T> f48139b;

    static {
        Covode.recordClassIndex(29087);
    }

    /* access modifiers changed from: protected */
    public abstract T a(T t);

    /* access modifiers changed from: protected */
    public abstract K a(al alVar);

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        final K f48140a;

        /* renamed from: b  reason: collision with root package name */
        public final CopyOnWriteArraySet<Pair<k<T>, al>> f48141b = new CopyOnWriteArraySet<>();

        /* renamed from: c  reason: collision with root package name */
        T f48142c;

        /* renamed from: d  reason: collision with root package name */
        float f48143d;

        /* renamed from: e  reason: collision with root package name */
        public d f48144e;

        /* renamed from: f  reason: collision with root package name */
        ae<K, T>.a.C1182a f48145f;

        /* renamed from: h  reason: collision with root package name */
        private int f48147h;

        static {
            Covode.recordClassIndex(29088);
        }

        public final synchronized List<am> b() {
            MethodCollector.i(13525);
            d dVar = this.f48144e;
            if (dVar == null) {
                MethodCollector.o(13525);
                return null;
            }
            List<am> a2 = dVar.a(e());
            MethodCollector.o(13525);
            return a2;
        }

        public final synchronized List<am> c() {
            MethodCollector.i(13589);
            d dVar = this.f48144e;
            if (dVar == null) {
                MethodCollector.o(13589);
                return null;
            }
            List<am> b2 = dVar.b(f());
            MethodCollector.o(13589);
            return b2;
        }

        public final synchronized List<am> d() {
            MethodCollector.i(13664);
            d dVar = this.f48144e;
            if (dVar == null) {
                MethodCollector.o(13664);
                return null;
            }
            List<am> a2 = dVar.a(g());
            MethodCollector.o(13664);
            return a2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.facebook.imagepipeline.n.ae$a$a  reason: collision with other inner class name */
        public class C1182a extends b<T> {
            static {
                Covode.recordClassIndex(29090);
            }

            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.n.b
            public final void a() {
                MethodCollector.i(12914);
                try {
                    b.a();
                    a aVar = a.this;
                    synchronized (aVar) {
                        try {
                            if (aVar.f48145f == this) {
                                aVar.f48145f = null;
                                aVar.f48144e = null;
                                a.a(aVar.f48142c);
                                aVar.f48142c = null;
                                aVar.a();
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(12914);
                            throw th;
                        }
                    }
                } finally {
                    b.a();
                    MethodCollector.o(12914);
                }
            }

            private C1182a() {
            }

            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.n.b
            public final void a(float f2) {
                MethodCollector.i(13009);
                try {
                    b.a();
                    a aVar = a.this;
                    synchronized (aVar) {
                        try {
                            if (aVar.f48145f == this) {
                                aVar.f48143d = f2;
                                Iterator<Pair<k<T>, al>> it = aVar.f48141b.iterator();
                                while (it.hasNext()) {
                                    Pair<k<T>, al> next = it.next();
                                    synchronized (next) {
                                        try {
                                            ((k) next.first).b(f2);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        } finally {
                            MethodCollector.o(13009);
                        }
                    }
                } finally {
                    b.a();
                    MethodCollector.o(13009);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.n.b
            public final void a(Throwable th) {
                MethodCollector.i(12913);
                try {
                    b.a();
                    ae<K, T>.a aVar = a.this;
                    synchronized (aVar) {
                        try {
                            if (aVar.f48145f == this) {
                                Iterator<Pair<k<T>, al>> it = aVar.f48141b.iterator();
                                aVar.f48141b.clear();
                                ae.this.a(aVar.f48140a, aVar);
                                a.a(aVar.f48142c);
                                aVar.f48142c = null;
                                while (it.hasNext()) {
                                    Pair<k<T>, al> next = it.next();
                                    synchronized (next) {
                                        try {
                                            ((k) next.first).b(th);
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        } finally {
                            MethodCollector.o(12913);
                        }
                    }
                } finally {
                    b.a();
                    MethodCollector.o(12913);
                }
            }

            /* synthetic */ C1182a(a aVar, byte b2) {
                this();
            }

            /* JADX INFO: finally extract failed */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.facebook.imagepipeline.n.ae$a */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.n.b
            public final /* bridge */ /* synthetic */ void a(Object obj, int i2) {
                Closeable closeable = (Closeable) obj;
                try {
                    b.a();
                    a.this.a(this, closeable, i2);
                    b.a();
                } catch (Throwable th) {
                    b.a();
                    throw th;
                }
            }
        }

        private synchronized boolean e() {
            MethodCollector.i(13526);
            Iterator<Pair<k<T>, al>> it = this.f48141b.iterator();
            while (it.hasNext()) {
                if (!((al) it.next().second).f()) {
                    MethodCollector.o(13526);
                    return false;
                }
            }
            MethodCollector.o(13526);
            return true;
        }

        private synchronized boolean f() {
            MethodCollector.i(13663);
            Iterator<Pair<k<T>, al>> it = this.f48141b.iterator();
            while (it.hasNext()) {
                if (((al) it.next().second).h()) {
                    MethodCollector.o(13663);
                    return true;
                }
            }
            MethodCollector.o(13663);
            return false;
        }

        private synchronized c g() {
            c cVar;
            MethodCollector.i(13729);
            cVar = c.LOW;
            Iterator<Pair<k<T>, al>> it = this.f48141b.iterator();
            while (it.hasNext()) {
                cVar = c.getHigherPriority(cVar, ((al) it.next().second).g());
            }
            MethodCollector.o(13729);
            return cVar;
        }

        public final void a() {
            boolean z;
            MethodCollector.i(13524);
            synchronized (this) {
                try {
                    boolean z2 = true;
                    if (this.f48144e == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i.a(z);
                    if (this.f48145f != null) {
                        z2 = false;
                    }
                    i.a(z2);
                    if (this.f48141b.isEmpty()) {
                        ae.this.a(this.f48140a, this);
                        return;
                    }
                    al alVar = (al) this.f48141b.iterator().next().second;
                    this.f48144e = new d(alVar.a(), alVar.b(), alVar.c(), alVar.d(), alVar.e(), e(), f(), g());
                    ae<K, T>.a.C1182a aVar = new C1182a(this, (byte) 0);
                    this.f48145f = aVar;
                    ae.this.f48139b.a(aVar, this.f48144e);
                    MethodCollector.o(13524);
                } finally {
                    MethodCollector.o(13524);
                }
            }
        }

        static void a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        public a(K k2) {
            this.f48140a = k2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.facebook.imagepipeline.n.k<T extends java.io.Closeable> */
        /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: com.facebook.imagepipeline.n.ae */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
            com.facebook.imagepipeline.n.d.b(r6);
            com.facebook.imagepipeline.n.d.d(r4);
            com.facebook.imagepipeline.n.d.c(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
            monitor-enter(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            monitor-enter(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
            if (r3 == r8.f48142c) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
            if (r3 == null) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
            r3 = r8.f48146g.a(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
            monitor-exit(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            if (r3 == null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
            if (r2 <= 0.0f) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
            r9.b(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
            r9.b(r3, r1);
            a(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
            r10.a(new com.facebook.imagepipeline.n.ae.a.AnonymousClass1(r8));
            com.bytedance.frameworks.apm.trace.MethodCollector.o(13522);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(13522);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(com.facebook.imagepipeline.n.k<T> r9, com.facebook.imagepipeline.n.al r10) {
            /*
            // Method dump skipped, instructions count: 124
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.ae.a.a(com.facebook.imagepipeline.n.k, com.facebook.imagepipeline.n.al):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            if (r2.hasNext() == false) goto L_0x0058;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
            r1 = r2.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            ((com.facebook.imagepipeline.n.k) r1.first).b(r6, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(13884);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(13884);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.facebook.imagepipeline.n.ae<K, T>.a.C1182a r5, T r6, int r7) {
            /*
                r4 = this;
                r3 = 13884(0x363c, float:1.9456E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                monitor-enter(r4)
                com.facebook.imagepipeline.n.ae<K, T>$a$a r0 = r4.f48145f     // Catch:{ all -> 0x005c }
                if (r0 == r5) goto L_0x000f
                monitor-exit(r4)     // Catch:{ all -> 0x005c }
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return
            L_0x000f:
                T r0 = r4.f48142c
                a(r0)
                r0 = 0
                r4.f48142c = r0
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.n.k<T>, com.facebook.imagepipeline.n.al>> r0 = r4.f48141b
                java.util.Iterator r2 = r0.iterator()
                boolean r0 = com.facebook.imagepipeline.n.b.b(r7)
                if (r0 == 0) goto L_0x002f
                com.facebook.imagepipeline.n.ae r0 = com.facebook.imagepipeline.n.ae.this
                java.io.Closeable r0 = r0.a(r6)
                r4.f48142c = r0
                r4.f48147h = r7
            L_0x002d:
                monitor-exit(r4)
                goto L_0x003c
            L_0x002f:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.n.k<T>, com.facebook.imagepipeline.n.al>> r0 = r4.f48141b
                r0.clear()
                com.facebook.imagepipeline.n.ae r1 = com.facebook.imagepipeline.n.ae.this
                K r0 = r4.f48140a
                r1.a(r0, r4)
                goto L_0x002d
            L_0x003c:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L_0x0058
                java.lang.Object r1 = r2.next()
                android.util.Pair r1 = (android.util.Pair) r1
                monitor-enter(r1)
                java.lang.Object r0 = r1.first     // Catch:{ all -> 0x0052 }
                com.facebook.imagepipeline.n.k r0 = (com.facebook.imagepipeline.n.k) r0     // Catch:{ all -> 0x0052 }
                r0.b(r6, r7)     // Catch:{ all -> 0x0052 }
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                goto L_0x003c
            L_0x0052:
                r0 = move-exception
                monitor-exit(r1)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                throw r0
            L_0x0058:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return
            L_0x005c:
                r0 = move-exception
                monitor-exit(r4)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.ae.a.a(com.facebook.imagepipeline.n.ae$a$a, java.io.Closeable, int):void");
        }
    }

    protected ae(ak<T> akVar) {
        this.f48139b = akVar;
    }

    private synchronized ae<K, T>.a b(K k2) {
        ae<K, T>.a aVar;
        aVar = new a(k2);
        this.f48138a.put(k2, aVar);
        return aVar;
    }

    public final synchronized ae<K, T>.a a(K k2) {
        return this.f48138a.get(k2);
    }

    public final synchronized void a(K k2, ae<K, T>.a aVar) {
        if (this.f48138a.get(k2) == aVar) {
            this.f48138a.remove(k2);
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<T> kVar, al alVar) {
        boolean z;
        ae<K, T>.a a2;
        try {
            b.a();
            K a3 = a(alVar);
            do {
                z = false;
                synchronized (this) {
                    a2 = a((Object) a3);
                    if (a2 == null) {
                        a2 = b(a3);
                        z = true;
                    }
                }
            } while (!a2.a(kVar, alVar));
            if (z) {
                a2.a();
            }
            b.a();
        } catch (Throwable th) {
            b.a();
            throw th;
        }
    }
}
