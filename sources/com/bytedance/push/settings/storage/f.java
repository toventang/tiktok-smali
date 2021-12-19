package com.bytedance.push.settings.storage;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class f {

    /* renamed from: a  reason: collision with root package name */
    static Map<String, e> f42344a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(25865);
        a aVar = new a();
        f42344a.put(aVar.a(), aVar);
    }
}
