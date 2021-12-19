package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.WeakHashMap;

public class h {

    /* renamed from: b  reason: collision with root package name */
    private static volatile h f55888b;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<j, g> f55889a = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(34941);
    }

    private h() {
    }

    public static h a() {
        MethodCollector.i(13558);
        if (f55888b == null) {
            synchronized (h.class) {
                try {
                    if (f55888b == null) {
                        f55888b = new h();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13558);
                    throw th;
                }
            }
        }
        h hVar = f55888b;
        MethodCollector.o(13558);
        return hVar;
    }

    public final void a(j jVar) {
        g gVar = this.f55889a.get(jVar);
        if (gVar != null) {
            gVar.c();
        }
        this.f55889a.remove(jVar);
    }
}
