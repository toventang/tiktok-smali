package com.facebook.a.i;

import android.content.SharedPreferences;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.facebook.a.b.a.f;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ad;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Map<String, String> f46839a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    static SharedPreferences f46840b;

    /* renamed from: c  reason: collision with root package name */
    static final AtomicBoolean f46841c = new AtomicBoolean(false);

    b() {
    }

    static {
        Covode.recordClassIndex(28527);
    }

    static String a(String str) {
        if (a.a(b.class)) {
            return null;
        }
        try {
            Map<String, String> map = f46839a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        } catch (Throwable th) {
            a.a(th, b.class);
            return null;
        }
    }

    static String a(View view, String str) {
        if (a.a(b.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = f.a(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return ad.b(jSONObject.toString());
        } catch (Throwable th) {
            a.a(th, b.class);
            return null;
        }
    }
}
