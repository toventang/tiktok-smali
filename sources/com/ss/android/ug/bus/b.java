package com.ss.android.ug.bus;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class, a> f61869a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(38031);
    }

    public static <T extends a> T a(Class<T> cls) {
        return (T) f61869a.get(cls);
    }

    public static <T extends a> void a(Class<T> cls, a aVar) {
        if (aVar != null) {
            f61869a.put(cls, aVar);
        }
    }
}
