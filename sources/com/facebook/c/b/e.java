package com.facebook.c.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.d;
import com.facebook.c.a.f;
import com.facebook.c.a.k;
import com.facebook.c.b.d;
import com.facebook.common.time.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class e implements i {

    /* renamed from: e  reason: collision with root package name */
    private static final Class<?> f47004e = e.class;

    /* renamed from: f  reason: collision with root package name */
    private static final long f47005f = TimeUnit.HOURS.toMillis(2);

    /* renamed from: g  reason: collision with root package name */
    private static final long f47006g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f47007a;

    /* renamed from: b  reason: collision with root package name */
    final Set<String> f47008b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f47009c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f47010d;

    /* renamed from: h  reason: collision with root package name */
    private final long f47011h;

    /* renamed from: i  reason: collision with root package name */
    private final long f47012i;

    /* renamed from: j  reason: collision with root package name */
    private long f47013j;

    /* renamed from: k  reason: collision with root package name */
    private final d f47014k;

    /* renamed from: l  reason: collision with root package name */
    private long f47015l;

    /* renamed from: m  reason: collision with root package name */
    private final long f47016m;
    private final com.facebook.common.i.a n;
    private final d o;
    private final h p;
    private final com.facebook.c.a.b q;
    private final boolean r;
    private final a s;
    private final com.facebook.common.time.a t;

    @Override // com.facebook.common.a.a
    public final void e() {
        c();
    }

    @Override // com.facebook.c.b.i
    public final long a() {
        return this.s.c();
    }

    @Override // com.facebook.c.b.i
    public final long b() {
        return this.s.d();
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f47018a;

        /* renamed from: b  reason: collision with root package name */
        private long f47019b = -1;

        /* renamed from: c  reason: collision with root package name */
        private long f47020c = -1;

        static {
            Covode.recordClassIndex(28596);
        }

        a() {
        }

        public final synchronized boolean a() {
            boolean z;
            MethodCollector.i(2341);
            z = this.f47018a;
            MethodCollector.o(2341);
            return z;
        }

        public final synchronized long c() {
            long j2;
            MethodCollector.i(2355);
            j2 = this.f47019b;
            MethodCollector.o(2355);
            return j2;
        }

        public final synchronized long d() {
            long j2;
            MethodCollector.i(2363);
            j2 = this.f47020c;
            MethodCollector.o(2363);
            return j2;
        }

        public final synchronized void b() {
            MethodCollector.i(2344);
            this.f47018a = false;
            this.f47020c = -1;
            this.f47019b = -1;
            MethodCollector.o(2344);
        }

        public final synchronized void a(long j2, long j3) {
            MethodCollector.i(2347);
            this.f47020c = j3;
            this.f47019b = j2;
            this.f47018a = true;
            MethodCollector.o(2347);
        }

        public final synchronized void b(long j2, long j3) {
            MethodCollector.i(2354);
            if (this.f47018a) {
                this.f47019b += j2;
                this.f47020c += j3;
            }
            MethodCollector.o(2354);
        }
    }

    static {
        Covode.recordClassIndex(28594);
    }

    @Override // com.facebook.c.b.i
    public final void c() {
        MethodCollector.i(586);
        synchronized (this.f47009c) {
            try {
                this.o.c();
                this.f47008b.clear();
            } catch (IOException | NullPointerException e2) {
                e2.getMessage();
            } catch (Throwable th) {
                MethodCollector.o(586);
                throw th;
            }
            this.s.b();
        }
        MethodCollector.o(586);
    }

    public final boolean f() {
        long a2 = this.t.a();
        if (this.s.a()) {
            long j2 = this.f47015l;
            if (j2 != -1 && a2 - j2 <= f47006g) {
                return false;
            }
        }
        return g();
    }

    @Override // com.facebook.common.a.a
    public final void d() {
        MethodCollector.i(1172);
        synchronized (this.f47009c) {
            try {
                f();
                long c2 = this.s.c();
                long j2 = this.f47016m;
                if (j2 > 0 && c2 > 0) {
                    if (c2 >= j2) {
                        double d2 = (double) j2;
                        double d3 = (double) c2;
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        double d4 = 1.0d - (d2 / d3);
                        if (d4 > 0.02d) {
                            synchronized (this.f47009c) {
                                try {
                                    this.s.b();
                                    f();
                                    long c3 = this.s.c();
                                    double d5 = (double) c3;
                                    Double.isNaN(d5);
                                    a(c3 - ((long) (d4 * d5)), d.a.CACHE_MANAGER_TRIMMED);
                                } catch (IOException e2) {
                                    e2.getMessage();
                                } catch (Throwable th) {
                                    MethodCollector.o(1172);
                                    throw th;
                                }
                            }
                        }
                        MethodCollector.o(1172);
                    }
                }
            } finally {
                MethodCollector.o(1172);
            }
        }
    }

    private boolean g() {
        Set<String> set;
        Set<String> set2;
        long a2 = this.t.a();
        long j2 = f47005f + a2;
        if (this.r && this.f47008b.isEmpty()) {
            set = this.f47008b;
        } else if (this.r) {
            set = new HashSet<>();
        } else {
            set = null;
        }
        try {
            long j3 = 0;
            long j4 = -1;
            int i2 = 0;
            for (d.a aVar : this.o.d()) {
                i2++;
                j3 += aVar.c();
                if (aVar.b() > j2) {
                    aVar.c();
                    j4 = Math.max(aVar.b() - a2, j4);
                } else if (this.r) {
                    set.add(aVar.a());
                }
            }
            long j5 = (long) i2;
            if (!(this.s.d() == j5 && this.s.c() == j3)) {
                if (this.r && (set2 = this.f47008b) != set) {
                    set2.clear();
                    this.f47008b.addAll(set);
                }
                this.s.a(j3, j5);
            }
            this.f47015l = a2;
            return true;
        } catch (IOException e2) {
            e2.getMessage();
            return false;
        }
    }

    @Override // com.facebook.c.b.i
    public final void b(com.facebook.c.a.e eVar) {
        MethodCollector.i(514);
        synchronized (this.f47009c) {
            try {
                List<String> a2 = f.a(eVar);
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    String str = a2.get(i2);
                    this.o.b(str);
                    this.f47008b.remove(str);
                }
            } catch (IOException e2) {
                e2.getMessage();
            } catch (Throwable th) {
                MethodCollector.o(514);
                throw th;
            }
        }
        MethodCollector.o(514);
    }

    private Collection<d.a> a(Collection<d.a> collection) {
        long a2 = this.t.a() + f47005f;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (d.a aVar : collection) {
            if (aVar.b() > a2) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.p.a());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.c.b.i
    public final boolean c(com.facebook.c.a.e eVar) {
        MethodCollector.i(1084);
        synchronized (this.f47009c) {
            try {
                List<String> a2 = f.a(eVar);
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    if (this.f47008b.contains(a2.get(i2))) {
                        MethodCollector.o(1084);
                        return true;
                    }
                }
                MethodCollector.o(1084);
                return false;
            } catch (Throwable th) {
                MethodCollector.o(1084);
                throw th;
            }
        }
    }

    @Override // com.facebook.c.b.i
    public final boolean d(com.facebook.c.a.e eVar) {
        MethodCollector.i(1116);
        synchronized (this.f47009c) {
            try {
                if (c(eVar)) {
                    return true;
                }
                try {
                    List<String> a2 = f.a(eVar);
                    for (int i2 = 0; i2 < a2.size(); i2++) {
                        String str = a2.get(i2);
                        if (this.o.c(str, eVar)) {
                            this.f47008b.add(str);
                            MethodCollector.o(1116);
                            return true;
                        }
                    }
                    MethodCollector.o(1116);
                    return false;
                } catch (IOException unused) {
                    MethodCollector.o(1116);
                    return false;
                }
            } finally {
                MethodCollector.o(1116);
            }
        }
    }

    @Override // com.facebook.c.b.i
    public final com.facebook.b.a a(com.facebook.c.a.e eVar) {
        com.facebook.b.a aVar;
        MethodCollector.i(6);
        j b2 = j.b();
        b2.f47035a = eVar;
        try {
            synchronized (this.f47009c) {
                try {
                    List<String> a2 = f.a(eVar);
                    int i2 = 0;
                    String str = null;
                    aVar = null;
                    while (true) {
                        if (i2 >= a2.size()) {
                            this.f47008b.remove(str);
                            break;
                        }
                        str = a2.get(i2);
                        b2.f47036b = str;
                        aVar = this.o.b(str, eVar);
                        if (aVar != null) {
                            this.f47008b.add(str);
                            break;
                        }
                        i2++;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6);
                    throw th;
                }
            }
            return aVar;
        } catch (IOException e2) {
            b2.f47040f = e2;
            return null;
        } finally {
            b2.c();
            MethodCollector.o(6);
        }
    }

    private com.facebook.b.a a(d.b bVar, String str) {
        com.facebook.b.a a2;
        MethodCollector.i(449);
        synchronized (this.f47009c) {
            try {
                a2 = bVar.a();
                this.f47008b.add(str);
                this.s.b(a2.b(), 1);
            } finally {
                MethodCollector.o(449);
            }
        }
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.c.b.d.b a(java.lang.String r13, com.facebook.c.a.e r14) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.c.b.e.a(java.lang.String, com.facebook.c.a.e):com.facebook.c.b.d$b");
    }

    private void a(long j2, d.a aVar) {
        try {
            Collection<d.a> a2 = a(this.o.d());
            long c2 = this.s.c();
            long j3 = c2 - j2;
            int i2 = 0;
            long j4 = 0;
            for (d.a aVar2 : a2) {
                if (j4 > j3) {
                    break;
                }
                long a3 = this.o.a(aVar2);
                this.f47008b.remove(aVar2.a());
                if (a3 > 0) {
                    i2++;
                    j4 += a3;
                    j b2 = j.b();
                    b2.f47036b = aVar2.a();
                    b2.f47041g = aVar;
                    b2.f47037c = a3;
                    b2.f47039e = c2 - j4;
                    b2.f47038d = j2;
                    b2.c();
                }
            }
            this.s.b(-j4, (long) (-i2));
            this.o.b();
        } catch (IOException e2) {
            e2.getMessage();
            throw e2;
        }
    }

    @Override // com.facebook.c.b.i
    public final com.facebook.b.a a(com.facebook.c.a.e eVar, k kVar) {
        String b2;
        MethodCollector.i(502);
        j b3 = j.b();
        b3.f47035a = eVar;
        synchronized (this.f47009c) {
            try {
                b2 = f.b(eVar);
            } finally {
                MethodCollector.o(502);
            }
        }
        b3.f47036b = b2;
        try {
            d.b a2 = a(b2, eVar);
            try {
                a2.a(kVar);
                com.facebook.b.a a3 = a(a2, b2);
                b3.f47037c = a3.b();
                b3.f47039e = this.s.c();
                this.f47014k.a(b3);
                if (!a2.b()) {
                    com.facebook.common.e.a.c(f47004e, "Failed to delete temp file");
                }
                b3.c();
                MethodCollector.o(502);
                return a3;
            } catch (Throwable th) {
                if (!a2.b()) {
                    com.facebook.common.e.a.c(f47004e, "Failed to delete temp file");
                }
                throw th;
            }
        } catch (IOException e2) {
            b3.f47040f = e2;
            com.facebook.common.e.a.b(f47004e, "Failed inserting a file into the cache", e2);
            MethodCollector.o(502);
            throw e2;
        } catch (Throwable th2) {
            b3.c();
            MethodCollector.o(502);
            throw th2;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f47021a;

        /* renamed from: b  reason: collision with root package name */
        public final long f47022b;

        /* renamed from: c  reason: collision with root package name */
        public final long f47023c;

        static {
            Covode.recordClassIndex(28597);
        }

        public b(long j2, long j3, long j4) {
            this.f47021a = j2;
            this.f47022b = j3;
            this.f47023c = j4;
        }
    }

    public e(d dVar, h hVar, b bVar, com.facebook.c.a.d dVar2, com.facebook.c.a.b bVar2, Executor executor, boolean z) {
        this.f47011h = bVar.f47022b;
        this.f47012i = bVar.f47023c;
        this.f47013j = bVar.f47023c;
        this.n = com.facebook.common.i.a.a();
        this.o = dVar;
        this.p = hVar;
        this.f47015l = -1;
        this.f47014k = dVar2;
        this.f47016m = bVar.f47021a;
        this.q = bVar2;
        this.s = new a();
        this.t = c.f47146a;
        this.r = z;
        this.f47008b = new HashSet();
        if (z) {
            this.f47007a = new CountDownLatch(1);
            executor.execute(new Runnable() {
                /* class com.facebook.c.b.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28595);
                }

                public final void run() {
                    MethodCollector.i(2335);
                    synchronized (e.this.f47009c) {
                        try {
                            e.this.f();
                        } catch (Throwable th) {
                            MethodCollector.o(2335);
                            throw th;
                        }
                    }
                    e.this.f47010d = true;
                    e.this.f47007a.countDown();
                    MethodCollector.o(2335);
                }
            });
            return;
        }
        this.f47007a = new CountDownLatch(0);
    }
}
