package com.bytedance.frameworks.baselib.network.http.cronet.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class j extends Observable {

    /* renamed from: a  reason: collision with root package name */
    private static volatile j f29083a;

    static {
        Covode.recordClassIndex(17029);
    }

    public static j a() {
        MethodCollector.i(891);
        if (f29083a == null) {
            synchronized (j.class) {
                try {
                    if (f29083a == null) {
                        f29083a = new j();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(891);
                    throw th;
                }
            }
        }
        j jVar = f29083a;
        MethodCollector.o(891);
        return jVar;
    }

    private void a(Map<String, Object> map) {
        setChanged();
        notifyObservers(map);
    }

    public final void a(String str, long j2, long j3, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("sent_bytes", Long.valueOf(j2));
        hashMap.put("received_bytes", Long.valueOf(j3));
        hashMap.put("content_type", str2);
        hashMap.put("request_log", str3);
        a(hashMap);
    }
}
