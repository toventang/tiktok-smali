package com.ss.android.ugc.aweme.app.f;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Object> f66728a = new HashMap<>();

    static {
        Covode.recordClassIndex(41072);
    }

    public final JSONObject a() {
        try {
            return new JSONObject(this.f66728a);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static c a(JSONObject jSONObject) {
        c cVar = new c();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    cVar.a(next, jSONObject.getString(next));
                } catch (JSONException unused) {
                }
            }
        }
        return cVar;
    }

    public final c a(String str, Boolean bool) {
        this.f66728a.put(str, bool);
        return this;
    }

    public final c a(String str, Double d2) {
        this.f66728a.put(str, d2);
        return this;
    }

    public final c a(String str, Float f2) {
        this.f66728a.put(str, f2);
        return this;
    }

    public final c a(String str, Integer num) {
        this.f66728a.put(str, num);
        return this;
    }

    public final c a(String str, Long l2) {
        this.f66728a.put(str, l2);
        return this;
    }

    public final c a(String str, String str2) {
        this.f66728a.put(str, str2);
        return this;
    }
}
