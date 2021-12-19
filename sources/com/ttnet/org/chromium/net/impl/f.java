package com.ttnet.org.chromium.net.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, CronetUrlRequest> f155687a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(103493);
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f155687a.remove(str);
        }
    }

    public static void a(String str, CronetUrlRequest cronetUrlRequest) {
        if (!TextUtils.isEmpty(str)) {
            f155687a.put(str, cronetUrlRequest);
        }
    }
}
