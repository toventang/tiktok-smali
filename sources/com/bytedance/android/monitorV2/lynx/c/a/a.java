package com.bytedance.android.monitorV2.lynx.c.a;

import com.bytedance.android.monitorV2.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, List<b>> f24088a = new WeakHashMap();

    static {
        Covode.recordClassIndex(14196);
    }

    public final List<b> a(String str) {
        List<b> remove;
        MethodCollector.i(14506);
        synchronized (this) {
            try {
                remove = this.f24088a.remove(str);
            } finally {
                MethodCollector.o(14506);
            }
        }
        return remove;
    }

    public final void a(String str, b bVar) {
        MethodCollector.i(14505);
        synchronized (this) {
            try {
                List<b> list = this.f24088a.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(bVar);
                this.f24088a.put(str, list);
            } finally {
                MethodCollector.o(14505);
            }
        }
    }
}
