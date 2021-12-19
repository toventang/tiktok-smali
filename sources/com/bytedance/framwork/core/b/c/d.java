package com.bytedance.framwork.core.b.c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, c> f29438a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, b> f29439b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(17150);
    }

    public static c a(String str) {
        return f29438a.get(str);
    }
}
