package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class bd {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Long> f37892a = new ConcurrentHashMap(20);

    static {
        Covode.recordClassIndex(22733);
    }

    public final String toString() {
        return "TraceStruct{innerStorage=" + this.f37892a + '}';
    }

    public final void a(int i2, long j2) {
        this.f37892a.put(Integer.valueOf(i2), Long.valueOf(j2));
    }
}
