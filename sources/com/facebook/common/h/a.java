package com.facebook.common.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.b;
import com.facebook.common.d.i;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a<T> implements Closeable, Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private static Class<a> f47102b = a.class;

    /* renamed from: d  reason: collision with root package name */
    private static final c<Closeable> f47103d = new c<Closeable>() {
        /* class com.facebook.common.h.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(28666);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.facebook.common.h.c
        public final /* bridge */ /* synthetic */ void a(Closeable closeable) {
            try {
                b.a(closeable);
            } catch (IOException unused) {
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f47104a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47105c;

    static {
        Covode.recordClassIndex(28665);
    }

    /* renamed from: b */
    public final synchronized a<T> clone() {
        a<T> aVar;
        MethodCollector.i(1564);
        i.b(d());
        aVar = new a<>(this.f47104a);
        MethodCollector.o(1564);
        return aVar;
    }

    public final synchronized a<T> c() {
        MethodCollector.i(1566);
        if (d()) {
            a<T> b2 = clone();
            MethodCollector.o(1566);
            return b2;
        }
        MethodCollector.o(1566);
        return null;
    }

    public final synchronized boolean d() {
        MethodCollector.i(1567);
        if (!this.f47105c) {
            MethodCollector.o(1567);
            return true;
        }
        MethodCollector.o(1567);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r1 = r9.f47104a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r1.c() != 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r6 = r1.f47110b;
        r1.f47110b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        r1.f47111c.a(r6);
        r5 = com.facebook.common.h.d.f47109a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = com.facebook.common.h.d.f47109a.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        com.facebook.common.e.a.d("SharedReference", "No entry in sLiveObjects for value of type %s", r6.getClass());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (r2.intValue() != 1) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        com.facebook.common.h.d.f47109a.remove(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        com.facebook.common.h.d.f47109a.put(r6, java.lang.Integer.valueOf(r2.intValue() - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1571);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1571);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0070, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0071, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1571);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        return;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.h.a.close():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r2 = com.facebook.common.h.a.f47102b;
        r7 = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r9));
        r6 = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r9.f47104a));
        r4 = r9.f47104a.a().getClass().getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (com.facebook.common.e.a.f47081a.b(3) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        com.facebook.common.e.a.f47081a.b(r2.getSimpleName(), com.a.a(null, "Finalized without closing: %x %x (type = %s)", new java.lang.Object[]{r7, r6, r4}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        close();
        super.finalize();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1580);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        return;
     */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finalize() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.h.a.finalize():void");
    }

    public final synchronized T a() {
        boolean z;
        T a2;
        MethodCollector.i(1562);
        if (!this.f47105c) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        a2 = this.f47104a.a();
        MethodCollector.o(1562);
        return a2;
    }

    public static void c(a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    private a(d<T> dVar) {
        this.f47104a = (d) i.a(dVar);
        dVar.b();
    }

    public static <T extends Closeable> a<T> a(T t) {
        if (t == null) {
            return null;
        }
        return new a<>(t, f47103d);
    }

    public static <T> a<T> b(a<T> aVar) {
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    public static <T> List<a<T>> a(Collection<a<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (a<T> aVar : collection) {
            arrayList.add(b(aVar));
        }
        return arrayList;
    }

    public static void a(Iterable<? extends a<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends a<?>> it = iterable.iterator();
            while (it.hasNext()) {
                c((a) it.next());
            }
        }
    }

    public static boolean a(a<?> aVar) {
        if (aVar == null || !aVar.d()) {
            return false;
        }
        return true;
    }

    private a(T t, c<T> cVar) {
        this.f47104a = new d<>(t, cVar);
    }

    public static <T> a<T> a(T t, c<T> cVar) {
        if (t == null) {
            return null;
        }
        return new a<>(t, cVar);
    }
}
