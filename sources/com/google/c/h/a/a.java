package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.h.a.b;
import java.lang.Throwable;
import java.util.concurrent.Future;

abstract class a<V, X extends Throwable, F, T> extends b.h<V> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    q<? extends V> f54187a;

    /* renamed from: b  reason: collision with root package name */
    Class<X> f54188b;

    /* renamed from: c  reason: collision with root package name */
    F f54189c;

    static {
        Covode.recordClassIndex(33622);
    }

    /* access modifiers changed from: package-private */
    public abstract T a(F f2, X x);

    /* access modifiers changed from: package-private */
    public abstract void a(T t);

    /* access modifiers changed from: protected */
    @Override // com.google.c.h.a.b
    public final void b() {
        a((Future<?>) this.f54187a);
        this.f54187a = null;
        this.f54188b = null;
        this.f54189c = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.c.h.a.b
    public final String a() {
        String str;
        q<? extends V> qVar = this.f54187a;
        Class<X> cls = this.f54188b;
        F f2 = this.f54189c;
        String a2 = super.a();
        if (qVar != null) {
            str = "inputFuture=[" + qVar + "], ";
        } else {
            str = "";
        }
        if (cls != null && f2 != null) {
            return str + "exceptionType=[" + cls + "], fallback=[" + ((Object) f2) + "]";
        }
        if (a2 != null) {
            return str + a2;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.c.h.a.a<V, X extends java.lang.Throwable, F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.c.h.a.q<? extends V> r5 = r6.f54187a
            java.lang.Class<X extends java.lang.Throwable> r4 = r6.f54188b
            F r3 = r6.f54189c
            r2 = 1
            r0 = 0
            if (r5 != 0) goto L_0x001e
            r1 = 1
        L_0x000b:
            if (r4 != 0) goto L_0x001c
            r0 = 1
        L_0x000e:
            r1 = r1 | r0
            if (r3 != 0) goto L_0x001a
        L_0x0011:
            r2 = r2 | r1
            boolean r0 = r6.isCancelled()
            r2 = r2 | r0
            if (r2 == 0) goto L_0x0020
            return
        L_0x001a:
            r2 = 0
            goto L_0x0011
        L_0x001c:
            r0 = 0
            goto L_0x000e
        L_0x001e:
            r1 = 0
            goto L_0x000b
        L_0x0020:
            r2 = 0
            r6.f54187a = r2
            java.lang.Object r0 = com.google.c.h.a.l.a(r5)     // Catch:{ ExecutionException -> 0x0028, all -> 0x003a }
            goto L_0x0036
        L_0x0028:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Object r1 = com.google.c.a.k.a(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0 = r2
            if (r1 != 0) goto L_0x003b
        L_0x0036:
            r6.b(r0)
            return
        L_0x003a:
            r1 = move-exception
        L_0x003b:
            boolean r0 = r4.isInstance(r1)
            if (r0 != 0) goto L_0x0045
            r6.a(r1)
            return
        L_0x0045:
            java.lang.Object r0 = r6.a(r3, r1)     // Catch:{ all -> 0x0051 }
            r6.f54188b = r2
            r6.f54189c = r2
            r6.a(r0)
            return
        L_0x0051:
            r0 = move-exception
            r6.a(r0)     // Catch:{ all -> 0x005a }
            r6.f54188b = r2
            r6.f54189c = r2
            return
        L_0x005a:
            r0 = move-exception
            r6.f54188b = r2
            r6.f54189c = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c.h.a.a.run():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.a$a  reason: collision with other inner class name */
    public static final class C1238a<V, X extends Throwable> extends a<V, X, e<? super X, ? extends V>, q<? extends V>> {
        static {
            Covode.recordClassIndex(33623);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.a
        public final /* bridge */ /* synthetic */ void a(Object obj) {
            a((q) ((q) obj));
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.h.a.a
        public final /* bridge */ /* synthetic */ Object a(Object obj, Throwable th) {
            q a2 = ((e) obj).a(th);
            k.a(a2, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?");
            return a2;
        }

        C1238a(q<? extends V> qVar, Class<X> cls, e<? super X, ? extends V> eVar) {
            super(qVar, cls, eVar);
        }
    }

    a(q<? extends V> qVar, Class<X> cls, F f2) {
        this.f54187a = (q) k.a(qVar);
        this.f54188b = (Class) k.a(cls);
        this.f54189c = (F) k.a(f2);
    }
}
