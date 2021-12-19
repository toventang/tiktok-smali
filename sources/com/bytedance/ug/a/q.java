package com.bytedance.ug.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f45754a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, p> f45755b = new HashMap();

    static {
        Covode.recordClassIndex(27839);
    }

    public static j a(f fVar) {
        MethodCollector.i(7191);
        if (fVar != null) {
            synchronized (f45754a) {
                try {
                    Map<String, p> map = f45755b;
                    if (map.containsKey(fVar.f45730b)) {
                        return map.get(fVar.f45730b);
                    }
                    p pVar = new p(fVar);
                    map.put(fVar.f45730b, pVar);
                    MethodCollector.o(7191);
                    return pVar;
                } finally {
                    MethodCollector.o(7191);
                }
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("options is null");
            MethodCollector.o(7191);
            throw illegalArgumentException;
        }
    }
}
