package com.facebook.imagepipeline.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.common.d.i;
import com.facebook.common.e.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f47828a = v.class;

    /* renamed from: b  reason: collision with root package name */
    private Map<e, com.facebook.imagepipeline.j.e> f47829b = new HashMap();

    static {
        Covode.recordClassIndex(28967);
    }

    v() {
    }

    private synchronized void b() {
        MethodCollector.i(11500);
        a.a(f47828a, "Count = %d", Integer.valueOf(this.f47829b.size()));
        MethodCollector.o(11500);
    }

    public final void a() {
        ArrayList arrayList;
        MethodCollector.i(10839);
        synchronized (this) {
            try {
                arrayList = new ArrayList(this.f47829b.values());
                this.f47829b.clear();
            } finally {
                MethodCollector.o(10839);
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            com.facebook.imagepipeline.j.e eVar = (com.facebook.imagepipeline.j.e) arrayList.get(i2);
            if (eVar != null) {
                eVar.close();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r3 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.facebook.imagepipeline.j.e b(com.facebook.c.a.e r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r6 = 11175(0x2ba7, float:1.566E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)     // Catch:{ all -> 0x005f }
            com.facebook.common.d.i.a(r8)     // Catch:{ all -> 0x005f }
            java.util.Map<com.facebook.c.a.e, com.facebook.imagepipeline.j.e> r0 = r7.f47829b     // Catch:{ all -> 0x005f }
            java.lang.Object r3 = r0.get(r8)     // Catch:{ all -> 0x005f }
            com.facebook.imagepipeline.j.e r3 = (com.facebook.imagepipeline.j.e) r3     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x005a
            monitor-enter(r3)     // Catch:{ all -> 0x005f }
            boolean r0 = com.facebook.imagepipeline.j.e.e(r3)     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x004d
            java.util.Map<com.facebook.c.a.e, com.facebook.imagepipeline.j.e> r0 = r7.f47829b     // Catch:{ all -> 0x0054 }
            r0.remove(r8)     // Catch:{ all -> 0x0054 }
            java.lang.Class<?> r5 = com.facebook.imagepipeline.d.v.f47828a     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "Found closed reference %d for key %s (%d)"
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0054 }
            r1 = 0
            int r0 = java.lang.System.identityHashCode(r3)     // Catch:{ all -> 0x0054 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0054 }
            r2[r1] = r0     // Catch:{ all -> 0x0054 }
            r1 = 1
            java.lang.String r0 = r8.a()     // Catch:{ all -> 0x0054 }
            r2[r1] = r0     // Catch:{ all -> 0x0054 }
            r1 = 2
            int r0 = java.lang.System.identityHashCode(r8)     // Catch:{ all -> 0x0054 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0054 }
            r2[r1] = r0     // Catch:{ all -> 0x0054 }
            com.facebook.common.e.a.b(r5, r4, r2)     // Catch:{ all -> 0x0054 }
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0054 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            monitor-exit(r7)
            return r0
        L_0x004d:
            com.facebook.imagepipeline.j.e r0 = com.facebook.imagepipeline.j.e.a(r3)
            monitor-exit(r3)
            r3 = r0
            goto L_0x005a
        L_0x0054:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r0
        L_0x005a:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            monitor-exit(r7)
            return r3
        L_0x005f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.d.v.b(com.facebook.c.a.e):com.facebook.imagepipeline.j.e");
    }

    public final synchronized boolean c(e eVar) {
        MethodCollector.i(11334);
        i.a(eVar);
        if (!this.f47829b.containsKey(eVar)) {
            MethodCollector.o(11334);
            return false;
        }
        com.facebook.imagepipeline.j.e eVar2 = this.f47829b.get(eVar);
        synchronized (eVar2) {
            try {
                if (!com.facebook.imagepipeline.j.e.e(eVar2)) {
                    this.f47829b.remove(eVar);
                    a.b(f47828a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar2)), eVar.a(), Integer.valueOf(System.identityHashCode(eVar)));
                    return false;
                }
                MethodCollector.o(11334);
                return true;
            } finally {
                MethodCollector.o(11334);
            }
        }
    }

    public final boolean a(e eVar) {
        com.facebook.imagepipeline.j.e remove;
        MethodCollector.i(10840);
        i.a(eVar);
        synchronized (this) {
            try {
                remove = this.f47829b.remove(eVar);
            } catch (Throwable th) {
                MethodCollector.o(10840);
                throw th;
            }
        }
        if (remove == null) {
            MethodCollector.o(10840);
            return false;
        }
        try {
            return remove.a();
        } finally {
            remove.close();
            MethodCollector.o(10840);
        }
    }

    public final synchronized void a(e eVar, com.facebook.imagepipeline.j.e eVar2) {
        MethodCollector.i(10683);
        i.a(eVar);
        i.a(com.facebook.imagepipeline.j.e.e(eVar2));
        com.facebook.imagepipeline.j.e.d(this.f47829b.put(eVar, com.facebook.imagepipeline.j.e.a(eVar2)));
        b();
        MethodCollector.o(10683);
    }

    public final synchronized boolean b(e eVar, com.facebook.imagepipeline.j.e eVar2) {
        MethodCollector.i(11013);
        i.a(eVar);
        i.a(eVar2);
        i.a(com.facebook.imagepipeline.j.e.e(eVar2));
        com.facebook.imagepipeline.j.e eVar3 = this.f47829b.get(eVar);
        if (eVar3 == null) {
            MethodCollector.o(11013);
            return false;
        }
        com.facebook.common.h.a b2 = com.facebook.common.h.a.b(eVar3.f47989a);
        com.facebook.common.h.a b3 = com.facebook.common.h.a.b(eVar2.f47989a);
        if (!(b2 == null || b3 == null)) {
            try {
                if (b2.a() == b3.a()) {
                    this.f47829b.remove(eVar);
                    com.facebook.common.h.a.c(b3);
                    com.facebook.common.h.a.c(b2);
                    com.facebook.imagepipeline.j.e.d(eVar3);
                    b();
                    MethodCollector.o(11013);
                    return true;
                }
            } catch (Throwable th) {
                com.facebook.common.h.a.c(b3);
                com.facebook.common.h.a.c(b2);
                com.facebook.imagepipeline.j.e.d(eVar3);
                MethodCollector.o(11013);
                throw th;
            }
        }
        com.facebook.common.h.a.c(b3);
        com.facebook.common.h.a.c(b2);
        com.facebook.imagepipeline.j.e.d(eVar3);
        MethodCollector.o(11013);
        return false;
    }
}
