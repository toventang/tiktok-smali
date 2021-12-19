package com.ss.ugc.aweme.performance.core.monitor;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.aweme.performance.core.monitor.b.c;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, c> f153334a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static ConcurrentHashMap<String, Integer> f153335b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static int f153336c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final b f153337d = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(101809);
    }

    public static c a(String str) {
        l.c(str, "");
        return f153334a.get(str);
    }
}
