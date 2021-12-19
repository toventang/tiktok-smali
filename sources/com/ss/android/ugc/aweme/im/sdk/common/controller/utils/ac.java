package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    private static long f102359a;

    /* renamed from: b  reason: collision with root package name */
    private static long f102360b;

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, Long> f102361c = new HashMap(10);

    static {
        Covode.recordClassIndex(65521);
    }

    public static void a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        f102359a = currentTimeMillis;
        f102361c.put(str, Long.valueOf(currentTimeMillis));
    }

    public static void b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        f102360b = currentTimeMillis;
        String.valueOf(currentTimeMillis - f102361c.get(str).longValue());
        f102359a = f102360b;
    }
}
