package com.facebook.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.h;
import com.facebook.common.d.i;
import com.facebook.common.d.k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class g<T> implements k<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final List<k<c<T>>> f47198a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f47199b = false;

    static {
        Covode.recordClassIndex(28715);
    }

    @Override // com.facebook.common.d.k
    public final /* synthetic */ Object b() {
        return new a();
    }

    public final int hashCode() {
        return this.f47198a.hashCode();
    }

    class a extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        int f47200a;

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<c<T>> f47202c;

        /* renamed from: d  reason: collision with root package name */
        private int f47203d;

        /* renamed from: e  reason: collision with root package name */
        private AtomicInteger f47204e;

        /* renamed from: f  reason: collision with root package name */
        private Throwable f47205f;

        static {
            Covode.recordClassIndex(28716);
        }

        /* access modifiers changed from: package-private */
        public final synchronized c<T> h() {
            c<T> a2;
            MethodCollector.i(3830);
            a2 = a(this.f47200a);
            MethodCollector.o(3830);
            return a2;
        }

        /* access modifiers changed from: package-private */
        public final void i() {
            Throwable th;
            if (this.f47204e.incrementAndGet() == this.f47203d && (th = this.f47205f) != null) {
                a(th);
            }
        }

        @Override // com.facebook.d.c, com.facebook.d.a
        public final synchronized boolean c() {
            MethodCollector.i(4182);
            if (g.this.f47199b) {
                j();
            }
            c<T> h2 = h();
            if (h2 == null || !h2.c()) {
                MethodCollector.o(4182);
                return false;
            }
            MethodCollector.o(4182);
            return true;
        }

        @Override // com.facebook.d.c, com.facebook.d.a
        public final synchronized T d() {
            MethodCollector.i(4066);
            if (g.this.f47199b) {
                j();
            }
            c<T> h2 = h();
            if (h2 != null) {
                T d2 = h2.d();
                MethodCollector.o(4066);
                return d2;
            }
            MethodCollector.o(4066);
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
            if (r1 == null) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            if (r2 >= r1.size()) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            a((com.facebook.d.c) r1.get(r2));
            r2 = r2 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(4186);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            return true;
         */
        @Override // com.facebook.d.c, com.facebook.d.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean g() {
            /*
                r4 = this;
                r3 = 4186(0x105a, float:5.866E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                com.facebook.d.g r0 = com.facebook.d.g.this
                boolean r0 = r0.f47199b
                if (r0 == 0) goto L_0x000e
                r4.j()
            L_0x000e:
                monitor-enter(r4)
                boolean r0 = super.g()     // Catch:{ all -> 0x003a }
                r2 = 0
                if (r0 != 0) goto L_0x001b
                monitor-exit(r4)     // Catch:{ all -> 0x003a }
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                return r2
            L_0x001b:
                java.util.ArrayList<com.facebook.d.c<T>> r1 = r4.f47202c
                r0 = 0
                r4.f47202c = r0
                monitor-exit(r4)
                if (r1 == 0) goto L_0x0035
            L_0x0023:
                int r0 = r1.size()
                if (r2 >= r0) goto L_0x0035
                java.lang.Object r0 = r1.get(r2)
                com.facebook.d.c r0 = (com.facebook.d.c) r0
                a(r0)
                int r2 = r2 + 1
                goto L_0x0023
            L_0x0035:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                r0 = 1
                return r0
            L_0x003a:
                r0 = move-exception
                monitor-exit(r4)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.d.g.a.g():boolean");
        }

        private void j() {
            MethodCollector.i(3827);
            if (this.f47204e != null) {
                MethodCollector.o(3827);
                return;
            }
            synchronized (this) {
                try {
                    if (this.f47204e == null) {
                        this.f47204e = new AtomicInteger(0);
                        int size = g.this.f47198a.size();
                        this.f47203d = size;
                        this.f47200a = size;
                        this.f47202c = new ArrayList<>(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            c<T> b2 = g.this.f47198a.get(i2).b();
                            this.f47202c.add(b2);
                            b2.a(new C1171a(i2), com.facebook.common.b.a.f47054a);
                            if (b2.c()) {
                                break;
                            }
                        }
                    }
                } finally {
                    MethodCollector.o(3827);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.facebook.d.g$a$a  reason: collision with other inner class name */
        public class C1171a implements e<T> {

            /* renamed from: b  reason: collision with root package name */
            private int f47207b;

            static {
                Covode.recordClassIndex(28717);
            }

            @Override // com.facebook.d.e
            public final void onCancellation(c<T> cVar) {
            }

            @Override // com.facebook.d.e
            public final void onFailure(c<T> cVar) {
                a.this.a(this.f47207b, cVar);
            }

            @Override // com.facebook.d.e
            public final void onProgressUpdate(c<T> cVar) {
                if (this.f47207b == 0) {
                    a.this.a(cVar.f());
                }
            }

            @Override // com.facebook.d.e
            public final void onNewResult(c<T> cVar) {
                boolean z;
                MethodCollector.i(3824);
                if (cVar.c()) {
                    a aVar = a.this;
                    int i2 = this.f47207b;
                    boolean b2 = cVar.b();
                    synchronized (aVar) {
                        try {
                            int i3 = aVar.f47200a;
                            if (cVar == aVar.a(i2) && i2 != aVar.f47200a) {
                                if (aVar.h() == null || (b2 && i2 < aVar.f47200a)) {
                                    aVar.f47200a = i2;
                                    i3 = i2;
                                }
                                for (int i4 = aVar.f47200a; i4 > i3; i4--) {
                                    a.a((c) aVar.b(i4));
                                }
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(3824);
                            throw th;
                        }
                    }
                    if (cVar == aVar.h()) {
                        if (i2 != 0 || !cVar.b()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        aVar.a((Object) null, z);
                    }
                    aVar.i();
                    MethodCollector.o(3824);
                    return;
                }
                if (cVar.b()) {
                    a.this.a(this.f47207b, cVar);
                }
                MethodCollector.o(3824);
            }

            public C1171a(int i2) {
                this.f47207b = i2;
            }
        }

        static void a(c<T> cVar) {
            if (cVar != null) {
                cVar.g();
            }
        }

        public a() {
            if (!g.this.f47199b) {
                j();
            }
        }

        /* access modifiers changed from: package-private */
        public final synchronized c<T> a(int i2) {
            MethodCollector.i(3828);
            ArrayList<c<T>> arrayList = this.f47202c;
            if (arrayList == null || i2 >= arrayList.size()) {
                MethodCollector.o(3828);
                return null;
            }
            c<T> cVar = this.f47202c.get(i2);
            MethodCollector.o(3828);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        public final synchronized c<T> b(int i2) {
            MethodCollector.i(3829);
            ArrayList<c<T>> arrayList = this.f47202c;
            if (arrayList == null || i2 >= arrayList.size()) {
                MethodCollector.o(3829);
                return null;
            }
            c<T> cVar = this.f47202c.set(i2, null);
            MethodCollector.o(3829);
            return cVar;
        }

        public final void a(int i2, c<T> cVar) {
            a((c) b(i2, cVar));
            if (i2 == 0) {
                this.f47205f = cVar.e();
            }
            i();
        }

        private synchronized c<T> b(int i2, c<T> cVar) {
            MethodCollector.i(4227);
            if (cVar == h()) {
                MethodCollector.o(4227);
                return null;
            } else if (cVar == a(i2)) {
                c<T> b2 = b(i2);
                MethodCollector.o(4227);
                return b2;
            } else {
                MethodCollector.o(4227);
                return cVar;
            }
        }
    }

    public final String toString() {
        return h.a(this).a("list", this.f47198a).toString();
    }

    public g(List<k<c<T>>> list) {
        i.a(!list.isEmpty(), "List of suppliers is empty!");
        this.f47198a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return h.a(this.f47198a, ((g) obj).f47198a);
    }
}
