package com.facebook.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    static final ConcurrentHashMap<String, JSONObject> f48509a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(29263);
    }

    public static JSONObject a(String str) {
        return f48509a.get(str);
    }
}
