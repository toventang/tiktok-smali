package com.ss.ttvideoengine.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    static int f153027a = -1;

    /* renamed from: b  reason: collision with root package name */
    static String f153028b;

    /* renamed from: d  reason: collision with root package name */
    private static f f153029d;

    /* renamed from: c  reason: collision with root package name */
    ConcurrentHashMap<String, a> f153030c = new ConcurrentHashMap<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f153031a;

        /* renamed from: b  reason: collision with root package name */
        public long f153032b;

        static {
            Covode.recordClassIndex(101694);
        }

        a() {
        }
    }

    static {
        Covode.recordClassIndex(101693);
    }

    private f() {
    }

    public static f a() {
        MethodCollector.i(11266);
        if (f153029d == null) {
            synchronized (f.class) {
                try {
                    if (f153029d == null) {
                        f153029d = new f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11266);
                    throw th;
                }
            }
        }
        f fVar = f153029d;
        MethodCollector.o(11266);
        return fVar;
    }

    public final void a(String str, a aVar) {
        ConcurrentHashMap<String, a> concurrentHashMap = this.f153030c;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, aVar);
        }
    }
}
