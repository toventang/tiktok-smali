package com.ss.android.ugc.aweme.aabplugin.core.b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.e.f;
import java.util.concurrent.ConcurrentHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final ConcurrentHashMap<String, f> f62457a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Integer> f62458b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(38434);
    }

    public static f a(String str) {
        return f62457a.get(str);
    }
}
