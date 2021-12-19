package com.ss.android.ugc.aweme.feed.param;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f93689a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(59617);
    }

    public static HashMap<String, String> a(String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap<String, String> hashMap = new HashMap<>();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            keys.remove();
            l.b(next, "");
            l.b(optString, "");
            hashMap.put(next, optString);
        }
        return hashMap;
    }
}
