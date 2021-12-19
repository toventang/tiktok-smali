package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class ds {

    /* renamed from: a  reason: collision with root package name */
    public static final ds f142837a = new ds();

    private ds() {
    }

    static {
        Covode.recordClassIndex(93447);
    }

    public static final String a(Map<String, ? extends Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject.toString();
    }

    public static final ConcurrentHashMap<String, Object> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                l.b(next, "");
                Object obj = jSONObject.get(next);
                l.b(obj, "");
                concurrentHashMap.put(next, obj);
            }
            return concurrentHashMap;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
