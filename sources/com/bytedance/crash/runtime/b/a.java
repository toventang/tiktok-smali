package com.bytedance.crash.runtime.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.c;
import com.bytedance.crash.runtime.e;
import com.bytedance.crash.util.n;
import com.bytedance.crash.util.v;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    protected static HashMap<String, a> f27883a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f27884b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f27885c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f27886d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27887e;

    /* renamed from: f  reason: collision with root package name */
    private final String f27888f;

    static {
        Covode.recordClassIndex(16323);
    }

    public static JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, a> entry : f27883a.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            n.a(jSONObject, entry.getKey(), entry.getValue().f27884b);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public long a() {
        return Long.decode(n.b(this.f27884b, "over_all", "get_settings_interval")).longValue() * 1000;
    }

    public static a a(Object obj) {
        return e(c.c(obj));
    }

    public static JSONObject b(String str) {
        a aVar = f27883a.get(str);
        if (aVar != null) {
            return aVar.f27884b;
        }
        return null;
    }

    private static boolean b(JSONObject jSONObject) {
        if (jSONObject == null || n.a(jSONObject, 0, "exception_modules", "exception", "enable_upload") != 1) {
            return false;
        }
        return true;
    }

    public static boolean c(String str) {
        a aVar = f27883a.get(str);
        if (aVar == null || aVar.f27887e) {
            return true;
        }
        return false;
    }

    public static long d(String str) {
        a aVar = f27883a.get(str);
        if (aVar == null) {
            return 3600000;
        }
        try {
            return aVar.a();
        } catch (Throwable unused) {
            return 3600000;
        }
    }

    private static a e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f27883a.get(str);
    }

    private void a(JSONObject jSONObject) {
        this.f27884b = jSONObject;
        this.f27887e = b(jSONObject);
    }

    public static boolean a(String str) {
        if (f27883a.get(str) != null) {
            return true;
        }
        return false;
    }

    public a(JSONObject jSONObject, String str) {
        this.f27888f = str;
        a(jSONObject);
        f27883a.put(str, this);
        v.a("after update aid ".concat(String.valueOf(str)));
    }

    public static void a(String str, JSONObject jSONObject) {
        a aVar = f27883a.get(str);
        if (aVar != null) {
            aVar.a(jSONObject);
        } else {
            new e(jSONObject, str);
        }
    }
}
