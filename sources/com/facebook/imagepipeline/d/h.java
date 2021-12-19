package com.facebook.imagepipeline.d;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.common.d.j;
import com.facebook.common.d.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class h<K, V> implements com.facebook.common.g.c, p<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final long f47791a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b  reason: collision with root package name */
    final g<K, b<K, V>> f47792b;

    /* renamed from: c  reason: collision with root package name */
    final g<K, b<K, V>> f47793c;

    /* renamed from: d  reason: collision with root package name */
    final Map<Bitmap, Object> f47794d = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    protected q f47795e;

    /* renamed from: f  reason: collision with root package name */
    private final w<V> f47796f;

    /* renamed from: g  reason: collision with root package name */
    private final a f47797g;

    /* renamed from: h  reason: collision with root package name */
    private final k<q> f47798h;

    /* renamed from: i  reason: collision with root package name */
    private long f47799i;

    public interface a {
        static {
            Covode.recordClassIndex(28948);
        }

        double a(com.facebook.common.g.b bVar);
    }

    public interface c<K> {
        static {
            Covode.recordClassIndex(28950);
        }

        void a(K k2, boolean z);
    }

    public final void a(b<K, V> bVar) {
        boolean c2;
        com.facebook.common.h.a<V> h2;
        MethodCollector.i(2770);
        i.a(bVar);
        synchronized (this) {
            try {
                g(bVar);
                c2 = c((b) bVar);
                h2 = h(bVar);
            } catch (Throwable th) {
                MethodCollector.o(2770);
                throw th;
            }
        }
        com.facebook.common.h.a.c(h2);
        if (!(!c2 || bVar == null || bVar.f47808e == null)) {
            bVar.f47808e.a(bVar.f47804a, true);
        }
        b();
        c();
        MethodCollector.o(2770);
    }

    static {
        Covode.recordClassIndex(28945);
    }

    private synchronized int d() {
        int a2;
        MethodCollector.i(464);
        a2 = this.f47793c.a() - this.f47792b.a();
        MethodCollector.o(464);
        return a2;
    }

    private synchronized int e() {
        int b2;
        MethodCollector.i(472);
        b2 = this.f47793c.b() - this.f47792b.b();
        MethodCollector.o(472);
        return b2;
    }

    private synchronized void b() {
        MethodCollector.i(4);
        if (this.f47799i + f47791a > SystemClock.uptimeMillis()) {
            MethodCollector.o(4);
            return;
        }
        this.f47799i = SystemClock.uptimeMillis();
        this.f47795e = this.f47798h.b();
        MethodCollector.o(4);
    }

    private void c() {
        ArrayList<b<K, V>> a2;
        MethodCollector.i(7);
        synchronized (this) {
            try {
                a2 = a(Math.min(this.f47795e.f47820d, this.f47795e.f47818b - d()), Math.min(this.f47795e.f47819c, this.f47795e.f47817a - e()));
                c((ArrayList) a2);
            } catch (Throwable th) {
                MethodCollector.o(7);
                throw th;
            }
        }
        a((ArrayList) a2);
        b((ArrayList) a2);
        MethodCollector.o(7);
    }

    public final void a() {
        ArrayList<b<K, V>> d2;
        ArrayList<b<K, V>> d3;
        MethodCollector.i(3288);
        synchronized (this) {
            try {
                d2 = this.f47792b.d();
                d3 = this.f47793c.d();
                c((ArrayList) d3);
            } catch (Throwable th) {
                MethodCollector.o(3288);
                throw th;
            }
        }
        a((ArrayList) d3);
        b((ArrayList) d2);
        b();
        MethodCollector.o(3288);
    }

    private w<b<K, V>> a(final w<V> wVar) {
        return new w<b<K, V>>() {
            /* class com.facebook.imagepipeline.d.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28946);
            }

            @Override // com.facebook.imagepipeline.d.w
            public final /* bridge */ /* synthetic */ int a(Object obj) {
                return wVar.a(((b) obj).f47805b.a());
            }
        };
    }

    private static <K, V> void d(b<K, V> bVar) {
        if (bVar != null && bVar.f47808e != null) {
            bVar.f47808e.a(bVar.f47804a, false);
        }
    }

    private void a(ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                com.facebook.common.h.a.c(h(it.next()));
            }
        }
    }

    private synchronized com.facebook.common.h.a<V> b(final b<K, V> bVar) {
        com.facebook.common.h.a<V> a2;
        MethodCollector.i(2717);
        f(bVar);
        a2 = com.facebook.common.h.a.a(bVar.f47805b.a(), new com.facebook.common.h.c<V>() {
            /* class com.facebook.imagepipeline.d.h.AnonymousClass2 */

            static {
                Covode.recordClassIndex(28947);
            }

            @Override // com.facebook.common.h.c
            public final void a(V v) {
                h.this.a((b) bVar);
            }
        });
        MethodCollector.o(2717);
        return a2;
    }

    public final synchronized boolean c(K k2) {
        boolean a2;
        MethodCollector.i(3289);
        a2 = this.f47793c.a((Object) k2);
        MethodCollector.o(3289);
        return a2;
    }

    private synchronized boolean d(V v) {
        MethodCollector.i(2514);
        int a2 = this.f47796f.a(v);
        if (a2 > this.f47795e.f47821e || d() > this.f47795e.f47818b - 1 || e() > this.f47795e.f47817a - a2) {
            MethodCollector.o(2514);
            return false;
        }
        MethodCollector.o(2514);
        return true;
    }

    private synchronized void e(b<K, V> bVar) {
        boolean z;
        MethodCollector.i(425);
        i.a(bVar);
        if (!bVar.f47807d) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        bVar.f47807d = true;
        MethodCollector.o(425);
    }

    private synchronized void f(b<K, V> bVar) {
        boolean z;
        MethodCollector.i(444);
        i.a(bVar);
        if (!bVar.f47807d) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        bVar.f47806c++;
        MethodCollector.o(444);
    }

    private synchronized void g(b<K, V> bVar) {
        boolean z;
        MethodCollector.i(452);
        i.a(bVar);
        if (bVar.f47806c > 0) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        bVar.f47806c--;
        MethodCollector.o(452);
    }

    private synchronized com.facebook.common.h.a<V> h(b<K, V> bVar) {
        MethodCollector.i(454);
        i.a(bVar);
        if (!bVar.f47807d || bVar.f47806c != 0) {
            MethodCollector.o(454);
            return null;
        }
        com.facebook.common.h.a<V> aVar = bVar.f47805b;
        MethodCollector.o(454);
        return aVar;
    }

    @Override // com.facebook.imagepipeline.d.p
    public final int a(j<K> jVar) {
        ArrayList<b<K, V>> a2;
        ArrayList<b<K, V>> a3;
        MethodCollector.i(3271);
        synchronized (this) {
            try {
                a2 = this.f47792b.a((j) jVar);
                a3 = this.f47793c.a((j) jVar);
                c((ArrayList) a3);
            } catch (Throwable th) {
                MethodCollector.o(3271);
                throw th;
            }
        }
        a((ArrayList) a3);
        b((ArrayList) a2);
        b();
        c();
        int size = a3.size();
        MethodCollector.o(3271);
        return size;
    }

    private static void b(ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                d((b) it.next());
            }
        }
    }

    private synchronized void c(ArrayList<b<K, V>> arrayList) {
        MethodCollector.i(410);
        if (arrayList != null) {
            Iterator<b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }
        MethodCollector.o(410);
    }

    private synchronized boolean c(b<K, V> bVar) {
        MethodCollector.i(2789);
        if (bVar.f47807d || bVar.f47806c != 0) {
            MethodCollector.o(2789);
            return false;
        }
        this.f47792b.a(bVar.f47804a, bVar);
        MethodCollector.o(2789);
        return true;
    }

    @Override // com.facebook.imagepipeline.d.p
    public final com.facebook.common.h.a<V> a(K k2) {
        b<K, V> c2;
        com.facebook.common.h.a<V> aVar;
        MethodCollector.i(2712);
        i.a(k2);
        synchronized (this) {
            try {
                c2 = this.f47792b.c(k2);
                b<K, V> b2 = this.f47793c.b(k2);
                if (b2 != null) {
                    aVar = b((b) b2);
                } else {
                    aVar = null;
                }
            } catch (Throwable th) {
                MethodCollector.o(2712);
                throw th;
            }
        }
        d((b) c2);
        b();
        c();
        MethodCollector.o(2712);
        return aVar;
    }

    public final int b(j<K> jVar) {
        ArrayList<b<K, V>> a2;
        MethodCollector.i(3285);
        ArrayList<b<K, V>> arrayList = new ArrayList<>();
        synchronized (this) {
            try {
                a2 = this.f47792b.a((j) jVar);
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    arrayList.add(this.f47793c.c(a2.get(i2).f47804a));
                }
            } catch (Throwable th) {
                MethodCollector.o(3285);
                throw th;
            }
        }
        a((ArrayList) arrayList);
        b((ArrayList) a2);
        b();
        c();
        int size = arrayList.size();
        MethodCollector.o(3285);
        return size;
    }

    public final com.facebook.common.h.a<V> b(K k2) {
        b<K, V> c2;
        boolean z;
        com.facebook.common.h.a<V> aVar;
        MethodCollector.i(3248);
        i.a(k2);
        synchronized (this) {
            try {
                c2 = this.f47792b.c(k2);
                z = true;
                boolean z2 = false;
                if (c2 != null) {
                    b<K, V> c3 = this.f47793c.c(k2);
                    i.a(c3);
                    if (c3.f47806c == 0) {
                        z2 = true;
                    }
                    i.b(z2);
                    aVar = c3.f47805b;
                } else {
                    aVar = null;
                    z = false;
                }
            } finally {
                MethodCollector.o(3248);
            }
        }
        if (z) {
            d((b) c2);
        }
        return aVar;
    }

    @Override // com.facebook.common.g.c
    public final void a(com.facebook.common.g.b bVar) {
        ArrayList<b<K, V>> a2;
        MethodCollector.i(1);
        double a3 = this.f47797g.a(bVar);
        synchronized (this) {
            try {
                double b2 = (double) this.f47793c.b();
                Double.isNaN(b2);
                a2 = a(Integer.MAX_VALUE, Math.max(0, ((int) (b2 * (1.0d - a3))) - e()));
                c((ArrayList) a2);
            } catch (Throwable th) {
                MethodCollector.o(1);
                throw th;
            }
        }
        a((ArrayList) a2);
        b((ArrayList) a2);
        b();
        c();
        MethodCollector.o(1);
    }

    @Override // com.facebook.imagepipeline.d.p
    public final com.facebook.common.h.a<V> a(K k2, com.facebook.common.h.a<V> aVar) {
        return a(k2, aVar, null);
    }

    private synchronized ArrayList<b<K, V>> a(int i2, int i3) {
        MethodCollector.i(175);
        int max = Math.max(i2, 0);
        int max2 = Math.max(i3, 0);
        if (this.f47792b.a() > max || this.f47792b.b() > max2) {
            ArrayList<b<K, V>> arrayList = new ArrayList<>();
            while (true) {
                if (this.f47792b.a() > max || this.f47792b.b() > max2) {
                    K c2 = this.f47792b.c();
                    this.f47792b.c(c2);
                    arrayList.add(this.f47793c.c(c2));
                } else {
                    MethodCollector.o(175);
                    return arrayList;
                }
            }
        } else {
            MethodCollector.o(175);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f47804a;

        /* renamed from: b  reason: collision with root package name */
        public final com.facebook.common.h.a<V> f47805b;

        /* renamed from: c  reason: collision with root package name */
        public int f47806c = 0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f47807d = false;

        /* renamed from: e  reason: collision with root package name */
        public final c<K> f47808e;

        static {
            Covode.recordClassIndex(28949);
        }

        b(K k2, com.facebook.common.h.a<V> aVar, c<K> cVar) {
            this.f47804a = (K) i.a(k2);
            this.f47805b = (com.facebook.common.h.a) i.a(com.facebook.common.h.a.b(aVar));
            this.f47808e = cVar;
        }
    }

    public h(w<V> wVar, a aVar, k<q> kVar) {
        this.f47796f = wVar;
        this.f47792b = new g<>(a((w) wVar));
        this.f47793c = new g<>(a((w) wVar));
        this.f47797g = aVar;
        this.f47798h = kVar;
        this.f47795e = kVar.b();
        this.f47799i = SystemClock.uptimeMillis();
    }

    public final com.facebook.common.h.a<V> a(K k2, com.facebook.common.h.a<V> aVar, c<K> cVar) {
        b<K, V> c2;
        com.facebook.common.h.a<V> aVar2;
        com.facebook.common.h.a<V> aVar3;
        MethodCollector.i(2508);
        i.a(k2);
        i.a(aVar);
        b();
        synchronized (this) {
            try {
                c2 = this.f47792b.c(k2);
                b<K, V> c3 = this.f47793c.c(k2);
                aVar2 = null;
                if (c3 != null) {
                    e(c3);
                    aVar3 = h(c3);
                } else {
                    aVar3 = null;
                }
                if (d((Object) aVar.a())) {
                    b<K, V> bVar = new b<>(k2, aVar, cVar);
                    this.f47793c.a(k2, bVar);
                    aVar2 = b((b) bVar);
                }
            } catch (Throwable th) {
                MethodCollector.o(2508);
                throw th;
            }
        }
        com.facebook.common.h.a.c(aVar3);
        d((b) c2);
        c();
        MethodCollector.o(2508);
        return aVar2;
    }
}
