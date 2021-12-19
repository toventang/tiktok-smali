package com.bytedance.geckox.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Map<String, List<a>>> f29856a;

    /* renamed from: b  reason: collision with root package name */
    private static c f29857b;

    static {
        Covode.recordClassIndex(17319);
    }

    private c() {
        f29856a = new ConcurrentHashMap();
    }

    public static c a() {
        MethodCollector.i(8888);
        if (f29857b == null) {
            synchronized (c.class) {
                try {
                    if (f29857b == null) {
                        f29857b = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8888);
                    throw th;
                }
            }
        }
        c cVar = f29857b;
        MethodCollector.o(8888);
        return cVar;
    }

    public static List<a> a(String str, String str2) {
        Map<String, List<a>> map = f29856a.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public final synchronized List<a> b(String str, String str2) {
        MethodCollector.i(9262);
        Map<String, List<a>> map = f29856a.get(str);
        if (map != null) {
            List<a> remove = map.remove(str2);
            MethodCollector.o(9262);
            return remove;
        }
        MethodCollector.o(9262);
        return null;
    }

    public final synchronized void a(String str, String str2, a aVar) {
        List<a> synchronizedList;
        MethodCollector.i(9072);
        Map<String, List<a>> map = f29856a.get(str);
        if (map != null) {
            synchronizedList = map.get(str2);
            if (synchronizedList == null) {
                synchronizedList = Collections.synchronizedList(new ArrayList());
            }
        } else {
            map = new ConcurrentHashMap<>();
            synchronizedList = Collections.synchronizedList(new ArrayList());
        }
        synchronizedList.add(aVar);
        map.put(str2, synchronizedList);
        f29856a.put(str, map);
        MethodCollector.o(9072);
    }
}
