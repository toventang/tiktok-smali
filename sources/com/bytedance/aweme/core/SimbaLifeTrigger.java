package com.bytedance.aweme.core;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.aweme.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class SimbaLifeTrigger implements au {

    /* renamed from: a  reason: collision with root package name */
    public final List<Long> f25794a = new ArrayList();

    static {
        Covode.recordClassIndex(15061);
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
    }

    @v(a = i.a.ON_START)
    public final void onStart() {
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        Collection<ArrayList<a>> values;
        MethodCollector.i(5123);
        List<Long> list = this.f25794a;
        l.c(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ConcurrentHashMap<com.bytedance.aweme.b.a.a, ArrayList<a>> concurrentHashMap = a.f25799e.get(Long.valueOf(it.next().longValue()));
            if (!(concurrentHashMap == null || (values = concurrentHashMap.values()) == null)) {
                for (T<a> t : values) {
                    l.a((Object) t, "");
                    synchronized (t) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            for (a aVar : t) {
                                if (aVar.a() == com.bytedance.aweme.b.a.a.ATFIRST) {
                                    a.f25800f.remove(aVar);
                                }
                                arrayList.add(aVar);
                            }
                            t.removeAll(arrayList);
                        } catch (Throwable th) {
                            MethodCollector.o(5123);
                            throw th;
                        }
                    }
                }
            }
        }
        MethodCollector.o(5123);
    }
}
