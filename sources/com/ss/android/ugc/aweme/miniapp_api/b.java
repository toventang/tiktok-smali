package com.ss.android.ugc.aweme.miniapp_api;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.miniapp_api.model.a.a;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f109663c;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Boolean> f109664a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public a f109665b;

    static {
        Covode.recordClassIndex(70208);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(3773);
        if (f109663c == null) {
            synchronized (b.class) {
                try {
                    if (f109663c == null) {
                        f109663c = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3773);
                    throw th;
                }
            }
        }
        b bVar = f109663c;
        MethodCollector.o(3773);
        return bVar;
    }
}
