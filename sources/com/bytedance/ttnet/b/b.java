package com.bytedance.ttnet.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class b extends Observable {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f44540a = "";

    /* renamed from: b  reason: collision with root package name */
    public static volatile String f44541b = "";

    /* renamed from: c  reason: collision with root package name */
    public static volatile String f44542c = "";

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f44543d;

    static {
        Covode.recordClassIndex(27259);
    }

    public static b a() {
        MethodCollector.i(6945);
        if (f44543d == null) {
            synchronized (b.class) {
                try {
                    if (f44543d == null) {
                        f44543d = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6945);
                    throw th;
                }
            }
        }
        b bVar = f44543d;
        MethodCollector.o(6945);
        return bVar;
    }

    private void a(Map<String, Object> map) {
        setChanged();
        notifyObservers(map);
    }

    public final void a(String str, String str2, String str3) {
        f44540a = str;
        f44541b = str2;
        f44542c = str3;
        HashMap hashMap = new HashMap();
        hashMap.put("store_idc", str);
        hashMap.put("store_region", str2);
        hashMap.put("region_source", str3);
        a(hashMap);
    }
}
