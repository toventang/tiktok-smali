package com.ss.android.ugc.awemepushlib.interaction;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.awemepushapi.a;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    private static f f145440b;

    /* renamed from: a  reason: collision with root package name */
    private a f145441a;

    static {
        Covode.recordClassIndex(95099);
    }

    public static a a() {
        f fVar = f145440b;
        if (fVar != null) {
            return fVar.f145441a;
        }
        throw new IllegalStateException("Please call holdService to initialize");
    }

    private f(a aVar) {
        this.f145441a = aVar;
    }

    static synchronized void a(a aVar) {
        synchronized (f.class) {
            MethodCollector.i(8041);
            if (aVar != null) {
                f fVar = f145440b;
                if (fVar == null) {
                    f145440b = new f(aVar);
                    MethodCollector.o(8041);
                    return;
                }
                fVar.f145441a = aVar;
                MethodCollector.o(8041);
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Please use MainInterfaceForPush instance initialization");
            MethodCollector.o(8041);
            throw illegalArgumentException;
        }
    }
}
