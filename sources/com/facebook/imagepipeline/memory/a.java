package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.g.d;
import com.facebook.common.g.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public abstract class a<V> implements f<V> {

    /* renamed from: a  reason: collision with root package name */
    final d f48021a;

    /* renamed from: b  reason: collision with root package name */
    final ad f48022b;

    /* renamed from: c  reason: collision with root package name */
    final SparseArray<f<V>> f48023c;

    /* renamed from: d  reason: collision with root package name */
    final Set<V> f48024d;

    /* renamed from: e  reason: collision with root package name */
    final C1180a f48025e;

    /* renamed from: f  reason: collision with root package name */
    final C1180a f48026f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f48027g = getClass();

    /* renamed from: h  reason: collision with root package name */
    private boolean f48028h;

    /* renamed from: i  reason: collision with root package name */
    private final ae f48029i;

    static {
        Covode.recordClassIndex(29036);
    }

    /* access modifiers changed from: protected */
    public abstract V b(int i2);

    /* access modifiers changed from: protected */
    public abstract void b(V v);

    /* access modifiers changed from: protected */
    public abstract int c(int i2);

    /* access modifiers changed from: protected */
    public abstract int c(V v);

    /* access modifiers changed from: protected */
    public abstract int d(int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.memory.a$a  reason: collision with other inner class name */
    public static class C1180a {

        /* renamed from: a  reason: collision with root package name */
        int f48030a;

        /* renamed from: b  reason: collision with root package name */
        int f48031b;

        static {
            Covode.recordClassIndex(29037);
        }

        C1180a() {
        }

        public final void a(int i2) {
            this.f48030a++;
            this.f48031b += i2;
        }

        public final void b(int i2) {
            int i3;
            int i4 = this.f48031b;
            if (i4 < i2 || (i3 = this.f48030a) <= 0) {
                com.facebook.common.e.a.d("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i2), Integer.valueOf(this.f48031b), Integer.valueOf(this.f48030a));
                return;
            }
            this.f48030a = i3 - 1;
            this.f48031b = i4 - i2;
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f48021a.a(this);
    }

    private synchronized void b() {
        boolean z;
        if (e()) {
            if (this.f48026f.f48031b != 0) {
                z = false;
                i.b(z);
            }
        }
        z = true;
        i.b(z);
    }

    private synchronized void d() {
        if (e()) {
            f(this.f48022b.f48063b);
        }
    }

    private synchronized boolean e() {
        if (this.f48025e.f48031b + this.f48026f.f48031b > this.f48022b.f48063b) {
            return true;
        }
        return false;
    }

    private synchronized void c() {
        SparseIntArray sparseIntArray = this.f48022b.f48064c;
        if (sparseIntArray != null) {
            this.f48023c.clear();
            for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
                int keyAt = sparseIntArray.keyAt(i2);
                this.f48023c.put(keyAt, new f<>(d(keyAt), sparseIntArray.valueAt(i2), 0, this.f48022b.f48067f));
            }
            this.f48028h = false;
            return;
        }
        this.f48028h = true;
    }

    private void f() {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(this.f48027g, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f48025e.f48030a), Integer.valueOf(this.f48025e.f48031b), Integer.valueOf(this.f48026f.f48030a), Integer.valueOf(this.f48026f.f48031b));
        }
    }

    /* access modifiers changed from: protected */
    public boolean d(V v) {
        i.a(v);
        return true;
    }

    private synchronized f<V> g(int i2) {
        return this.f48023c.get(i2);
    }

    public static class b extends RuntimeException {
        static {
            Covode.recordClassIndex(29038);
        }

        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* access modifiers changed from: protected */
    public synchronized V a(f<V> fVar) {
        V b2;
        b2 = fVar.b();
        if (b2 != null) {
            fVar.f48083e++;
        }
        return b2;
    }

    private synchronized f<V> h(int i2) {
        f<V> fVar = this.f48023c.get(i2);
        if (fVar == null) {
            if (this.f48028h) {
                if (com.facebook.common.e.a.a(2)) {
                    com.facebook.common.e.a.a(this.f48027g, "creating new bucket %s", Integer.valueOf(i2));
                }
                f<V> e2 = e(i2);
                this.f48023c.put(i2, e2);
                return e2;
            }
        }
        return fVar;
    }

    private synchronized boolean i(int i2) {
        int i3 = this.f48022b.f48062a;
        if (i2 > i3 - this.f48025e.f48031b) {
            return false;
        }
        int i4 = this.f48022b.f48063b;
        if (i2 > i4 - (this.f48025e.f48031b + this.f48026f.f48031b)) {
            f(i4 - i2);
        }
        if (i2 > i3 - (this.f48025e.f48031b + this.f48026f.f48031b)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public f<V> e(int i2) {
        return new f<>(d(i2), Integer.MAX_VALUE, 0, this.f48022b.f48067f);
    }

    private synchronized void a(SparseIntArray sparseIntArray) {
        i.a(sparseIntArray);
        this.f48023c.clear();
        SparseIntArray sparseIntArray2 = this.f48022b.f48064c;
        if (sparseIntArray2 != null) {
            for (int i2 = 0; i2 < sparseIntArray2.size(); i2++) {
                int keyAt = sparseIntArray2.keyAt(i2);
                this.f48023c.put(keyAt, new f<>(d(keyAt), sparseIntArray2.valueAt(i2), sparseIntArray.get(keyAt, 0), this.f48022b.f48067f));
            }
            this.f48028h = false;
            return;
        }
        this.f48028h = true;
    }

    private synchronized void f(int i2) {
        int min = Math.min((this.f48025e.f48031b + this.f48026f.f48031b) - i2, this.f48026f.f48031b);
        if (min > 0) {
            if (com.facebook.common.e.a.a(2)) {
                com.facebook.common.e.a.a(this.f48027g, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i2), Integer.valueOf(this.f48025e.f48031b + this.f48026f.f48031b), Integer.valueOf(min));
            }
            f();
            for (int i3 = 0; i3 < this.f48023c.size() && min > 0; i3++) {
                f<V> valueAt = this.f48023c.valueAt(i3);
                do {
                    V b2 = valueAt.b();
                    if (b2 == null) {
                        break;
                    }
                    b(b2);
                    min -= valueAt.f48079a;
                    this.f48026f.b(valueAt.f48079a);
                } while (min > 0);
            }
            f();
            if (com.facebook.common.e.a.a(2)) {
                com.facebook.common.e.a.a(this.f48027g, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i2), Integer.valueOf(this.f48025e.f48031b + this.f48026f.f48031b));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4 = b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r7.f48025e.b(r6);
        r0 = h(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r0 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r0.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        com.facebook.common.d.m.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        com.facebook.common.d.i.b(r7.f48024d.add(r4));
        d();
        f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (com.facebook.common.e.a.a(2) == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        com.facebook.common.e.a.a(r7.f48027g, "get (alloc) (object, size) = (%x, %s)", java.lang.Integer.valueOf(java.lang.System.identityHashCode(r4)), java.lang.Integer.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        return r4;
     */
    @Override // com.facebook.common.g.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V a(int r8) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.a.a(int):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.facebook.imagepipeline.memory.a<V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.common.g.c
    public final void a(com.facebook.common.g.b bVar) {
        int i2;
        ArrayList arrayList;
        synchronized (this) {
            if (this.f48022b.f48067f) {
                arrayList = new ArrayList(this.f48023c.size());
                int size = this.f48023c.size();
                for (int i3 = 0; i3 < size; i3++) {
                    f<V> valueAt = this.f48023c.valueAt(i3);
                    int i4 = valueAt.f48079a;
                    int i5 = valueAt.f48080b;
                    int i6 = valueAt.f48083e;
                    if (valueAt.a() > 0) {
                        arrayList.add(valueAt);
                    }
                    this.f48023c.setValueAt(i3, new f<>(d(i4), i5, i6, this.f48022b.f48067f));
                }
            } else {
                arrayList = new ArrayList(this.f48023c.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i7 = 0; i7 < this.f48023c.size(); i7++) {
                    f<V> valueAt2 = this.f48023c.valueAt(i7);
                    if (valueAt2.a() > 0) {
                        arrayList.add(valueAt2);
                    }
                    sparseIntArray.put(this.f48023c.keyAt(i7), valueAt2.f48083e);
                }
                a(sparseIntArray);
            }
            C1180a aVar = this.f48026f;
            aVar.f48030a = 0;
            aVar.f48031b = 0;
            f();
        }
        for (i2 = 0; i2 < arrayList.size(); i2++) {
            f fVar = (f) arrayList.get(i2);
            while (true) {
                Object b2 = fVar.b();
                if (b2 == null) {
                    break;
                }
                b(b2);
            }
        }
    }

    @Override // com.facebook.common.h.c, com.facebook.common.g.f
    public final void a(V v) {
        i.a(v);
        int c2 = c(v);
        int d2 = d(c2);
        synchronized (this) {
            f<V> g2 = g(c2);
            boolean z = false;
            if (!this.f48024d.remove(v)) {
                com.facebook.common.e.a.c(this.f48027g, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c2));
                b(v);
            } else {
                if (g2 != null) {
                    if (g2.f48083e + g2.a() <= g2.f48080b && !e()) {
                        if (d(v)) {
                            i.a(v);
                            if (g2.f48082d) {
                                if (g2.f48083e > 0) {
                                    z = true;
                                }
                                i.b(z);
                                g2.f48083e--;
                                g2.a(v);
                            } else if (g2.f48083e > 0) {
                                g2.f48083e--;
                                g2.a(v);
                            } else {
                                com.facebook.common.e.a.c("BUCKET", "Tried to release value %s from an empty bucket!", v);
                            }
                            this.f48026f.a(d2);
                            this.f48025e.b(d2);
                            if (com.facebook.common.e.a.a(2)) {
                                com.facebook.common.e.a.a(this.f48027g, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c2));
                            }
                        }
                    }
                    g2.c();
                }
                if (com.facebook.common.e.a.a(2)) {
                    com.facebook.common.e.a.a(this.f48027g, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c2));
                }
                b(v);
                this.f48025e.b(d2);
            }
            f();
        }
    }

    public a(d dVar, ad adVar, ae aeVar) {
        this.f48021a = (d) i.a(dVar);
        ad adVar2 = (ad) i.a(adVar);
        this.f48022b = adVar2;
        this.f48029i = (ae) i.a(aeVar);
        this.f48023c = new SparseArray<>();
        if (adVar2.f48067f) {
            c();
        } else {
            a(new SparseIntArray(0));
        }
        this.f48024d = Collections.newSetFromMap(new IdentityHashMap());
        this.f48026f = new C1180a();
        this.f48025e = new C1180a();
    }

    public static class c extends RuntimeException {
        static {
            Covode.recordClassIndex(29039);
        }

        public c(int i2, int i3, int i4, int i5) {
            super("Pool hard cap violation? Hard cap = " + i2 + " Used size = " + i3 + " Free size = " + i4 + " Request size = " + i5);
        }
    }
}
