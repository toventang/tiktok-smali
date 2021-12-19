package com.ss.android.ugc.aweme.d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.d.e;
import h.f.b.l;
import h.p;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<e.a> f79338a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<ConcurrentHashMap<Integer, LinkedList<View>>> f79339b;

    static {
        Covode.recordClassIndex(49252);
    }

    public final void run() {
        MethodCollector.i(3252);
        WeakReference<e.a> weakReference = this.f79338a;
        ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap = null;
        e.a aVar = weakReference != null ? weakReference.get() : null;
        WeakReference<ConcurrentHashMap<Integer, LinkedList<View>>> weakReference2 = this.f79339b;
        if (weakReference2 != null) {
            concurrentHashMap = weakReference2.get();
        }
        if (!(aVar == null || concurrentHashMap == null)) {
            for (p<Integer, Integer> pVar : aVar.f79336a) {
                Integer first = pVar.getFirst();
                int intValue = pVar.getSecond().intValue();
                int intValue2 = first.intValue();
                LinkedList<View> linkedList = concurrentHashMap.get(Integer.valueOf(intValue2));
                if (linkedList != null) {
                    if (linkedList.size() > intValue) {
                        synchronized (linkedList) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= intValue) {
                                    break;
                                }
                                try {
                                    if (linkedList.poll() == null) {
                                        break;
                                    }
                                    i2++;
                                } catch (Throwable th) {
                                    MethodCollector.o(3252);
                                    throw th;
                                }
                            }
                        }
                    } else {
                        concurrentHashMap.remove(Integer.valueOf(intValue2));
                    }
                }
            }
        }
        MethodCollector.o(3252);
    }

    public f(e.a aVar, ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap) {
        l.c(aVar, "");
        l.c(concurrentHashMap, "");
        this.f79338a = new WeakReference<>(aVar);
        this.f79339b = new WeakReference<>(concurrentHashMap);
    }
}
