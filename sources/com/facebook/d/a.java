package com.facebook.d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public abstract class a<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    private EnumC1169a f47175a = EnumC1169a.IN_PROGRESS;

    /* renamed from: b  reason: collision with root package name */
    private boolean f47176b;

    /* renamed from: c  reason: collision with root package name */
    private T f47177c;

    /* renamed from: d  reason: collision with root package name */
    private Throwable f47178d;

    /* renamed from: e  reason: collision with root package name */
    private float f47179e;

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<e<T>, Executor>> f47180f = new ConcurrentLinkedQueue<>();

    static {
        Covode.recordClassIndex(28703);
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
    }

    public final synchronized boolean a() {
        return this.f47176b;
    }

    @Override // com.facebook.d.c
    public synchronized T d() {
        return this.f47177c;
    }

    @Override // com.facebook.d.c
    public final synchronized Throwable e() {
        return this.f47178d;
    }

    @Override // com.facebook.d.c
    public final synchronized float f() {
        return this.f47179e;
    }

    private synchronized boolean h() {
        boolean z;
        if (this.f47175a == EnumC1169a.FAILURE) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.facebook.d.c
    public final synchronized boolean b() {
        boolean z;
        if (this.f47175a != EnumC1169a.IN_PROGRESS) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.facebook.d.c
    public synchronized boolean c() {
        boolean z;
        if (this.f47177c != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private synchronized boolean j() {
        boolean z;
        if (!a() || b()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.d.a$a  reason: collision with other inner class name */
    public enum EnumC1169a {
        IN_PROGRESS,
        SUCCESS,
        FAILURE;

        static {
            Covode.recordClassIndex(28706);
        }
    }

    private void i() {
        boolean h2 = h();
        boolean j2 = j();
        Iterator<Pair<e<T>, Executor>> it = this.f47180f.iterator();
        while (it.hasNext()) {
            Pair<e<T>, Executor> next = it.next();
            a((e) next.first, (Executor) next.second, h2, j2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        a((java.lang.Object) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (b() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f47180f.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    @Override // com.facebook.d.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f47176b     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0008:
            r2 = 1
            r3.f47176b = r2     // Catch:{ all -> 0x002a }
            T r1 = r3.f47177c     // Catch:{ all -> 0x002a }
            r0 = 0
            r3.f47177c = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r3.a(r1)
        L_0x0016:
            boolean r0 = r3.b()
            if (r0 != 0) goto L_0x001f
            r3.i()
        L_0x001f:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.d.e<T>, java.util.concurrent.Executor>> r0 = r3.f47180f     // Catch:{ all -> 0x0027 }
            r0.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r2
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.d.a.g():boolean");
    }

    private synchronized boolean b(float f2) {
        if (!this.f47176b) {
            if (this.f47175a == EnumC1169a.IN_PROGRESS) {
                if (f2 < this.f47179e) {
                    return false;
                }
                this.f47179e = f2;
                return true;
            }
        }
        return false;
    }

    private synchronized boolean b(Throwable th) {
        if (!this.f47176b) {
            if (this.f47175a == EnumC1169a.IN_PROGRESS) {
                this.f47175a = EnumC1169a.FAILURE;
                this.f47178d = th;
                return true;
            }
        }
        return false;
    }

    public boolean a(float f2) {
        boolean b2 = b(f2);
        if (b2) {
            Iterator<Pair<e<T>, Executor>> it = this.f47180f.iterator();
            while (it.hasNext()) {
                Pair<e<T>, Executor> next = it.next();
                final e eVar = (e) next.first;
                ((Executor) next.second).execute(new Runnable() {
                    /* class com.facebook.d.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(28705);
                    }

                    public final void run() {
                        eVar.onProgressUpdate(a.this);
                    }
                });
            }
        }
        return b2;
    }

    public boolean a(Throwable th) {
        boolean b2 = b(th);
        if (b2) {
            i();
        }
        return b2;
    }

    public boolean a(T t, boolean z) {
        boolean b2 = b(t, z);
        if (b2) {
            i();
        }
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0025, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0027, code lost:
        a((java.lang.Object) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(T r4, boolean r5) {
        /*
            r3 = this;
            r2 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003b }
            boolean r0 = r3.f47176b     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x002c
            com.facebook.d.a$a r1 = r3.f47175a     // Catch:{ all -> 0x0038 }
            com.facebook.d.a$a r0 = com.facebook.d.a.EnumC1169a.IN_PROGRESS     // Catch:{ all -> 0x0038 }
            if (r1 == r0) goto L_0x000d
            goto L_0x002c
        L_0x000d:
            if (r5 == 0) goto L_0x0017
            com.facebook.d.a$a r0 = com.facebook.d.a.EnumC1169a.SUCCESS     // Catch:{ all -> 0x0038 }
            r3.f47175a = r0     // Catch:{ all -> 0x0038 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.f47179e = r0     // Catch:{ all -> 0x0038 }
        L_0x0017:
            T r1 = r3.f47177c     // Catch:{ all -> 0x0038 }
            if (r1 == r4) goto L_0x0023
            r3.f47177c = r4     // Catch:{ all -> 0x001e }
            goto L_0x0021
        L_0x001e:
            r0 = move-exception
            r2 = r1
            goto L_0x0039
        L_0x0021:
            r4 = r1
            goto L_0x0024
        L_0x0023:
            r4 = r2
        L_0x0024:
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x002a
            r3.a(r4)
        L_0x002a:
            r0 = 1
            return r0
        L_0x002c:
            monitor-exit(r3)
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            r2 = r4
            goto L_0x0039
        L_0x0031:
            if (r4 == 0) goto L_0x0036
            r3.a(r4)
        L_0x0036:
            r0 = 0
            return r0
        L_0x0038:
            r0 = move-exception
        L_0x0039:
            monitor-exit(r3)
            throw r0
        L_0x003b:
            r0 = move-exception
            if (r2 == 0) goto L_0x0041
            r3.a(r2)
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.d.a.b(java.lang.Object, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        a(r3, r4, h(), j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    @Override // com.facebook.d.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.facebook.d.e<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            com.facebook.common.d.i.a(r3)
            com.facebook.common.d.i.a(r4)
            monitor-enter(r2)
            boolean r0 = r2.f47176b     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            return
        L_0x000d:
            com.facebook.d.a$a r1 = r2.f47175a     // Catch:{ all -> 0x0041 }
            com.facebook.d.a$a r0 = com.facebook.d.a.EnumC1169a.IN_PROGRESS     // Catch:{ all -> 0x0041 }
            if (r1 != r0) goto L_0x001c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.d.e<T>, java.util.concurrent.Executor>> r1 = r2.f47180f     // Catch:{ all -> 0x0041 }
            android.util.Pair r0 = android.util.Pair.create(r3, r4)     // Catch:{ all -> 0x0041 }
            r1.add(r0)     // Catch:{ all -> 0x0041 }
        L_0x001c:
            boolean r0 = r2.c()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.b()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.j()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0040
            boolean r1 = r2.h()
            boolean r0 = r2.j()
            r2.a(r3, r4, r1, r0)
        L_0x0040:
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.d.a.a(com.facebook.d.e, java.util.concurrent.Executor):void");
    }

    private void a(final e<T> eVar, Executor executor, final boolean z, final boolean z2) {
        executor.execute(new Runnable() {
            /* class com.facebook.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28704);
            }

            public final void run() {
                if (z) {
                    eVar.onFailure(a.this);
                } else if (z2) {
                    eVar.onCancellation(a.this);
                } else {
                    eVar.onNewResult(a.this);
                }
            }
        });
    }
}
