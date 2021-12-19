package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.firebase.b.a;
import com.google.firebase.b.b;
import com.google.firebase.b.c;
import com.google.firebase.b.d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public class q implements c, d {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> f54339a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue<a<?>> f54340b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f54341c;

    static {
        Covode.recordClassIndex(33737);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Queue<a<?>> queue;
        MethodCollector.i(4520);
        synchronized (this) {
            try {
                queue = this.f54340b;
                if (queue != null) {
                    this.f54340b = null;
                } else {
                    queue = null;
                }
            } finally {
                MethodCollector.o(4520);
            }
        }
        if (queue != null) {
            for (a<?> aVar : queue) {
                a(aVar);
            }
        }
    }

    q(Executor executor) {
        this.f54341c = executor;
    }

    private synchronized Set<Map.Entry<b<Object>, Executor>> b(a<?> aVar) {
        MethodCollector.i(4458);
        ConcurrentHashMap<b<Object>, Executor> concurrentHashMap = this.f54339a.get(aVar.f54293a);
        if (concurrentHashMap == null) {
            Set<Map.Entry<b<Object>, Executor>> emptySet = Collections.emptySet();
            MethodCollector.o(4458);
            return emptySet;
        }
        Set<Map.Entry<b<Object>, Executor>> entrySet = concurrentHashMap.entrySet();
        MethodCollector.o(4458);
        return entrySet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r3 = b(r6).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r3.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2 = r3.next();
        r2.getValue().execute(new com.google.firebase.components.r(r2, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(4417);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.google.firebase.b.a<?> r6) {
        /*
            r5 = this;
            r4 = 4417(0x1141, float:6.19E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            com.google.firebase.components.u.a(r6)
            monitor-enter(r5)
            java.util.Queue<com.google.firebase.b.a<?>> r0 = r5.f54340b     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0015
            r0.add(r6)     // Catch:{ all -> 0x003d }
            monitor-exit(r5)     // Catch:{ all -> 0x003d }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0015:
            monitor-exit(r5)
            java.util.Set r0 = r5.b(r6)
            java.util.Iterator r3 = r0.iterator()
        L_0x001e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getValue()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            com.google.firebase.components.r r0 = new com.google.firebase.components.r
            r0.<init>(r2, r6)
            r1.execute(r0)
            goto L_0x001e
        L_0x0039:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x003d:
            r0 = move-exception
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.q.a(com.google.firebase.b.a):void");
    }

    @Override // com.google.firebase.b.d
    public final <T> void a(Class<T> cls, b<? super T> bVar) {
        a(cls, this.f54341c, bVar);
    }

    @Override // com.google.firebase.b.d
    public final synchronized <T> void b(Class<T> cls, b<? super T> bVar) {
        MethodCollector.i(4517);
        u.a(cls);
        u.a(bVar);
        if (!this.f54339a.containsKey(cls)) {
            MethodCollector.o(4517);
            return;
        }
        ConcurrentHashMap<b<Object>, Executor> concurrentHashMap = this.f54339a.get(cls);
        concurrentHashMap.remove(bVar);
        if (concurrentHashMap.isEmpty()) {
            this.f54339a.remove(cls);
        }
        MethodCollector.o(4517);
    }

    @Override // com.google.firebase.b.d
    public final synchronized <T> void a(Class<T> cls, Executor executor, b<? super T> bVar) {
        MethodCollector.i(4508);
        u.a(cls);
        u.a(bVar);
        u.a(executor);
        if (!this.f54339a.containsKey(cls)) {
            this.f54339a.put(cls, new ConcurrentHashMap<>());
        }
        this.f54339a.get(cls).put(bVar, executor);
        MethodCollector.o(4508);
    }
}
