package com.bytedance.webx;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.g.a;
import com.bytedance.webx.g.b;
import java.util.HashMap;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, a> f45993a = new HashMap<>();

    private g() {
    }

    static {
        Covode.recordClassIndex(28128);
    }

    private static a a(String str) {
        MethodCollector.i(9889);
        a aVar = f45993a.get(str);
        if (aVar != null) {
            MethodCollector.o(9889);
            return aVar;
        }
        synchronized (g.class) {
            try {
                a aVar2 = f45993a.get(str);
                if (aVar2 != null) {
                    return aVar2;
                }
                b bVar = new b(str);
                HashMap<String, a> hashMap = new HashMap<>(f45993a);
                hashMap.put(str, bVar);
                f45993a = hashMap;
                MethodCollector.o(9889);
                return bVar;
            } finally {
                MethodCollector.o(9889);
            }
        }
    }

    public static <T extends f> T a(String str, Class<T> cls) {
        return (T) a(str).a(cls);
    }
}
