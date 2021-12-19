package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class o {

    /* renamed from: d  reason: collision with root package name */
    private static final List<o> f159817d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    Object f159818a;

    /* renamed from: b  reason: collision with root package name */
    v f159819b;

    /* renamed from: c  reason: collision with root package name */
    o f159820c;

    static {
        Covode.recordClassIndex(106487);
    }

    static void a(o oVar) {
        MethodCollector.i(4185);
        oVar.f159818a = null;
        oVar.f159819b = null;
        oVar.f159820c = null;
        List<o> list = f159817d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(oVar);
                }
            } finally {
                MethodCollector.o(4185);
            }
        }
    }

    private o(Object obj, v vVar) {
        this.f159818a = obj;
        this.f159819b = vVar;
    }

    static o a(v vVar, Object obj) {
        MethodCollector.i(4069);
        List<o> list = f159817d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size > 0) {
                    o remove = list.remove(size - 1);
                    remove.f159818a = obj;
                    remove.f159819b = vVar;
                    remove.f159820c = null;
                    return remove;
                }
                o oVar = new o(obj, vVar);
                MethodCollector.o(4069);
                return oVar;
            } finally {
                MethodCollector.o(4069);
            }
        }
    }
}
