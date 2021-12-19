package com.bytedance.sdk.bdlynx.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.bdlynx.a.e.c;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f43661a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<? extends c>, c> f43662b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, Object> f43663c = new LinkedHashMap();

    private a() {
    }

    static {
        Covode.recordClassIndex(26718);
    }

    public final synchronized <T extends c> T a(Class<T> cls) {
        T t;
        MethodCollector.i(753);
        l.c(cls, "");
        c cVar = f43662b.get(cls);
        if (!(cVar instanceof c)) {
            cVar = null;
        }
        t = (T) cVar;
        MethodCollector.o(753);
        return t;
    }
}
