package com.bytedance.apm.k;

import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.q.c;
import com.bytedance.apm.q.h;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

public class g {

    /* renamed from: c  reason: collision with root package name */
    private static volatile g f25107c;

    /* renamed from: a  reason: collision with root package name */
    public CopyOnWriteArraySet<String> f25108a = new CopyOnWriteArraySet<>();

    /* renamed from: b  reason: collision with root package name */
    public ConcurrentHashMap<String, String> f25109b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(14657);
    }

    private g() {
    }

    public static g a() {
        if (f25107c == null) {
            synchronized (g.class) {
                if (f25107c == null) {
                    f25107c = new g();
                }
            }
        }
        return f25107c;
    }

    public final String b() {
        String a2 = h.a(this.f25108a.toArray(), "#");
        if (TextUtils.isEmpty(a2)) {
            return ActivityLifeObserver.getInstance().getTopActivityClassName();
        }
        return a2;
    }

    public final JSONObject a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f25109b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (z) {
                c.a.f25246a.a(jSONObject, false);
                c.a.f25246a.b(jSONObject, false);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
